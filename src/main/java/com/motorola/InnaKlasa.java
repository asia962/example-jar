package com.motorola;


public class InnaKlasa {
    public static void main(String[] args)   {
        Object innaKlasa = new InnaKlasa();
        compareToCostam(innaKlasa);
        innaKlasa = new Object();
        compareToCostam(innaKlasa);
    }


    @Override
    public boolean equals(Object other) {
        System.out.println("Object version");
        return other == this;
    }

    public static void compareToCostam(Object o) {
        System.out.println(o.equals("Cośtam"));
    }

}
