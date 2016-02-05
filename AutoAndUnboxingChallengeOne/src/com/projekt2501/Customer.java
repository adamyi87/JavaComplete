package com.projekt2501;
import java.util.ArrayList;
/**
 * Created by ay-sam on 2/4/16.
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

    //CONSTRUCTORS
    public Customer(String name, double initialAmount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }



    //PUBLIC METHODS
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

}
