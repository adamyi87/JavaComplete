package com.projekt2501;
import java.util.Scanner;
public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static Bank bank = new Bank("Wilson's Bank");
    public static void main(String[] args) {

        bank.addBranch("Houston Branch");
        bank.addCustomer("Houston branch", "Adam Yi", 200.00);
        bank.addCustomerTransaction("Houston branch", "adam yi", 34.82);



        bank.addBranch("Dallas Branch");
        bank.addCustomer("Dallas Branch", "Steve Yi", 50.50);





        bank.listCustomers("dallas branch", true);
        bank.listCustomers("houston branch", true);
        boolean quit = false;
        do{
            System.out.println("============ BANKING APPLICATION ==============\n" +
                    "1: Add branch.\n" +
                    "2: Add new customer.\n" +
                    "3: Add customer transaction.\n" +
                    "4: Show customers transaction history.\n" +
                    "5: Show current listed Bank branches.\n" +
                    "0: Exit program.\n" +
                    "========================================");
            int userInput = keyboard.nextInt();
            switch(userInput){
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    break;
                case 4:
                    showCustomerList();
                    break;
                case 5:
                    bank.showBranches();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    quit = true;
                    break;
                default:
                    break;
            }
        }while(!quit);
    }

    private static void addBranch(){
        System.out.println("Enter the new branch.");
        keyboard.nextLine();
        String newBranch = keyboard.nextLine();
        if(bank.addBranch(newBranch)){
            System.out.println(newBranch + " has been added in the database.");
        }else{
            System.out.println(newBranch + " already exist in the database.");
        }
    }
    private static void addCustomer(){
        System.out.println("Which branch?");
        keyboard.nextLine();
        String branchName = keyboard.nextLine();
        Branch foundBranch = bank.findBranch(branchName);
        if(foundBranch != null){
            System.out.println("Enter the new customer's name.");
            String newCustomer = keyboard.nextLine();
            System.out.println("Initial transaction amount.");
            Double initialAmount = keyboard.nextDouble();

            if(bank.addCustomer(branchName, newCustomer, initialAmount)){
                System.out.println("New customer has been added.");
            }
            else{
                System.out.println("Customer already exist. Cannot create new Customer.");
            }
        }
    }
    private static void addCustomerTransaction(){

    }

    private static void showCustomerList(){
        System.out.println("Enter the branch to see the Customer's information.");
        keyboard.nextLine();
        String branchName = keyboard.nextLine();
        if(bank.findBranch(branchName) != null){
            System.out.println("Show all transactions? Y\\N");
            String yesOrNo = keyboard.next();
            boolean transaction;
            if(yesOrNo == "Y" || yesOrNo == "y"){
                transaction = true;
                if(bank.listCustomers(branchName, transaction)){
                    return;
                }
            }else {
                transaction = false;
                if(bank.listCustomers(branchName, transaction)){
                    return;
                }
            }
        }
        else{
            System.out.println("Branch does not exist. Please try again.");
        }
    }
}
