package com.projekt2501;
import java.util.Scanner;
public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("832-866-7482");
    private static String name;
    private static String number;
    public static void main(String[] args) {
	    boolean quit = false;

        do{
            System.out.println("===============================\n" +
                    "1: Show Contacts.\n" +
                    "2: Add Contacts.\n" +
                    "3: Update Contacts.\n" +
                    "4: Remove Contacts.\n" +
                    "5: Find Contacts.\n" +
                    "0: Exit.\n" +
                    "============================================");
            int userInput = keyboard.nextInt();
            switch(userInput){
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Exiting.....");
                    quit = true;
                    break;
                default:
                    break;
            }
        }while(!quit);
    }

    public static void addContact(){
        System.out.println("Please enter the name of the Contact.");
        keyboard.nextLine();
        name = keyboard.nextLine();
        System.out.println("Please enter a phone number.");
        number = keyboard.nextLine();
        Contact newContact = Contact.createNewContact(name, number);
        if(myPhone.addContact(newContact)){
            System.out.println(newContact.getName() + " has been added to Contacts.");
        }
        else{
            System.out.println(newContact.getName() + " already is in Contacts.");
        }
    }
}
