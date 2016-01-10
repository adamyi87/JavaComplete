package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by adam on 1/9/2016.
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


    //region METHODS
    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position < 0){
            System.out.println(oldContact.getName() + ", could not be found.");
            return false;
        }
        else{
            myContacts.set(position, newContact);
            System.out.println(oldContact.getName() + ", was found and replaced with " + newContact.getName());
            return true;
        }
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0; i<myContacts.size(); i++){
            Contact temp = myContacts.get(i);
            if(temp.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    //endregion

}
