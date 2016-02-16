package com.projekt2501;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ay-sam on 2/16/16.
 */
public class Monster implements ISaveable {
    private String name;
    private int hitPoint;
    private int strength;

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getStrength() {
        return strength;
    }

    public Monster(String name, int hitPoint, int strength) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", strength=" + strength +
                '}';
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues.size() > 0 && savedValues != null){
            this.name = savedValues.get(0);
            this.hitPoint = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public List<String> write() {
        List<String> saveValues = new ArrayList<String>();
        saveValues.add(0, this.name);
        saveValues.add(1, Integer.toString(this.hitPoint));
        saveValues.add(2, Integer.toString(this.strength));
        return saveValues;
    }
}
