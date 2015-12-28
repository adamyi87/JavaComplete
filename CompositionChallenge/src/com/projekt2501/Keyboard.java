package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class Keyboard {
    private String model;
    private String manufacturer;
    private String document;
    private boolean isMechanic;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDocument(){
        return document;
    }

    public boolean isMechanic() {
        return isMechanic;
    }

    public Keyboard(String model, String manufacturer, String document, boolean isMechanic) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.document = document;
        this.isMechanic = isMechanic;
    }

    //region ====== METHODS
    public void writeDocument(String info){
        this.document = info;
        System.out.println(info);
    }
}
