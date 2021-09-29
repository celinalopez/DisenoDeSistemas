package com.company;

public class Profesor extends Persona {

    private int cantidad_hijos;
    @Override
    public void estudiar() {
        System.out.println("El profe estudia 8 horas");
    }

    public Profesor(String nombre, String apellido, int cantidad_hijos) {
        super(nombre, apellido);
        this.cantidad_hijos = cantidad_hijos;
    }

    public int getCantidad_hijos() {
        return cantidad_hijos;
    }

    public void setCantidad_hijos(int cantidad_hijos) {
        this.cantidad_hijos = cantidad_hijos;
    }

    public void soyElProfe(){
        System.out.println("Soy el profesor");
    }
}
