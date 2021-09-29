package com.company;

public abstract class Persona {

//  protected: atributos publicos para hijos y privados para demas
    protected String nombre;
    protected String apellido;

    public Persona(){
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void comer(){
        System.out.println("Las personas comen por la boca");
    }

    public abstract void estudiar();

}
