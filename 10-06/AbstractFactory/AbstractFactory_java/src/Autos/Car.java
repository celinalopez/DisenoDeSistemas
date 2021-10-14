package Autos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emeline
 */
public abstract class Car {

    public Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    protected abstract void construct();
    private CarType model = null;
    private Location location = null;

    public CarType getModel() {
        return model;
    }

    public Location getLocation() {
        return location;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public String toString() {
        return "Model- " + model + " built in " + location;
    }

}
