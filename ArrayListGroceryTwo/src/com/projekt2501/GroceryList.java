package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 1/10/16.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //Methods
    public void printList(){
        if(groceryList.size() == 0){
            System.out.println("The grocery list is empty.");
        }
        else{
            for(int i=0; i<groceryList.size(); i++){
                System.out.println((i+1) + ": " + groceryList.get(i));
            }
        }
    }

    public void addList(String item){
        if(groceryList.size() == 0){
            groceryList.add(item);
            System.out.println(item + " has been added to the list.");
        }
        else{
            if(findItemOnList(item) >= 0){
                System.out.println("Already on the list.");
            }
            else{
                groceryList.add(item);
                System.out.println(item + " has been added to the list.");
            }
        }
    }

    public void modifyList(int number, String item){
        groceryList.set((number-1), item);
        System.out.println("Item #" + number + " has been replaced with " + item);
    }
    public void removeList(int number){
        groceryList.remove(number-1);
        System.out.println("Item: " + (number) + " has been removed.");
    }
    public void findItem(String item){
        if(findItemOnList(item) >= 0){
            System.out.println("The item " + item + " was found on #" + groceryList.indexOf(item+1));
        }
        else{
            System.out.println("The item was not on the list.");
        }

    }
    private int findItemOnList(String item){
        for(int i=0; i<groceryList.size(); i++){
            if(groceryList.get(i).toLowerCase().equals(item.toLowerCase())){
                return i;
            }
        }
        return -1;
    }

}
