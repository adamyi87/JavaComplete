package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;


    //===== GETTERS
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }


    //===== CONSTRUCTOR
    public Motherboard(String model, String manu, int ramSlots, int cardSlots, String bios){
        this.model = model;
        this.manufacturer = manu;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    //===== METHODS
    public void loadProgram(String program){
        System.out.println("Program: " + program + " loaded.");
    }
}
