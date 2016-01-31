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
                    myPhone.printContacts();
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
                    System.out.println("Closing...");
                    quit = true;
                    break;
                default:
                    break;
            }
        }while(!quit);
    }

    //PRIVATE METHODS
    private static void addContact(){
        System.out.println("Please enter a name.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        System.out.println("Please enter a number");
        String number = keyboard.nextLine();
        Contact newContact = Contact.createNewContact(name, number);
        if(myPhone.addContact(newContact)){
            System.out.println(newContact.getName() + " has been added to Contacts.");
        }else{
            System.out.println("The Contact already exist.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter the name you wish to update.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        Contact oldContact = myPhone.queryUpdateContact(name);

        if(oldContact == null){
            System.out.println("Contact does not exist.");
        }
        else{
            System.out.println("Enter new name.");
            String newName = keyboard.nextLine();
            System.out.println("Enter new phone number.");
            String newNumber = keyboard.nextLine();
            Contact newContact = Contact.createNewContact(newName, newNumber);

            if(myPhone.updateContact(oldContact, newContact)) {
                System.out.println(oldContact.getName() + " has been replaced with " + newContact.getName());
            }
        }
    }

    private static void removeContact(){
        System.out.println("Enter the name you wish to remove.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        Contact contact = myPhone.queryUpdateContact(name);

        if(myPhone.removeContact(contact)){
            System.out.println(contact.getName() + " has been removed.");
        }
        else{
            System.out.println("Contact does not exist.");
        }
    }

    private static void findContact(){
        System.out.println("Please enter the name.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        Contact foundContact = myPhone.queryUpdateContact(name);

        if(foundContact == null){
            System.out.println("Contact cannot be found.");
        }
        else{
            System.out.println(foundContact.getName() + " has been found. Number: " + foundContact.getNumber());
        }
    }
}
