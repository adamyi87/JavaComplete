package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/4/16.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches;
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

    //PRIVATE METHODS
    private Branch findBranch(String name){
        for(int i=0; i<branches.size(); i++){
            Branch foundBranch = branches.get(i);
            if(foundBranch.getName().equalsIgnoreCase(name)){
                return foundBranch;
            }
        }
        return null;
    }

}
