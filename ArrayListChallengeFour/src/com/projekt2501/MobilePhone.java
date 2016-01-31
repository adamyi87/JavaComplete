package com.projekt2501;

import java.util.ArrayList;
import java.util.jar.Pack200;

/**
 * Created by ay-sam on 1/31/16.
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
    // print contacts
    public void printContacts(){
        if(myContacts.size() == 0){
            System.out.println("No registered Contacts.");
        }
        else{
            for(int i=0; i<myContacts.size(); i++){
                System.out.println((i+1) + ".\nName: " + myContacts.get(i).getName() +
                        "\nNumber: " + myContacts.get(i).getNumber());
            }
        }
    }
    // Add contacts
    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) < 0){
            myContacts.add(contact);
            return true;
        }
        else{
            return false;
        }
    }
    // Update contacts
    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            myContacts.set(position, newContact);
            return true;
        }
        else{
            return false;
        }
    }
    // Remove contacts
    public boolean removeContact(Contact existingContact){
        int position = findContact(existingContact);
        if(position >= 0){
            myContacts.remove(existingContact);
            return true;
        }else{
            return false;
        }
    }
    // Find contacts
    public boolean queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            System.out.println(myContacts.get(position).getName() + " has been found." + "\n" +
                    "Number: " + myContacts.get(position).getNumber());
            return true;
        }
        else{
            return false;
        }
    }

    // Query contact
    public Contact queryUpdateContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        else{
            return null;
        }
    }
    //PRIVATE METHODS
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    private int findContact(String name){
        for(int i=0; i<myContacts.size(); i++){
            if(myContacts.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
}
