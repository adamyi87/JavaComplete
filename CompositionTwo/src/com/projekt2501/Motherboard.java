package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private String bios;
    private int cardSlots;
    private int ramSlots;

    //region GETTERS
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getBios() {
        return bios;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public Motherboard(String model, String manufacturer, String bios, int cardSlots, int ramSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
    }

    public void loadProgram(String program){
        System.out.println("Program: " + program + " loaded.");
    }
}
