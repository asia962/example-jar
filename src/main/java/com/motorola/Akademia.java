package com.motorola;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;

public class Akademia extends Object {

    private String name;
    public BigDecimal price;
    protected static int costam;

    private String hello() {
        System.out.println("xxxxxxx");
        throw new RuntimeException();
//        return "aaaa";
    }


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<Akademia> akademiaClass = Akademia.class;

        System.out.println(akademiaClass.getSimpleName());
        System.out.println(akademiaClass.getName());
        System.out.println(akademiaClass.getCanonicalName());

        System.out.println(Arrays.toString(akademiaClass.getMethods()));
        System.out.println(Arrays.toString(akademiaClass.getDeclaredFields()));
        System.out.println(Arrays.toString(akademiaClass.getConstructors()));

        System.out.println(akademiaClass);

        System.out.println("Cześć!");

        Method hello = akademiaClass.getMethod("hello");

        Akademia akademia = new Akademia();
        Object invoke = hello.invoke(akademia);
        System.out.println(invoke);

        akademia.hello();

    }
}
