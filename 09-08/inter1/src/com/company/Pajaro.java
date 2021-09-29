package com.company;

public class Pajaro implements Volador{

    @Override
    public void volar() {
        System.out.println("El pajaro empieza a aletear");
    }

    @Override
    public void aterrizar() {
        System.out.println("El pajaro apoya las patitas");

    }
}