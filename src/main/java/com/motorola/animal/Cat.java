package com.motorola.animal;

import java.util.Random;

class Cat extends Animal{



    public class Costam {

        public void test() {
            System.out.println(Cat.this);
        }
    }

    public static class Costam2 {
        public void test() {
//            System.out.println(Cat.this);
        }
    }


    String a = "aaaaaaa";
    static String  b = "bbbbbbb";

    static {

        b = "a aaa";
        b+="ccccc";

    }

    {
        new Costam();
        a = "xxxxx";


    }

    @Override
    public void eat() throws NietolerancjaLaktozy {
        if (new Random().nextBoolean()) {
            throw new NietolerancjaLaktozy();
        }
        System.out.println("pije mleczko");
    }

    @Override
    public Cat giveBirth() {
        return new Cat();
    }
}
