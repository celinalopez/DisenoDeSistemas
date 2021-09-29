package com.company;

public class Main {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("pepe","Sanchez",23455);
        Profesor profesor1 = new Profesor("Alberto", "Cortez", 2);
        alumno1.estudiar(); //<
        alumno1.comer(); // Herencia
        alumno1.soyElAlumno(); // Propio de la clase

        profesor1.estudiar();
        alumno1.comer();
        profesor1.soyElProfe();
    }
}
