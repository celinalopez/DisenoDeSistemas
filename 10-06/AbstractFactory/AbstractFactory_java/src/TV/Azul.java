/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TV;

/**
 *
 * @author juanj
 */
public class Azul extends Color {

    @Override
    public void colorea(TV tv) {
        System.out.println("Pintando de Azul el " + tv.getDescripcion() + "("+tv.getPulgadas()+" pulgadas)");
        System.out.println("Precio: $"+tv.getPrecio());
        System.out.println("Marca: "+tv.getMarca());
    }

    public Azul() {
        
    }  

    public Azul(String descripcion) {
        super(descripcion);
    }
    
}

