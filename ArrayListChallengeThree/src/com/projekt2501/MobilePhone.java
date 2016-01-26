package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 1/25/16.
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

    //PUBLIC METHODS
    // Add Contacts
    public boolean addContact(Contact contact){
        if(myContacts.size() == 0){
            myContacts.add(contact);
            return true;
        }
        else{
            if(findContact(contact.getName()) >= 0){
                return false;
            }
            else{
                myContacts.add(contact);
                return true;
            }
        }
    }
    // Update Contacts
    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            myContacts.set(position, newContact);
            System.out.println(oldContact.getName() + " has been replaced by " + newContact.getName());
            return true;
        }
        else{
            System.out.println(oldContact.getName() + " does not exist in Contacts.");
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
            System.out.println(contact.getName() + " does not exist in Contacts.");
            return false;
        }
    }
    // Find Contacts
    public boolean queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            System.out.println("'" + name + "'" + " has been found in Contact #" + (position+1));
            return true;
        }
        else{
            System.out.println(name + " can not be found in Contacts.");
            return false;
        }
    }
    // Print Contacts
    public void printContacts(){
        if(myContacts.size() == 0){
            System.out.println("Contacts is empty.");
        }
        else{
            for(int i=0; i<myContacts.size(); i++){
                System.out.println((i+1) + ": " + myContacts.get(i).getName() +
                    " || Number: " + myContacts.get(i).getNumber());
            }
        }
    }
    //PRIVATE METHODS
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
