package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class PC {
    private Motherboard myMotherboard;
    private Case myCase;
    private Monitor myMonitor;
    private Keyboard myKeyboard;

    public Motherboard getMyMotherboard() {
        return myMotherboard;
    }

    public Case getMyCase() {
        return myCase;
    }

    public Monitor getMyMonitor() {
        return myMonitor;
    }

    public Keyboard getMyKeyboard() {
        return myKeyboard;
    }

    public PC(Motherboard myMotherboard, Case myCase, Monitor myMonitor, Keyboard myKeyboard) {
        this.myMotherboard = myMotherboard;
        this.myCase = myCase;
        this.myMonitor = myMonitor;
        this.myKeyboard = myKeyboard;
    }


    //region PC METHODS
    //CASE METHODS
    public void turnPcOnOrOff(boolean onOrOff){
        myCase.pushPowerButton(onOrOff);
    }

    //MONITOR METHODS
    public void turnMonitorOnOrOff(boolean onOrOff){
        myMonitor.pushMonitorButton(onOrOff);
    }
    public void drawOnScreen(int x, int y, String color){
        myMonitor.drawPixelOnScreen(x, y, color);
    }

    //MOTHERBOARD METHODS
    public void displayBiosVersion(){
        System.out.println("Bios version: " + myMotherboard.getBios());
    }

    //KEYBOARD METHODS
    public void writeDocument(String info){
        myKeyboard.writeDocument(info);
    }

    //PC METHODS
    public void loadGame(String game){
        System.out.println("Playing: " + game);
    }

    //endregion

}
