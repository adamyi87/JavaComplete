package com.projekt2501;

/**
 * Created by adam on 1/25/2016.
 */
public class Contact {
    private String name;
    private String number;

    public String getName(){
        return this.name;
    }
    public String getNumber(){
        return this.number;
    }
    public Contact(String name, String number){
        this.name = name;
        this.number = number;
    }

    public static Contact createNewContact(String name, String number){
        return new Contact(name, number);
    }
}
