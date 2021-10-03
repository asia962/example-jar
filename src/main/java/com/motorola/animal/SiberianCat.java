package com.motorola.animal;

public class SiberianCat extends Cat {

    @Override
    public void eat() {

    }

    @Override
    public SiberianCat giveBirth() {
        return new SiberianCat();
    }
}
