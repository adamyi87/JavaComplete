package com.projekt2501;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by ay-sam on 2/16/16.
 */
public class Player implements ISaveable {
    private String name;
    private int hitPoint;
    private int strength;
    private String weapon;

    //GETTERS AND SETTERS
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public int getStrength(){
        return this.strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }

    public String getWeapon(){
        return this.weapon;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }

    //CONSTRUCTOR
    public Player(String name, int hitPoint, int strength){
        this.name = name;
        this.hitPoint = hitPoint;
        this.strength = strength;
        this.weapon = "Sword";
    }


    //METHODS -- PUBLIC
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }


    //METHODS -- INTERFACE
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, Integer.toString(this.hitPoint));
        values.add(2, Integer.toString(this.strength));
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues.size() > 0 && savedValues != null){
            this.name = savedValues.get(0);
            this.hitPoint = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
