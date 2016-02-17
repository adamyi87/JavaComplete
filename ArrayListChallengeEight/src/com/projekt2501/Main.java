package com.projekt2501;
import java.util.Scanner;
public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("8328667482");
    public static void main(String[] args) {
        boolean quit = false;
        do{
            System.out.println("============ CONTACT OPTIONS ==========\n" +
                    "0: Exit\n" +
                    "1: Add Contact\n" +
                    "2: Update Contact\n" +
                    "3: Remove Contact\n" +
                    "4: Find Contact\n" +
                    "5: Print Contact\n" +
                    "===============================================");
            int userInput = keyboard.nextInt();
            switch(userInput){
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    break;
                case 5:
                    myPhone.printContacts();
                    break;
                case 0:
                    System.out.println("Exiting....");
                    quit = true;
                    break;
                default:
                    break;
            }
        }while(!quit);
    }

    private static void addContact(){
        System.out.println("Please enter the name you wish to add.");
        keyboard.nextLine();
        String name = keyboard.nextLine();

        if(myPhone.findContact(name) == null){
            System.out.println("Please enter phone number.");
            String number = keyboard.nextLine();
            Contact newContact = Contact.createNewContact(name, number);
            myPhone.addContact(newContact);
            System.out.println(newContact.getName() + " has been added to Contacts.");
        }
        else{
            System.out.println(name + " is already listed in Contact.");
        }
    }


    private static void updateContact(){
        System.out.println("Enter the name you wish to replace.");
        keyboard.nextLine();
        String oldName = keyboard.nextLine();
        Contact oldContact = myPhone.findContact(oldName);
        if(oldContact != null){
            System.out.println("Enter new name.");
            String newName = keyboard.nextLine();
            System.out.println("Enter new number.");
            String newNumber = keyboard.nextLine();

            Contact newContact = Contact.createNewContact(newName, newNumber);
            myPhone.updateContact(oldContact, newContact);

            System.out.println(oldContact.getName() + " has been replaced with: " +
                        newContact.getName());
        }
        else{
            System.out.println(oldName + " is not listed in Contacts.");
        }
    }

    private static void removeContact(){
        System.out.println("Enter the name you wish to remove from Contacts.");
        keyboard.nextLine();
        String removeName = keyboard.nextLine();

        Contact oldContact = myPhone.findContact(removeName);
        if(oldContact != null){
            myPhone.removeContact(oldContact);
            System.out.println(oldContact.getName() + " has been removed from Contacts.");
        }
        else{
            System.out.println(removeName + " could not be found in Contacts.");
        }
    }



}
