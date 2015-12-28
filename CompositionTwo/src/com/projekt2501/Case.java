package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class Case {
    private String model;
    private String manufacturer;
    private int powerSupply;
    private Dimension dimension;

    //region GETTERS
    public String getModel(){
        return this.model;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public int getPowerSupply(){
        return this.powerSupply;
    }
    public Dimension getDimension() {
        return this.dimension;
    }

    public Case(String model, String manufacturer, int powerSupply, Dimension dimension){
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }


    public void pushPowerButton(){
        System.out.println("Power button pushed.");
    }
}
