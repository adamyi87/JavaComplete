package com.projekt2501;
import java.util.Scanner;
public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("832-866-7482");

    public static void main(String[] args) {
        boolean quit = false;

        do{
            System.out.println("====== PHONE OPTIONS ======");
            System.out.println("0: Exit.\n" +
                    "1: Show Contacts.\n" +
                    "2: Add new Contact.\n" +
                    "3: Update Contact.\n" +
                    "4: Remove Contact.\n" +
                    "5: Find Contact.");
            int userInput = keyboard.nextInt();
            switch(userInput){
                case 0:
                    System.out.println("Closing...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }while(!quit);
    }

    //PRIVATE METHODS
    private static void printContacts(){
        myPhone.printContacts();
    }

    private static void addContacts(){
        System.out.println("Please enter a name.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        System.out.println("Please enter phone number.");
        String number = keyboard.nextLine();
        Contact contact = Contact.createNewContact(name, number);
        if(myPhone.addContact(contact)){
            System.out.println(contact.getName() + ", has been added to Contacts.");
        }
        else{
            System.out.println(contact.getName() + ", already exist in Contacts.");
        }
    }

    private static void updateContacts(){
        myPhone.printContacts();
        System.out.println("");
    }

    private static void removeContacts(){

    }
}
