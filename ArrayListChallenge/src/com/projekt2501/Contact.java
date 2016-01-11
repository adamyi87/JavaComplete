package com.projekt2501;

/**
 * Created by adam on 1/9/2016.
 */
public class Contact {
    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public static Contact creatContact(String name, String number){
        return new Contact(name, number);
    }

}
