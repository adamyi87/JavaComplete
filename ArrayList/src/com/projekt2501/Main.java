package com.projekt2501;

import java.util.ArrayList;

public class Main {
    public static ArrayList<String> groceryList = new ArrayList<String>();
    public static void main(String[] args) {
        groceryList.add("Paper towel");
        groceryList.add("Toilet paper");
        groceryList.add("Tooth paste");
        groceryList.add("Coke");
        printList();
        modifyList(3, "Fanta");
        printList();
        System.out.println(groceryList.size());
        System.out.println("Called received by mom. Don't buy drinks. It'll rotten your teeth.");
        removeList(3);
        printList();
        System.out.println(groceryList.size());

    }
    public static void printList(){
        System.out.println("LIST:");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ": " + groceryList.get(i));
        }
    }
    public static void modifyList(int position, String list){
        groceryList.set(position, list);
    }
    public static void removeList(int position){
        String itemRemoved = groceryList.get(position);
        groceryList.remove(position);
    }
}
