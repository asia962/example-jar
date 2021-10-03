package com.motorola;

import com.motorola.greeter.Greeter;
import com.motorola.greeter.TimeGreeter;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.function.Supplier;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterTest {



    @Test
    public void saysGoodMorningAtMidnight() {
        LocalTime time = LocalTime.of(12, 0);
        Greeter greeter = new TimeGreeter(()->time);
        String result = greeter.welcomeGuest();
        assertEquals("Good morning!", result);
    }

    @Test
    public void saysGoodEveningBeforeMidnight() {
        LocalTime time = LocalTime.of(23, 59);
        Greeter greeter = new TimeGreeter(()->time);
        String result = greeter.welcomeGuest();
        assertEquals("Good evening!", result);
    }

    @Test
    public void saysGoodMorningBeforeNoon() {

        LocalTime time = LocalTime.of(9, 59);
        Greeter greeter = new TimeGreeter(()->time);
        String result = greeter.welcomeGuest();
        assertEquals("Good morning!", result);
    }

    @Test
    public void saysGoodMorningAtNoon() {
        LocalTime time = LocalTime.of(12, 00);
        Greeter greeter = new TimeGreeter(()->time);

        String result = greeter.welcomeGuest();
        assertEquals("Good morning!", result);
    }

    @Test
    public void saysGoodAfternoonAfterNoon() {

        LocalTime time = LocalTime.of(15, 59);
        Greeter greeter = new TimeGreeter(()->time);
        String result = greeter.welcomeGuest();
        assertEquals("Good afternoon!", result);
    }

    @Test
    public void saysGoodEveningAfter18() {

        LocalTime time = LocalTime.of(23, 59);
        Greeter greeter = new TimeGreeter(()->time);
        String result = greeter.welcomeGuest();
        assertEquals("Good evening!", result);
    }

    @Test
    public void throwsIllegalArgumentException() {
        LocalTime time = null;
        Greeter greeter = new TimeGreeter(()->time);
        assertThrows(IllegalArgumentException.class, () -> greeter.welcomeGuest());
    }
}