package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/8/16.
 */
public class Branch {
    private String branchName;
    private ArrayList<Customer> branchCustomers;
    //GETTERS
    public String getBranchName(){
        return this.branchName;
    }
    public ArrayList<Customer> getBranchCustomers(){
        return this.branchCustomers;
    }

    //CONSTRUCTOR
    public Branch(String branchName){
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<Customer>();
    }

    //PUBLIC METHODS
    public boolean addNewCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.branchCustomers.add(new Customer(customerName, initialAmount));
            return true;
        }
        else{
            return false;
        }
    }
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer foundCustomer = findCustomer(customerName);
        if(foundCustomer != null){
            foundCustomer.addTransaction(amount);
            return true;
        }
        else{
            return false;
        }
    }

    //PRIVATE METHODS
    private Customer findCustomer(String customerName){
        for(int i=0; i<branchCustomers.size(); i++){
            Customer foundCustomer = branchCustomers.get(i);
            if(foundCustomer.getName().equalsIgnoreCase(customerName)){
                return foundCustomer;
            }
        }
        return null;
    }
}
