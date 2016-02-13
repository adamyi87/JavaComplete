package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 2/12/16.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    //GETTERS
    public String getName(){
        return this.name;
    }
    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }
    //CONSTRUCTOR
    public Customer(String name, double amount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(amount);
    }

    //METHODS
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }
}
