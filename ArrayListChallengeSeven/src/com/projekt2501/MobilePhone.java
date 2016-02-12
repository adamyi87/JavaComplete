package com.projekt2501;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ay-sam on 2/11/16.
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
    //CONSTRUCTOR
    public MobilePhone(String number){
        this.number = number;
        this.myContacts = new ArrayList<Contact>();
    }

    //PUBLIC METHODS

    //--- PRINT CONTACTS
    public void printContacts(){
        if (myContacts.size() == 0) {
            System.out.println("Contacts is empty.");
        }
        else{
            for(int i=0; i<myContacts.size(); i++){
                System.out.println((i+1) + ": " + myContacts.get(i).getName() + "\n" +
                            myContacts.get(i).getPhoneNumber());
            }
        }
    }
    //--- ADD CONTACTS
    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) == null){
            myContacts.add(contact);
            return true;
        }
        else{
            return false;
        }
    }
    //--- UPDATE CONTACTS
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
    //--- REMOVE CONTACTS
    public boolean removeContact(Contact oldContact){
        int position = findContact(oldContact);
        if(position >= 0){
            myContacts.remove(position);
            return true;
        }
        else{
            return false;
        }
    }
    //--- FIND CONTACTS
    public boolean queryContact(String name){
        Contact foundContact = findContact(name);
        if(foundContact != null){
            System.out.println(foundContact.getName() + " has been found.");
            return true;
        }
        else{
            return false;
        }
    }

    //PRIVATE METHODS
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    public Contact findContact(String name){
        for(int i=0; i<myContacts.size(); i++){
            Contact foundContact = myContacts.get(i);
            if(foundContact.getName().equalsIgnoreCase(name)){
                return foundContact;
            }
        }
        return null;
    }

}
