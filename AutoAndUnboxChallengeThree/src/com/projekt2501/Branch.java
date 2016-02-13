package com.projekt2501;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ay-sam on 2/12/16.
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

    //METHODS
    public boolean addNewCustomers(String customerName, double initialAmount){
        if(findCustomers(customerName)== null){
            branchCustomers.add (new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double amount){
        Customer foundCustomer = findCustomers(name);
        if(foundCustomer != null){
            foundCustomer.addTransaction(amount);
            return true;
        }
        else{
            return false;
        }
    }

    //PRIVATE
    private Customer findCustomers(String customerName){
        for(int i=0; i<branchCustomers.size(); i++){
            Customer foundCustomer = branchCustomers.get(i);
            if(foundCustomer.getName().equalsIgnoreCase(customerName)){
                return foundCustomer;
            }
        }
        return null;
    }

}
