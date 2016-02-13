package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/12/16.
 */
public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public String getBankName(){
        return this.bankName;
    }
    public ArrayList<Branch> getBranches(){
        return this.branches;
    }

    public Bank(String bankName){
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    //METHODS
    public boolean addBranch(String branchName){
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null) {
            return false;
        }
        else{
            branches.add(foundBranch);
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null){
            foundBranch.addNewCustomers(customerName, initialAmount);
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(){

    }


    private Branch findBranch(String branchName){
        for(int i=0; i<branches.size(); i++){
            Branch foundBranch = branches.get(i);
            if(foundBranch.getBranchName().equalsIgnoreCase(branchName)){
                return foundBranch;
            }
        }
        return null;
    }
}
