package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by adam on 1/9/2016.
 */
public class MobilePhone {
    private String number;
    private ArrayList<Contact> myContacts;

    //CONSTRUCTOR
    public MobilePhone(String number){
        this.number = number;
        this.myContacts = new ArrayList<Contact>();
    }


    //PUBLIC METHODS
    public boolean addNewContacts(Contact contact){
        if(findContact(contact.getName()) >= 0){
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContacts(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position < 0){
            System.out.println(oldContact.getName() + ", does not exist in your Contacts.");
            return false;
        }
        else{
            myContacts.set(position, newContact);
            System.out.println(oldContact.getName() + ", has been replaced with " + newContact.getName());
            return true;
        }
    }
    public boolean removeContacts(Contact contact){
        int position = myContacts.indexOf(contact);
        if(position >= 0){
            myContacts.remove(position);
            System.out.println(contact.getName() + " has been removed.");
            return true;
        }
        else{
            System.out.println(contact.getName() + " cannot be found.");
            return false;
        }
    }
    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        else{
            return null;
        }
    }
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

    //PRIVATE METHODS
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
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
