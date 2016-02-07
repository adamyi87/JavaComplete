package com.projekt2501;
import java.util.*;
/**
 * Created by ay-sam on 2/4/16.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> myCustomers;

    //GETTERS
    public String getName(){
        return this.name;
    }
    public ArrayList<Customer> getMyCustomers(){
        return this.myCustomers;
    }
    //CONSTRUCTOR
    public Branch(String name){
        this.name = name;
        this.myCustomers = new ArrayList<Customer>();
    }

    //PUBLIC METHODS
    public boolean newCustomers(String name, double initialAmount){
        if(findCustomer(name) == null){
            this.myCustomers.add(new Customer(name, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    //PRIVATE METHODS
    private Customer findCustomer(String name){
        for(int i=0; i<myCustomers.size(); i++){
            Customer foundCustomer = this.myCustomers.get(i);
            if(foundCustomer.getName().equalsIgnoreCase(name)){
                return foundCustomer;
            }
        }
        return null;
    }

}


