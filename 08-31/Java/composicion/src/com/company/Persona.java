package com.company;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Domicilio refDomicilio;

    public Persona() {
        refDomicilio = new Domicilio();
    }

    public Persona(String nombre, String apellido, int edad, String calle, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        refDomicilio = new Domicilio(calle, numero);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Domicilio getRefDomicilio() {
        return refDomicilio;
    }

    public void setRefDomicilio(Domicilio refDomicilio) {
        this.refDomicilio = refDomicilio;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad + '\'' +
                ", refDomicilio='" + refDomicilio.getCalle() + " "+
                    refDomicilio.getNumero() + '\'' +
                '}';
    }
}

