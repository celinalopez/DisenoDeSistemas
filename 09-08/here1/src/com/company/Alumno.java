package com.company;

public class Alumno extends Persona{

    private int legajo;

    public Alumno(String nombre, String apellido, int legajo) {
        super(nombre, apellido);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public void estudiar() {
        System.out.println("El alumno estudia 4 horas");
    }

    public void soyElAlumno(){
        System.out.println("Soy el alumno");
    }

}
