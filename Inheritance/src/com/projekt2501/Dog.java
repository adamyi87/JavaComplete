package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    //region GETTERS AND SETTERS
    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
    //endregion
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    //region METHODS
    private void chew(){
        System.out.println("Dog chew()");
    }
    @Override
    public void eat(){
        System.out.println("Dog eat()");
    }
    @Override
    public void move(){
        System.out.println("Dog move()");
    }
    //endregion
}
