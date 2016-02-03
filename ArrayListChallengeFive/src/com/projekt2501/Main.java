package com.projekt2501;
import java.util.Scanner;
public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("8328667482");
    public static void main(String[] args) {
        boolean quit = false;
        do{
            System.out.println("===============================\n" +
                    "1: Print Contact.\n" +
                    "2: Add Contact.\n" +
                    "3: Update Contact.\n" +
                    "4: Remove Contact.\n" +
                    "5: Find Contact.\n" +
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

                    break;
                case 5:
                    findContact();
                    break;
                case 0:
                    System.out.println("Closing....");
                    quit = true;
                    break;
                default:
                    break;
            }
        }while(!quit);
    }


    //PRIVATE METHODS
    //-- ADD CONTACTS
    private static void addContact(){
        System.out.println("Enter a name.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        System.out.println("Enter a number.");
        String number = keyboard.nextLine();
        Contact contact = Contact.createNewContact(name, number);

        if(myPhone.addContact(contact)){
            System.out.println(contact.getName() + " has been added into Contact.");
        }else{
            System.out.println(contact.getName() + " already in Contact.");
        }
    }
    //-- UPDATE CONTACTS
    private static void updateContact(){
        System.out.println("Please enter the name you wish to update.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        int position = myPhone.findContact(name);

        //This if algorithm determines if the Contact name you wish to replace actually exist in your Contacts.
        if(position >= 0){
            //Looks for the name you want to replace.
            Contact oldContact = myPhone.getMyContacts().get(position);

            //Creates a new contact to replace the old.
            System.out.println("Please enter new name.");
            String newName = keyboard.nextLine();
            System.out.println("Please enter new phone number.");
            String newNumber = keyboard.nextLine();
            Contact newContact = Contact.createNewContact(newName, newNumber);
            myPhone.updateContact(oldContact, newContact);
            System.out.println(oldContact.getName() + " has been replaced with " +
                    newContact.getName());
        }
        else{
            System.out.println(name + " does not exist in Contact.");
        }
    }
    //-- FIND CONTACTS
    private static void findContact(){
        System.out.println("Enter the name you're looking for.");
        keyboard.nextLine();
        String name = keyboard.nextLine();

        if(myPhone.queryContact(name)){
            return;
        }else{
            System.out.println(name + " was not found.");
        }
    }
}
