package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/3/16.
 */
public class MobilePhone {
    private String number;
    private ArrayList<Contact> myContacts;

    public String getNumber() {
        return number;
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public MobilePhone(String number){
        this.number = number;
        this.myContacts = new ArrayList<Contact>();
    }

    //PUBLIC METHODS
    //-- ADD CONTACT
    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            return false;
        }
        else{
            myContacts.add(contact);
            return true;
        }
    }
    //-- UPDATE CONTACT
    public void updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            myContacts.set(position, newContact);
        }
        else{
        }
    }
    //-- REMOVE CONTACT
    public boolean removeContact(String name){
        int position = findContact(name);
        if(position >= 0){
            myContacts.remove(position);
            return true;
        }
        else{
            return false;
        }
    }
    //-- FIND CONTACT
    public boolean queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            System.out.println(myContacts.get(position).getName() + " has been found. Number:" +
                    myContacts.get(position).getNumber());
            return true;
        }else{
            return false;
        }
    }
    //-- PRINT CONTACT
    public void printContact(){
        if(myContacts.size() == 0){
            System.out.println("Contact is empty.");
        }
        else{
            for(int i=0; i<myContacts.size(); i++){
                System.out.println((i+1) + "\n" +
                                    "Name: " + myContacts.get(i).getName() + "\n" +
                                    "Number: " + myContacts.get(i).getNumber());
            }
        }
    }

    //-- USEFUL METHODS
    public int findContact(String name){
        for(int i=0; i<myContacts.size(); i++){
            if(myContacts.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
    //PRIVATE METHODS
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
}
