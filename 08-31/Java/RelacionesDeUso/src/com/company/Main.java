package com.company;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Ana", "Banana", 23);
        Domicilio d1 = new Domicilio("Ponce", 262);
        p1.usarDomicilio(d1);
    }
}