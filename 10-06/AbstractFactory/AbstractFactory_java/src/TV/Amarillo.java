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
public class Amarillo extends Color {

    @Override
    public void colorea(TV tv) {
        System.out.println("Pintando de amarillo el " + tv.getDescripcion()+ "("+tv.getPulgadas()+" pulgadas)");
        System.out.println("Precio: $"+tv.getPrecio());
        System.out.println("Marca: "+tv.getMarca());
    }

    public Amarillo() {
        
    }

    public Amarillo(String descripcion) {
        super(descripcion);
    }

}

