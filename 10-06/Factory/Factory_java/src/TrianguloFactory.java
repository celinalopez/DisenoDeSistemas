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
public class TrianguloFactory implements TrianguloFactoryMethod {

    @Override
    public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC) {
        if ((ladoA == ladoB) && (ladoA == ladoC)) {
            return new Equilatero(ladoA, ladoB, ladoC);
            
        }
        else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)){
            
            return new Escaleno(ladoA, ladoB, ladoC);
        }
        else {
            return new Isosceles(ladoA, ladoB, ladoC);
        }
    }
}
