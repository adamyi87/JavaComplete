package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/8/16.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transaction;
    //GETTERS
    public String getName(){
        return this.name;
    }
    public ArrayList<Double> getTransaction(){
        return this.transaction;
    }
    //CONSTRUCTOR
    public Customer(String customerName, double initialAmount){
        this.name = customerName;
        this.transaction = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    //PUBLIC METHODS
    public void addTransaction(double amount){
        this.transaction.add(amount);
    }
}
