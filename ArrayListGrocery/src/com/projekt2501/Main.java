package com.projekt2501;
import java.util.Scanner;
public class Main {
    private static GroceryList myList = new GroceryList();
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {



        boolean console = true;
        do{
            System.out.println("==========================================\n" +
                    "Please enter the following:\n" +
                    "1: Look at the grocery list.\n" +
                    "2: Add an item to the list.\n" +
                    "3: Modify an item on the list.\n" +
                    "4: Remove an item by number.\n" +
                    "5: Remove an item by name.\n" +
                    "6: Find an item by name.\n" +
                    "0: Exit the program.\n" +
                    "==========================================");
            int userInput = keyboard.nextInt();
            String item;
            int number;
            switch(userInput){
                case 1:
                    myList.printList();
                    break;
                case 2:
                    keyboard.nextLine();
                    System.out.println("Please type in the item you wish to add to the list.");
                    item = keyboard.nextLine();
                    myList.addList(item);
                    break;
                case 3:
                    myList.printList();
                    System.out.println("Which item would you like to modify? (Enter number)");
                    number = keyboard.nextInt();
                    System.out.println("Type in the item.");
                    item = keyboard.next();
                    if (number == 0) {
                        System.out.println("Number does not exist. Please try again.");
                    }
                    else{
                        myList.modifyList(number, item);
                        System.out.println("The list has been successfully modified.");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    findItemOnList();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    console = false;
                    break;
                default:
                    System.out.println("Please try again.");
            }
        }while(console);
    }
    public static void findItemOnList(){
        System.out.println("Type the item you wish to look up.");
        keyboard.nextLine();
        String userInput = keyboard.nextLine();
        myList.findItemOnList(userInput);
    }



}

