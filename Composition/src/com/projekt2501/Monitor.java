package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution resolution;

    //===== GETTERS
    public String getModel(){
        return model;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getSize(){
        return size;
    }
    public Resolution getResolution(){
        return resolution;
    }


    //===== CONSTRUCTOR
    public Monitor(String model, String manu, int size, Resolution resolution){
        this.model = model;
        this.manufacturer = manu;
        this.size = size;
        this.resolution = resolution;
    }

    //===== METHODS
    public void drawPixel(int x, int y, String color){
        if( (x < 0 || x > 1920) || (y < 0 || y > 1080) ){
            System.out.println("One of the location point is greater than the actual size of the monitor.\n" +
                    "Could not draw pixel");
        }
        else{
            System.out.println("You drew a pixel at: " + "(" + x + "," + y + ")" + " with the color: " + color);
        }
    }
}
