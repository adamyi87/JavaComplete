package com.projekt2501;

public class Main {

    public static void main(String[] args) {
        ITelephone adamsPhone;
        adamsPhone = new DeskPhone(12345);

        adamsPhone.powerOn();
        adamsPhone.dial(12345);
        adamsPhone.answer();

        DeskPhone officePhone = new DeskPhone(12345);
        officePhone.powerOn();
        officePhone.answerPhone(12345);
    }
}
