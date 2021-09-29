package com.company;

public class Main {

    public static void main(String[] args) {

//  Creamos un objeto con el constructor vacio
        Persona persona1 = new Persona();
        persona1.setNombre("Maria");
        persona1.setApellido("Lopez");
        persona1.setEdad(34);
        persona1.getRefDomicilio().setCalle("Ponce");
        persona1.getRefDomicilio().setNumero(234);
        /*Domicilio d1 = new Domicilio();
        persona1.setRefDomicilio(d1);*/
        System.out.println(persona1);

//  Creamos un objeto con el constructor cargado
        Persona persona2 = new Persona("Juanita","Perez",23, "Aristides", 654);
        System.out.println(persona2);


    }
}
