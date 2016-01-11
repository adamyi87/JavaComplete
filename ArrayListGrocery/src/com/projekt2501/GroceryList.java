package com.projekt2501;

import java.util.ArrayList;

/**
 * Created by ay-sam on 1/3/16.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //METHODS
    public void printList(){
        if(groceryList.size() != 0){
            System.out.println("LIST:");
            for(int i=0; i<groceryList.size(); i++){
                System.out.println((i+1) + ": " + groceryList.get(i));
            }
        }
        else{
            System.out.println("The list is empty.");
        }
    }

    public void addList(String list){
        groceryList.add(list);

    }

    public void modifyList(int position, String list){
        groceryList.set(position-1, list.toLowerCase());
    }

    public void removeList(int position){
        groceryList.remove(position-1);
    }

    public void removeByName(String name){
        if(groceryList.contains(name.toLowerCase())){
            int position = groceryList.indexOf(name.toLowerCase());
            groceryList.remove(position);
        }
        else{
            System.out.println("That item does not exist.");
        }
    }

    public void findItemOnList(String list){
        if(groceryList.contains(list)){
            int position = groceryList.indexOf(list);
            String item = groceryList.get(position);
            System.out.println("Found: " + item + " on list #" + (position + 1));
        }
    }
}
