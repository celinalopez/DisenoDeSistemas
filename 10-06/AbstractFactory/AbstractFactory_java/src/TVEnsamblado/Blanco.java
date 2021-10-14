package TVEnsamblado;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanj
 */
public class Blanco extends Color {

    @Override
    public void colorea(TV tv) {
        System.out.println("Pintando de blanco el " + tv.getDescripcion()+ "("+tv.getPulgadas()+" pulgadas)");
        System.out.println("Precio: $"+tv.getPrecio());
        System.out.println("Marca: "+tv.getMarca());
    }

    public Blanco() {
        
    }

    public Blanco(String descripcion) {
        super(descripcion);
    }

}

