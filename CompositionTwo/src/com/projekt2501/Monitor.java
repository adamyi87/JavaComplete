package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private Resolution resolution;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public Monitor(String model, String manufacturer, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }
}
