package com.company;

public class Avion implements Volador{

    @Override
    public void volar() {
        System.out.println("El avión acelera y levanta el tren de aterrizaje");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión despliega el tren de aterrizaje");

    }
}
