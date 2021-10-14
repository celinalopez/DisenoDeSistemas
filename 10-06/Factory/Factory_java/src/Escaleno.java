/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory_java.src;

/**
 *
 * @author FERNANDO
 */
public class Escaleno extends Triangulo {

    public Escaleno(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }
    
    

    @Override
    public String getDescripcion() {
        
    return "Souy un triangulo escaleno";
    
    }

    @Override
    public double getSuperficie() {
        return 0;
    }

    
 
    
}
