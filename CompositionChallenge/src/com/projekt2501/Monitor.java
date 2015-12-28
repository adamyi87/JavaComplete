package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private boolean isOnOrOff;
    private Resolution resolution;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean getIsOnOrOff() {
        return isOnOrOff;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public Monitor(String model, String manufacturer, boolean isOnOrOff, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.isOnOrOff = isOnOrOff;
        this.resolution = resolution;
    }


    //region ========== METHODS
    public void pushMonitorButton(boolean onOrOff){
        if(onOrOff){
            this.isOnOrOff = true;
            System.out.println("Power monitor is on.");
        }
        else{
            this.isOnOrOff = false;
            System.out.println("Power monitor is off.");
        }
    }
    public void drawPixelOnScreen(int x, int y, String color){
        System.out.println("Drew pixel at: " + "(" + x + "," + y + ")" + " with color: " + color);
    }
}
