package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class Case {
    private String model;
    private String manufacturer;
    private boolean isOnOrOff;
    private Dimension dimension;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean getIsOnOrOff(){
        return isOnOrOff;
    }
    public Dimension getDimension() {
        return dimension;
    }


    public Case(String model, String manufacturer, boolean isOnOrOff, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.isOnOrOff = isOnOrOff;
        this.dimension = dimension;
    }
    //region METHOD
    public void pushPowerButton(boolean onOrOff){
        if(onOrOff){
            this.isOnOrOff = true;
            System.out.println("The power is on.");
        }
        else{
            this.isOnOrOff = false;
            System.out.println("The power is off.");
        }
    }
}
