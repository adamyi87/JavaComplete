package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/8/16.
 */
public class Bank {
    private String bankName;
    private ArrayList<Branch> bankBranch;

    //GETTERS
    public String getBankName(){
        return this.bankName;
    }
    public ArrayList<Branch> getBankBranch(){
        return this.bankBranch;
    }

    //CONSTRUCTOR
    public Bank(String bankName){
        this.bankName = bankName;
        this.bankBranch = new ArrayList<Branch>();
    }



    //PUBLIC METHODS
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.bankBranch.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null){
            foundBranch.addNewCustomer(customerName, initialAmount);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null){
            foundBranch.addCustomerTransaction(customerName, amount);
            return true;
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean transaction){
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null){
            System.out.println("====================================\n" +
                    "Details of customers in Branch: " + foundBranch.getBranchName());
            ArrayList<Customer> branchCustomers = foundBranch.getBranchCustomers();
            for(int i=0; i<branchCustomers.size(); i++){
                System.out.println((i+1) + ": " + branchCustomers.get(i).getName());
                if(transaction){
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransaction();
                    for(int j=0; j<transactions.size(); j++){
                        System.out.println("Transaction #" + (j+1) + " ---- " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        else{
            return false;
        }

    }

    //PRIVATE METHODS
    private Branch findBranch(String branchName){
        for(int i=0; i<bankBranch.size(); i++){
            Branch foundBranch = bankBranch.get(i);
            if(foundBranch.getBranchName().equalsIgnoreCase(branchName)){
                return foundBranch;
            }
        }
        return null;
    }
}
