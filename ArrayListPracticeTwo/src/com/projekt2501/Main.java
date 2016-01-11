package com.projekt2501;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        GroceryList myList = new GroceryList();
        boolean usingProgram = true;
        while(usingProgram){
            int userInput;
            String item;
            int number;
            System.out.println("=============================================");
            System.out.println("Please enter the number you wish to execute.");
            System.out.println("1: Print out the grocery list\n" +
                                "2: Add to the list.\n" +
                                "3: Remove from the list.\n" +
                                "4: Find an item on the list.\n" +
                                "5: Modify the list.\n" +
                                "6: Exit.");
            userInput = keyboard.nextInt();
            switch(userInput){
                case 1:
                    myList.printList();
                    break;
                case 2:
                    System.out.println("Please enter the item you wish to add to the list.");
                    keyboard.nextLine();
                    item = keyboard.nextLine();
                    myList.addList(item);
                    break;
                case 3:
                    myList.printList();
                    System.out.println("Please enter the number you wish to remove from the list.");
                    keyboard.nextLine();
                    number = keyboard.nextInt();
                    myList.removeList(number);
                    break;
                case 4:
                    System.out.println("Type in the item you are looking for.");
                    keyboard.nextLine();
                    item = keyboard.nextLine();
                    myList.findList(item);
                    break;
                case 5:
                    myList.printList();
                    System.out.println("Which item would you like to modify? (Enter a number.)");
                    number = keyboard.nextInt();
                    System.out.println("What is the item?");
                    keyboard.nextLine();
                    item = keyboard.nextLine();
                    myList.modifyList(number, item);
                    break;
                case 6:
                    usingProgram = false;
                    break;
                default:
                    break;
            }

        }
    }
}
