package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private String bios;
    private String motherboardType;
    private int ramSlots;
    private int cardSlots;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getBios() {
        return bios;
    }

    public String getMotherboardType(){
        return motherboardType;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }
    //region ===== CONSTRUCTORS
    public Motherboard(String model, String manufacturer, String bios, String motherboardType, int ramSlots, int cardSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.motherboardType = motherboardType;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }
    public Motherboard(String motherboardType, int ramSlots, int cardSlots){
        this("Unknown model", "Default", "v.2.00", motherboardType, ramSlots, cardSlots);
    }
    //endregion


}
