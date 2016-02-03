package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/2/16.
 */
public class MobilePhone {
    private String number;
    private ArrayList<Contact> myContacts;

    public String getNumber(){
        return this.number;
    }
    public ArrayList<Contact> getMyContacts(){
        return this.myContacts;
    }

    public MobilePhone(String number){
        this.number = number;
        this.myContacts = new ArrayList<Contact>();
    }

    //PUBLIC METHODS
    //-- ADD CONTACT
    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            //already in Contact.
            return false;
        }
        else{
            myContacts.add(contact);
            return true;
        }
    }
    //-- UPDATE CONTACT
    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            myContacts.set(position, newContact);
            return true;
        }
        else{
            //Old contact not found.
            return false;
        }
    }
    //-- REMOVE CONTACT



    //-- PRINT CONTACT
    public void printContact(){
        if(myContacts.size() == 0){
            System.out.println("Contacts is empty.");
        }
        else{
            for(int i=0; i<myContacts.size(); i++){
                System.out.println((i+1) + "\nName: " + myContacts.get(i).getName() +
                                           "\nNumber: " + myContacts.get(i).getNumber());
            }
        }
    }
    //-- FIND CONTACT
    public boolean queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            Contact foundContact = myContacts.get(position);
            System.out.println(foundContact.getName() + " has been found. Number: " +
                    foundContact.getNumber());
            return true;
        }
        else{
            return false;
        }
    }



    //USEFUL METHODS
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
