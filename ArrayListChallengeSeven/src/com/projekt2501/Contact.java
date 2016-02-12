package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/11/16.
 */
public class Contact {
    private String name;
    private String phoneNumber;

    //GETTERS
    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    //CONSTRUCTOR
    public Contact(String name, String number){
        this.name = name;
        this.phoneNumber = number;
    }

    //PUBLIC METHODS
    public static Contact createNewContact(String name, String number){
        return new Contact(name, number);
    }

}
