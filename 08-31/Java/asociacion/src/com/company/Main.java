package com.company;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Maria");
        persona1.setApellido("Lopez");
        persona1.setEdad(34);

        Domicilio domicilio1 = new Domicilio();
        domicilio1.setCalle("Ponce");
        domicilio1.setNumero(231);

        persona1.setRefDomicilio(domicilio1);

        Persona persona2 = new Persona("Juanita","Perez",23);

        System.out.println(persona1);

    }
}
