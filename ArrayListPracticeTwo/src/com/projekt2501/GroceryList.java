package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 1/6/16.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addList(String item){
        groceryList.add(item);
        System.out.println("Item has been added to the list.");
    }
    public void modifyList(int index, String item){
        groceryList.set((index-1), item);
        System.out.println("Item has been modified.");
    }
    public void removeList(int number){
        groceryList.remove(number-1);
        System.out.println("The item has been removed.");
    }
    public void findList(String item){
        boolean foundItem = groceryList.contains(item);
        if(foundItem){
            int position = groceryList.indexOf(item);
            System.out.println("Found item. It was on list #" + (position+1));
        }else{
            System.out.println("Item not found.");
        }
    }

    public void printList(){
        if(groceryList.size() == 0){
            System.out.println("The grocery list is empty.");
        }
        else{
            System.out.println("LIST:");
            for(int i=0; i<groceryList.size(); i++){
                System.out.println((i+1) + ": " + groceryList.get(i));
            }
        }
    }
}
