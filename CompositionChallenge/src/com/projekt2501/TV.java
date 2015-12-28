package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class TV {
    private String model;
    private String manufacturer;
    private int size;
    private Dimension dimension;
    private Resolution resolution;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public TV(String model, String manufacturer, int size, Dimension dimension, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.dimension = dimension;
        this.resolution = resolution;
    }

    //region ========== METHODS
    public void pushPowerButton(boolean onOrOff){
        if(onOrOff){
            System.out.println("TV turned on.");
        }
        else{
            System.out.println("TV turned off.");
        }
    }
    public void changeChannel(int channel){
        System.out.println("Changed channel to: " + channel);
    }
    public void changeOutputChannel(String output){
        System.out.println("Changed output to: " + output);
    }
    public void changeVolume(int volumeLevel){
        System.out.println("Changed volume level to: " + volumeLevel);
    }
    public void menuOption(){
        System.out.println("Menu option button pushed.");
    }
    //endregion
}
