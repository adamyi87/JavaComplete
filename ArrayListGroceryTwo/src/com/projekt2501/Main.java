package com.projekt2501;
import java.util.Scanner;
public class Main {
    private static GroceryList myList = new GroceryList();
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int userInput;

        boolean usingProgram = true;
        do{
            System.out.println("========== What would you like to do? ==========\n" +
                    "1: Print the list of items from the grocery list.\n" +
                    "2: Add an item to the grocery list.\n" +
                    "3: Modify an existing item.\n" +
                    "4: Remove an item from the list.\n" +
                    "5: Look for an item on the list.\n" +
                    "0: Exit program.\n" +
                    "===================================================");
            userInput = keyboard.nextInt();
            switch(userInput){
                case 1:
                    printItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Exiting program");
                    usingProgram = false;
                    break;
                default:
                    break;

            }
        }while(usingProgram);

    }

    //#region METHODS
    public static void printItem(){
        myList.printList();
    }
    public static void addItem(){
        System.out.println("Please type the item you wish to add to the list.");
        keyboard.nextLine();
        String item = keyboard.nextLine();
        myList.addList(item);
    }
    public static void modifyItem(){
        if(myList.getGroceryList().size() == 0){
            System.out.println("No item to modify. The list is empty.");
        }
        else{
            myList.printList();
            System.out.println("Please type in the number you wish to modify.");
            keyboard.nextLine();
            int number = keyboard.nextInt();
            System.out.println("Please type in the new item.");
            keyboard.nextLine();
            String item = keyboard.nextLine();
            myList.modifyList(number, item);
        }
    }
    public static void removeItem(){
        
    }
    //#endregion

}
