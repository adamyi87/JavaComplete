package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by adam on 1/25/2016.
 */
public class MobilePhone {
    private String number;
    private ArrayList<Contact> myContacts;
    public String getNumber(){
        return this.number;
    }

    //CONSTRUCTOR
    public MobilePhone(String number){
        this.number = number;
        this.myContacts = new ArrayList<Contact>();
    }

    //PUBLIC METHODS =====================================================================================
    // Add Contacts
    public boolean addContact(Contact contact){
        if(findContact(contact) < 0){
            myContacts.add(contact);
            return true;
        }
        else{
            System.out.println(contact.getName() + " already in your contacts.");
            return false;
        }
    }
    // Update Contacts
    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            myContacts.set(position, newContact);
            System.out.println(oldContact.getName() + " has been replaced with " + newContact.getName());
            return true;
        }
        else{
            System.out.println(oldContact.getName() + " not found.");
            return false;
        }
    }
    // Remove Contacts
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position >= 0){
            myContacts.remove(position);
            System.out.println(contact.getName() + " has been removed from Contacts.");
            return true;
        }
        else{
            System.out.println(contact.getName() + " cannot be found in your Contacts.");
            return false;
        }
    }
    // Find Contacts
    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        else{
            return null;
        }
    }
    // Print Contacts
    public void printContacts(){
        if(myContacts.size() == 0){
            System.out.println("No contacts registered on the phone.");
        }
        else{
            for(int i=0; i<myContacts.size(); i++){
                System.out.println((i+1) + ". Name: " + myContacts.get(i).getName() + "\n" +
                        "   Phone number: " + myContacts.get(i).getNumber());
            }
        }
    }

    //PRIVATE METHODS =====================================================================================
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    private int findContact(String name){
        for(int i=0; i<myContacts.size(); i++){
            if(myContacts.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }
        return -1;
    }
}
