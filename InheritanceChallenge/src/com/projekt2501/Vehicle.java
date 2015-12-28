package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    //region GETTERS
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    //endregion

    //region METHODS
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degree");
    }
    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }
    public void stop(){
        this.currentVelocity = 0;
    }
    //endregion
}
