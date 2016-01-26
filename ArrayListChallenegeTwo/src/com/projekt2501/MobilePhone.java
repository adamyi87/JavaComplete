package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 1/18/16.
 */
public class MobilePhone {
    private String number;
    private ArrayList<Contact> myContact;

    public String getNumber(){
        return number;
    }
    public MobilePhone(String number){
        this.number = number;
        this.myContact = new ArrayList<Contact>();
    }

    //PUBLIC METHODS
    public void printContacts(){
        if(myContact.size() == 0){
            System.out.println("No registered Contacts.");
        }
        else{
            for(int i=0; i<myContact.size(); i++){
                System.out.println((i+1) + ". Name: " + myContact.get(i).getName() + "\n" +
                        "   Phone number: " + myContact.get(i).getNumber());
            }
        }
    }
    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        } else {
            myContact.add(contact);
            return true;
        }
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = myContact.indexOf(oldContact);
        if(position >= 0){
            myContact.set(position, newContact);
            System.out.println(oldContact.getName() + ", has been replaced with " + newContact.getName());
            return true;
        }
        else{
            System.out.println(oldContact.getName() +", is not in your Contacts.");
            return false;
        }
    }
    public boolean removeContact(Contact contact){
        int position = myContact.indexOf(contact);
        if(position >= 0){
            myContact.remove(position);
            return true;
        }
        else{
            System.out.println(contact.getName() + ", does not exist.");
            return false;
        }
    }
    public boolean queryContact(Contact contact){
        if(findContact(contact) >= 0){
            for(int i=0; i<myContact.size(); i++){
                System.out.println((i+1) + ". Name: " + myContact.get(i).getName() + "\n" +
                        "   Number: " + myContact.get(i).getNumber() + "=====> Has been found");
            }
            return true;
        }
        else{
            System.out.println(contact.getName() + ", not found in Contact.");
            return false;
        }

    }


    //PRIVATE METHODS
    private int findContact(Contact contact){
        return myContact.indexOf(contact);
    }
    private int findContact(String name){
        for(int i=0; i<myContact.size(); i++){
            if(myContact.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }
        return -1;
    }
}
