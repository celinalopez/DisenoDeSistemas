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
public class FactoryLcdAzul extends TvAbstractFactory {

    public Color createColor() {
        Color col1 = new Azul("AZUL");
        return col1;
    }

    public TV createTV() {
        TV tv1 = new LCD();
        return tv1;
    }
}

