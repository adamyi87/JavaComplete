package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by adam on 1/12/2016.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    //region METHODS
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
    public void addItem(String item){
        if(groceryList.size() == 0){
            groceryList.add(item);
            System.out.println(item + " has been added on the list.");
        }
        else{
            if(findItem(item) >= 0){
                System.out.println("Already on the list.");
            }
            else{
                groceryList.add(item);
                System.out.println(item + " has been added on the list.");
            }
        }
    }
    public void modifyItem(String item, String newItem){
        if(findItem(item) >= 0){
            int position = findItem(item);
            groceryList.set(position, newItem);
            System.out.println(item + " has been modified.");
        }
        else{
            System.out.println(item + " does not exist on the list.");
        }
    }
    public void removeItem(String item){
        if(findItem(item) >= 0){
            int position = findItem(item);
            groceryList.remove(position);
            System.out.println(item + " has been removed.");
        }
        else{
            System.out.println(item + " does not exist on the list.");
        }
    }
    //1.Adam 0
    //2.Steve 1
    //3.David 2
    public void findItemOnList(String item){
        if (findItem(item) >= 0) {
            int position = groceryList.indexOf(item);
            position += 1;
            System.out.println(position + ": " + item + ". FOUND.");
        }
        else{
            System.out.println(item + " was not found.");
        }
    }

    private int findItem(String item){
        for(int i=0; i<groceryList.size(); i++){
            if(groceryList.get(i).toLowerCase().equals(item.toLowerCase())){
                return i;
            }
        }
        return -1;
    }
    //endregion
}
