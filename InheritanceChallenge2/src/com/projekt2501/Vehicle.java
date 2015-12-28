package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Vehicle {
    private String name;
    private String size;

    private int currentSpeed = 0;
    private int currentDirection = 0;

    //region GETTERS
    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public int getCurrentDirection() {
        return currentDirection;
    }
    //endregion

    //region CONSTRUCTOR
    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;
    }
    //endregion

    //region METHODS
    public void move(int speed, int direction){
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Current speed is: " + speed + "\nCurrent headed direction is: " +
                direction + " degrees");
    }
    public void steer(int direction){
        this.currentDirection += direction;
    }
    public void stop(){
        this.currentSpeed = 0;
    }

    //endregion
}
