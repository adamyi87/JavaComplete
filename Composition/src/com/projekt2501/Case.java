package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Case {
    private String model;
    private String manufacturer;
    private int powerSupply;
    private Dimension dimesions;

    //===== GETTERS
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimesions() {
        return dimesions;
    }

    //===== CONSTRUCTORS
    public Case(String model, String manu, int powerSupply, Dimension dimensions){
        this.model = model;
        this.manufacturer = manu;
        this.powerSupply = powerSupply;
        this.dimesions = dimensions;
    }

    //===== METHODS
    public void pushPowerButton(){
        System.out.println("Power button pressed.");
    }
}
