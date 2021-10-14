package Autos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Autos.Car;

/**
 *
 * @author Emeline
 */
public class SmallCar extends Car {
    
        public SmallCar(Location location) {
        super(CarType.SMALL, location);
        construct();
    }

    protected void construct() {
        System.out.println("Building small car");
    }
    
}
