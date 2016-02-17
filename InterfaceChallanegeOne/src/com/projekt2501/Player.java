package com.projekt2501;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ay-sam on 2/17/16.
 */
public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    //GETTER AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    //METHODS ======================================================

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    //INTERFACE METHODS

    @Override
    public List<String> write() {
        List<String> stats = new ArrayList<String>();
        stats.add(0, this.name);
        stats.add(1, Integer.toString(this.hitPoints));
        stats.add(2, Integer.toString(this.strength));
        stats.add(3, this.weapon);
        return stats;
    }

    @Override
    public void read(List<String> savedValues) {
        List<String> stats = new ArrayList<String>();
        
    }
}
