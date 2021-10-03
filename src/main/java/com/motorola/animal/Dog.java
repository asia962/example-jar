package com.motorola.animal;

public class Dog extends Animal {

    public void eat() {
        System.out.println("Jem kość");
    }

    @Override
    public Animal giveBirth() {
        return new Dog();
    }
}
