package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Honda extends Car {
    private int roadServiceMonths;

    public Honda(int roadServiceMonths){
        super("Honda CR-V", "Mini SUV", 4, 4, 2, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    //region METHODS
    public void accelerate(int speed){
        int newSpeed = speed;
        if(newSpeed == 0){

        }
    }
    //endregion
}
