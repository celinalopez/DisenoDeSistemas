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
public class CarFactory {
    
    private CarFactory() {
        
    }
    
    public static Car buildsCar(CarType type) {
        Car car = null;
        Location location = Location.ASIA;
        
        switch(location) {
            case USA:
                car = USACarFactory.buildCar(type);
                break;
                
            case ASIA:
                car = AsiaCarFactory.buildCar(type);
        }
        return car;
    }
    
}
