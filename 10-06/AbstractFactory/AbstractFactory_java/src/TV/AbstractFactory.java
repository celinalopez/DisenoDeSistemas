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
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        TvAbstractFactory factory = new FactoryLcdAzul();
        Color color1 = factory.createColor();
        
        TvAbstractFactory factory2 = new FactoryPlasmaAmarillo();
        Color color2 = factory2.createColor();
        
        TV tv1 = factory.createTV();
        TV tv2 = factory2.createTV();
        
        color1.colorea(tv1);
        color2.colorea(tv2);
        tv1.desc(color1);
        tv2.desc(color2);
        
    }

}

