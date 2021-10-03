package com.motorola;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TimeGreeterTest {

    @Test
    void saysGoodMorningAtMidnight() {
        Greeter greeter = new TimeGreeter(() -> LocalTime.of(0, 0));
        String result = greeter.welcomeGuest();
        assertEquals("Good morning!", result);
    }

    @Test
    void saysGoodEveningBeforeMidnight() {
        Greeter greeter = new TimeGreeter(() -> LocalTime.of(23, 59));
        String result = greeter.welcomeGuest();
        assertEquals("Good evening!", result);
    }

    @Test
    void saysGoodMorningBeforeNoon() {
        Greeter greeter = new TimeGreeter(() -> LocalTime.of(9, 0));
        String result = greeter.welcomeGuest();
        assertEquals("Good morning!", result);
    }

    @Test
    void saysGoodMorningAtNoon() {
        Greeter greeter = new TimeGreeter(() -> LocalTime.of(12, 0));
        String result = greeter.welcomeGuest();
        assertEquals("Good morning!", result);
    }

    @Test
    void saysGoodAfternoonAfterNoon() {
        Greeter greeter = new TimeGreeter(() -> LocalTime.of(14, 0));
        String result = greeter.welcomeGuest();
        assertEquals("Good afternoon!", result);
    }

    @Test
    void saysGoodEveningAfter18() {
        Greeter greeter = new TimeGreeter(() -> LocalTime.of(21, 0));
        String result = greeter.welcomeGuest();
        assertEquals("Good evening!", result);
    }

    @Test
    void throwsIllegalArgumentException() {
        Greeter greeter = new TimeGreeter(() -> null);
        assertThrows(IllegalArgumentException.class, greeter::welcomeGuest);
    }
}