package com.projekt2501;

/**
 * Created by ay-sam on 1/25/16.
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

    //CONSTRUCTOR
    public Contact(String name, String number){
        this.name = name;
        this.number = number;
    }

    //PUBLIC METHODS
    public static Contact createNewContact(String name, String number){
        return new Contact(name, number);
    }
}
