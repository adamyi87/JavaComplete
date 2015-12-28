package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Honda extends Car {
    private int monthOfRoadService;

    public Honda(int monthOfRoadService){
        super("Honda CR-V", "Mini SUV", 4, 4, 2, false);
        this.monthOfRoadService = monthOfRoadService;
    }

    public void accelerate(int speed){
        int newVelocity = getCurrentVelocity() + speed;
        if(newVelocity == 0){
            stop();
        }
        else if(newVelocity > 0 && newVelocity <=0){
            changeGear(1);
        }
        else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }
        else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }
        else{
            changeGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
