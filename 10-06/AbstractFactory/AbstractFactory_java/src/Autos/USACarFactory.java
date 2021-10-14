package Autos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emeline
 */
public class USACarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {

            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;

            case SMALL:
                car = new SmallCar(Location.ASIA);
                break;

        }
        return car;
    }
}
