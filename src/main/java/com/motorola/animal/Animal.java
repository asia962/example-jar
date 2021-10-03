package com.motorola.animal;

import java.io.IOException;

public abstract class Animal {

    protected void eat() throws ProblemZywieniowy {
        System.out.println("Jem co mi dadzą...");
    }

    private String eat(String food) throws IOException {
        System.out.println("Jem co mi dadzą...");
        return null;
    }

    public abstract Animal giveBirth();
}
