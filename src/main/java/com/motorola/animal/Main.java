package com.motorola.animal;

import java.util.*;

public class Main {

    public static void main(String[] args) throws ProblemZywieniowy {


        System.out.println("\u0041".length());

        Cat cat = new Cat();
        Cat.Costam costam =  cat.new Costam();

        costam.test();

        Cat.Costam2 costam2 =  new Cat.Costam2();


        System.out.println("Metoda main..... 1");

        List<Animal> animals = Arrays.asList(new Dog(), new Cat());

        System.out.println("Metoda main..... 2");

        for (Animal animal : animals) {

            System.out.println("Metoda main z " + animal);
            animal.eat();

        }

        System.out.println("Koniec metody main");
    }
}
