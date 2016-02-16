package com.projekt2501;

/**
 * Created by ay-sam on 2/15/16.
 */
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean answerPhone(int phoneNumber);
    boolean isRinging();
}
