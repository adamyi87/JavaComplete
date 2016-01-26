package com.projekt2501;

/**
 * Created by ay-sam on 1/18/16.
 */
public class Contact {
    private String name;
    private String number;

    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }

    public Contact(String name, String number){
        this.name = name;
        this.number = number;
    }

    public static Contact createNewContact(String name, String number){
        return new Contact(name, number);
    }

}
