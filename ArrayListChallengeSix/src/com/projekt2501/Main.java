package com.projekt2501;
import java.util.Scanner;
public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("8328667482");
    public static void main(String[] args) {
        boolean quit = false;
        do{
            System.out.println("===============================\n" +
                    "1: Print Contacts.\n" +
                    "2: Add Contacts.\n" +
                    "3: Update Contacts.\n" +
                    "4: Remove Contacts.\n" +
                    "5: Find Contacts.\n" +
                    "0: Exit.\n" +
                    "===============================");
            int userInput = keyboard.nextInt();
            switch(userInput){
                case 1:
                    myPhone.printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    break;
            }
        }while(!quit);
    }

    //PRIVATE METHODS
    //-- ADD Contacts
    private static void addContact(){
        System.out.println("Please enter name.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        System.out.println("Please enter number.");
        String num = keyboard.nextLine();

        Contact newContact = Contact.createNewContact(name, num);
        if(myPhone.addContact(newContact)){
            System.out.println(newContact.getName() + " has been added into Contacts.");
        }
        else{
            System.out.println(newContact.getName() + " already exist in Contacts.");
        }
    }
    //-- UPDATE Contacts
    private static void updateContact(){
        System.out.println("Please enter the name you wish to update.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        int position = myPhone.findContact(name);

        if(position >= 0){
            Contact foundContact = myPhone.getMyContacts().get(position);

            System.out.println("Please enter new name.");
            String newName = keyboard.nextLine();
            System.out.println("Please enter new number.");
            String newNumber = keyboard.nextLine();
            Contact updatedContact = Contact.createNewContact(newName, newNumber);
            //UPDATE THE CONTACT
            myPhone.updateContact(foundContact, updatedContact);
            System.out.println(foundContact.getName() + " has been replaced with " + updatedContact.getName());
        }
        else{
            System.out.println(name + " cannot be found in Contacts.");
        }
    }
    //-- FIND Contacts
    private static void findContact(){
        System.out.println("Enter the name you wish to look for.");
        keyboard.nextLine();
        String queryName = keyboard.nextLine();

        if(myPhone.queryContact(queryName)){
            return;
        }
        else{
            System.out.println(queryName + " could not be found.");
        }
    }
    //-- REMOVE contacts
    private static void removeContact(){
        System.out.println("Enter the name you wish to remove.");
        keyboard.nextLine();
        String name = keyboard.nextLine();

        if(myPhone.removeContact(name)){
            System.out.println(name + " has been removed from Contacts.");
        }
        else{
            System.out.println(name + " was not found in Contacts.");
        }
    }
}
