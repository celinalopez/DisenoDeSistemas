/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autos;

/**
 *
 * @author Emeline
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(CarFactory.buildsCar(CarType.SMALL));
        System.out.println(CarFactory.buildsCar(CarType.LUXURY));

        
    }
    
}
