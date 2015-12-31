package com.projekt2501;

class Car{
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public Car( String name, int cylinders) {
        this.engine = true;
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Car: startEngine().";
    }
    public String accelerate(){
        return "Car: acclerate().";
    }
    public String brake(){
        return "Car: brake().";
    }
}

class Toyota extends Car{
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    public String startEngine(){
        return "Toyota: startEngine().";
    }
    public String accelerate(){
        return "Toyota: accelerate().";
    }
    public String brake(){
        return "Toyota: brake().";
    }
}

public class Main {

    public static void main(String[] args) {
	    Car car = new Car("Base car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.brake());
        System.out.println(car.accelerate());
    }
}
