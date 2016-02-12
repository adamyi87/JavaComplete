package com.projekt2501;
import java.util.Scanner;
public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static MobilePhone adam = new MobilePhone("123");
    public static void main(String[] args) {
        boolean quit = false;
        do{
            System.out.println("===============================\n" +
                    "1: Print Contact\n" +
                    "2: Add Contact\n" +
                    "3: Update Contact\n" +
                    "4: Remove Contact\n" +
                    "5: Find Contact\n" +
                    "0: Quit\n" +
                    "========================================");
            int userInput = keyboard.nextInt();
            switch(userInput){
                case 1:
                    adam.printContacts();
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
                    break;
                case 0:
                    quit = true;
                    break;
            }

        }while(!quit);
    }

    //PRIVATE METHODS
    private static void addContact(){
        System.out.println("Please enter name.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        System.out.println("Please enter number");
        String number = keyboard.nextLine();

        Contact newContact = Contact.createNewContact(name, number);
        if(adam.addContact(newContact)){
            System.out.println(name + " has been added to Contact.");
        }
        else{
            System.out.println("Already in Contacts.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter the name you wish to update.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        Contact oldContact = adam.findContact(name);
        if(oldContact != null) {
            System.out.println("Enter new name.");
            String newName = keyboard.nextLine();
            System.out.println("Enter new phone number.");
            String newNumber = keyboard.nextLine();

            Contact newContact = Contact.createNewContact(newName, newNumber);
            if (adam.updateContact(oldContact, newContact)) {
                System.out.println(newContact.getName() + " has been added to Contacts.");
            }
        }
        else{
            System.out.println(name + " could not be found.");
        }

    }

    private static void removeContact(){
        System.out.println("Enter the name you wish to remove.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        Contact foundContact = adam.findContact(name);
        if(adam.removeContact(foundContact)){
            System.out.println(foundContact.getName() + " has been removed.");
        }
        else{
            System.out.println(name + " does not exist in Contacts.");
        }

    }

}
