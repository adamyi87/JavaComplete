package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/16/16.
 */
public class MobilePhone {
    private String number;
    private ArrayList<Contact> contacts;

    public String getNumber(){
        return this.number;
    }
    public ArrayList<Contact> getContacts(){
        return this.contacts;
    }

    public MobilePhone(String number){
        this.number = number;
        this.contacts = new ArrayList<Contact>();
    }


    //METHODS -- PUBLIC
    public void printContacts(){
        if(contacts.size() == 0){
            System.out.println("The contacts are empty.");
        }
        else{
            for(int i=0; i<contacts.size(); i++){
                System.out.println((i+1) + ": " + contacts.get(i).getName() + "\n" +
                        contacts.get(i).getNumber());
            }
        }
    }

    public boolean addContact(Contact newContact){
        if(findContact(newContact.getName()) == null){
            contacts.add(newContact);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = contacts.indexOf(oldContact);
        if(position >= 0){
            contacts.set(position, newContact);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean removeContact(Contact oldContact){
        int position = contacts.indexOf(oldContact);
        if(position >= 0){
            contacts.remove(position);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean queryContact(String name){
        if(findContact(name) != null){
            System.out.println(name + " has been found.");
            return true;
        }
        else{
            return false;
        }
    }
    public Contact findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact foundContact = contacts.get(i);
            if (foundContact.getName().equalsIgnoreCase(name)) {
                return foundContact;
            }
        }
        return null;
    }
}
