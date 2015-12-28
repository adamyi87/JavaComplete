package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class MyRoom {
    private PC myPc;
    private TV myTv;
    private Bed myBed;




    public PC getMyPc() {
        return myPc;
    }

    public TV getMyTv() {
        return myTv;
    }

    public Bed getMyBed() {
        return myBed;
    }

    public MyRoom(PC myPc, TV myTv, Bed myBed) {
        this.myPc = myPc;
        this.myTv = myTv;
        this.myBed = myBed;
    }
    //region ====== METHODS
    //PC
    public void turnPcOnOrOff(boolean onOrOff){
        myPc.turnPcOnOrOff(onOrOff);
    }
    public void turnMonitorOnOrOff(boolean onOrOff){
        myPc.turnMonitorOnOrOff(onOrOff);
    }
    public void drawOnScreen(int x, int y, String color){
        myPc.drawOnScreen(x, y, color);
    }
    public void writeDocument(String info){
        myPc.writeDocument(info);
    }
    public void loadGame(String name){
        myPc.loadGame(name);
    }
    public void displayBiosVersion(){
        myPc.displayBiosVersion();
    }
    //BED
    public void sleepOnBed(){
        myBed.sleep();
    }

}
