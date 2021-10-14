package TVEnsamblado;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AbstractFactoryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        TvAbstractFactory f1 = new FactoryLcdAzul();
        EnsamblajeTV e1= new   EnsamblajeTV(f1);
        
        TvAbstractFactory f2 = new FactoryPlasmaBlanco();
        EnsamblajeTV e2= new   EnsamblajeTV(f2);
        

        

        
    }


}

