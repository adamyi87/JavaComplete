package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/4/16.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    //GETTERS
    public String getName(){
        return this.name;
    }
    public ArrayList<Branch> getBranches(){
        return this.branches;
    }

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    //PUBLIC METHODS
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double amount){
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null){
            return foundBranch.newCustomers(customerName, amount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null){
            return foundBranch.addCustomerTransaction(customerName, amount);
        }
        else{
            return false;
        }
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null){
            System.out.println("Customer details for branch: " + foundBranch.getName());

            ArrayList<Customer> branchCustomers = foundBranch.getMyCustomers();
            for(int i=0; i<branchCustomers.size(); i++){
                Customer foundCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + foundCustomer.getName() + "[" + i + "]");
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = foundCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] Amount: " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

    public Branch findBranch(String name){
        for(int i=0; i<branches.size(); i++){
            Branch foundBranch = branches.get(i);
            if(foundBranch.getName().equalsIgnoreCase(name)){
                return foundBranch;
            }
        }
        return null;
    }

    public void showBranches(){
        if(branches.size() == 0){
            System.out.println("There are not current branches.");
        }
        else{
            for(int i=0; i<branches.size(); i++){
                System.out.println((i+1) + ". " + branches.get(i).getName());
            }
        }
    }

}
