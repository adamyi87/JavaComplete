package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class PC {
    private Case myCase;
    private Motherboard motherboard;
    private Monitor monitor;

    //===== GETTERS
    public Case getMyCase() {
        return myCase;
    }
    public Motherboard getMotherboard() {
        return motherboard;
    }
    public Monitor getMonitor() {
        return monitor;
    }

    //===== CONSTRUCTOR
    public PC(Case myCase, Motherboard motherboard, Monitor monitor) {
        this.myCase = myCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
}
