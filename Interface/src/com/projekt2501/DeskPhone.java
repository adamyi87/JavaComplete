package com.projekt2501;

/**
 * Created by ay-sam on 2/15/16.
 */
public class DeskPhone implements ITelephone {
    private int number;
    private boolean isRinging;

    public DeskPhone(int number) {
        this.number = number;
    }

    @Override
    public void powerOn() {
        System.out.println("Power button not needed.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialing: " + phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean answerPhone(int phoneNumber) {
        if(phoneNumber == number){
            isRinging = true;
            System.out.println("Ring ring");
        }
        else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
