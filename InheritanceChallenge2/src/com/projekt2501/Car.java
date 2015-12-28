package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear = 0;

    //region GETTERS
    public int getWheels(){
        return wheels;
    }
    public int getDoors(){
        return doors;
    }
    public int getGears() {
        return gears;
    }
    public boolean isManual() {
        return isManual;
    }
    public int getCurrentGear() {
        return currentGear;
    }
    //endregion
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual){
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
    }

    //region METHODS
    public void changeGear(int currentGear){
        this.currentGear = currentGear;
    }
    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity(): The speed is: " + speed + "\nDirection headed: " + direction);
    }
    //endregion
}
