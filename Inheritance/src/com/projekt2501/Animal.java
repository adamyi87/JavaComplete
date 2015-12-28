package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
    //region GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
    //endregion
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    //region METHODS
    public void move(){
        System.out.println("Animal move()");
    }
    public void eat(){
        System.out.println("Animal eat()");
    }
    //endregion
}
