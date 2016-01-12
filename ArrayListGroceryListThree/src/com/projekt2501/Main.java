package com.projekt2501;

import java.util.Scanner;

public class Main {
    private static GroceryList myList = new GroceryList();
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        boolean usingProgram = true;
        do{
            System.out.println("======= GROCERY LIST PROGRAM =======\n" +
                    "1: Print the grocery list.\n" +
                    "2: Add an item to the grocery list.\n" +
                    "3: Modify an item in the grocery list.\n" +
                    "4: Remove an item from the list.\n" +
                    "5: Find an item in the grocery list.\n" +
                    "0: Exit program.\n" +
                    "================================================");
            int userInput = keyboard.nextInt();
            switch(userInput){
                case 1:
                    printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    usingProgram = false;
                    break;
                default:
                    break;
            }
        }while(usingProgram);

    }

    private static void printList(){
        myList.printList();
    }
    private static void addItem(){
        System.out.println("Please enter the item you wish to add to the list.");
        keyboard.nextLine();
        String item = keyboard.nextLine();
        myList.addItem(item);
    }
    private static void modifyItem(){
        myList.printList();
        System.out.println("Please type the item you wish to modify.");
        keyboard.nextLine();
        String item = keyboard.nextLine();
        System.out.println("Please type in the NEW item.");
        String newItem = keyboard.nextLine();
        myList.modifyItem(item, newItem);
    }
    private static void removeItem(){
        myList.printList();
        System.out.println("Type in the item you wish to remove.");
        keyboard.nextLine();
        String item = keyboard.nextLine();
        myList.removeItem(item);
    }
    private static void findItem(){
        System.out.println("Type the item you wish to look for.");
        keyboard.nextLine();
        String item = keyboard.nextLine();
        myList.findItemOnList(item);
    }
}
