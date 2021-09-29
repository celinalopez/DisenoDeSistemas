package com.company;

public class Superman implements Volador{

    @Override
    public void volar() {
        System.out.println("Superman empieza a volar");
    }

    @Override
    public void aterrizar() {
        System.out.println("Superman aterriza");

    }
}