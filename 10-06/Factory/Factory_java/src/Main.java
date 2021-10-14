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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TrianguloFactoryMethod factory = new TrianguloFactory();
        Triangulo triangulo = factory.createTriangulo(10, 10, 10);
        System.out.println(triangulo.getDescripcion());
       
        
        System.out.println("------");
        TrianguloFactoryMethod factory2 = new TrianguloFactory();
        Triangulo triangulo2 = factory2.createTriangulo(12, 11, 10);
        System.out.println(triangulo2.getDescripcion());
        
        
        
        
        TrianguloFactoryMethod factory3 = new TrianguloFactory();
        Triangulo triangulo3 = factory3.createTriangulo(10, 13, 10);
        System.out.println(triangulo3.getDescripcion());
        
        
     
        
    }
}
