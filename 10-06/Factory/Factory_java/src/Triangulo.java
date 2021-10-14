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
public abstract class Triangulo {
    
    private int ladoA;
    
    private int ladoB;
    
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public abstract String getDescripcion();
    public abstract double getSuperficie();
   

    /**
     * Get the value of ladoC
     *
     * @return the value of ladoC
     */
    public int getLadoC() {
        return ladoC;
    }

    /**
     * Set the value of ladoC
     *
     * @param ladoC new value of ladoC
     */
    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }


    /**
     * Get the value of ladoB
     *
     * @return the value of ladoB
     */
    public int getLadoB() {
        return ladoB;
    }

    /**
     * Set the value of ladoB
     *
     * @param ladoB new value of ladoB
     */
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }


    /**
     * Get the value of ladoA
     *
     * @return the value of ladoA
     */
    public int getLadoA() {
        return ladoA;
    }

    /**
     * Set the value of ladoA
     *
     * @param ladoA new value of ladoA
     */
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    
}
