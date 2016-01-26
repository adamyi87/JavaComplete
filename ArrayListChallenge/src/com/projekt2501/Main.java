package com.projekt2501;
import java.util.Scanner;
public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("832 866 7482");
    public static void main(String[] args) {


        boolean quit = false;
        do{
            System.out.println("=============== Available actions =============");
            System.out.println("0: Shutdown\n" +
                    "1: Show contacts\n" +
                    "2: Add new contacts\n" +
                    "3: Update contacts\n" +
                    "4: Remove contacts\n" +
                    "5: Query contacts\n" +
                    "================================================");
            int userInput = keyboard.nextInt();
            switch(userInput){
                case 1:
                    showContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;w
                case 6:
                    break;
                case 0:
                    quit = true;
                    break;
            }

        }while(!quit);

    }

    private static void showContacts(){
        myPhone.printContacts();
    }
    private static void addContact(){
        System.out.println("Enter the name.");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        System.out.println("Enter the number.");
        String number = keyboard.nextLine();
        Contact newContact = Contact.createNewContact(name, number);
        if(myPhone.addNewContacts(newContact)){
            System.out.println(name + " has been added to your Contacts.");
        }
        else{
            System.out.println(name + " is already in Contacts.");
        }
    }
}
