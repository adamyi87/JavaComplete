package com.projekt2501;


/**
 * Created by ay-sam on 12/21/15.
 */
public class Bed {
    private String manufacturer;
    private Dimension dimension;
    private int pillows;
    private int blankets;

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public int getPillows() {
        return pillows;
    }

    public int getBlankets() {
        return blankets;
    }
    //region ========== CONSTRUCTOR
    public Bed(String manufacturer, Dimension dimension, int pillows, int blankets) {
        this.manufacturer = manufacturer;
        this.dimension = dimension;
        this.pillows = pillows;
        this.blankets = blankets;
    }
    //endregion

    //region ========== METHODS
    public void sleep(){
        System.out.println("ZZzzzzzzZZZZzzz");
    }
    public void makeBed(){
        System.out.println("Making the bed. Finished.");
    }
    //endregion
}

