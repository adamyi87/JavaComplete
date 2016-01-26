package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by adam on 1/25/2016.
 */
public class MobilePhone {
    private String name;
    private ArrayList<Contact> myContacts;
    public String getName(){
        return this.name;
    }

    public MobilePhone(String name){
        this.name = name;
        this.myContacts = new ArrayList<Contact>();
    }

    //PUBLIC METHODS
    // Print Contacts
    public void printContacts(){
        if(myContacts.size() == 0){
            System.out.println("My contacts is empty.");
        }
        else{
            for(int i=0; i<myContacts.size(); i++){
                System.out.println((i+1) + "\nName: " + myContacts.get(i).getName() +
                    "\nNumber: " + myContacts.get(i).getNumber());
            }
        }
    }
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
            System.out.println(contact.getName() + " could not be found in Contacts.");
            return false;
        }
    }
    // Find Contacts
    public boolean queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            System.out.println(name + " has been found.");
            return true;
        }
        else{
            System.out.println(name + " could not be found.");
            return false;
        }
    }


    //PRIVATE METHODS
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    private int findContact(String name){
        for(int i=0; i<myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
