package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class PC {

    private Motherboard motherboard;
    private Case myCase;
    private Monitor monitor;

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Case getMyCase() {
        return myCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public PC(Motherboard motherboard, Case myCase, Monitor monitor) {
        this.motherboard = motherboard;
        this.myCase = myCase;
        this.monitor = monitor;
    }
}
