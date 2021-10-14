/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TVEnsamblado;

/**
 *
 * @author juanj
 */
public class LCD extends TV {

    private double costoFabricacion;

    public LCD(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public LCD(double costoFabricacion, String marca, int pulgadas, String color, String descripcion, double precio) {
        super(marca, pulgadas, color, descripcion, precio);
        this.costoFabricacion = costoFabricacion;
    }

    public LCD() {
        setDescripcion("LCD");
        setMarca("Sony");
        setPulgadas(32);
        setCostoFabricacion(3000);
        setPrecio(5000);
    }
    @Override
    public void desc(Color c) {
        System.out.println("El "+getDescripcion()+" fue pintado de color "+c.getDescripcion());
    }
    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }
}

