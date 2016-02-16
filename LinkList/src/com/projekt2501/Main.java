package com.projekt2501;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> placesToVisit = new ArrayList<String>();

        placesToVisit.add("Houston");
        placesToVisit.add("Dallas");
        placesToVisit.add("San Antonio");

        printList(placesToVisit);


        placesToVisit.add(1, "Tidwell");
        printList(placesToVisit);

        //====================== Advantages of a LinkedList  =======================

        LinkedList<String> placesToVisitAgain = new LinkedList<String>();

        placesToVisitAgain.add("Sydney");
        placesToVisitAgain.add("Melbourne");
        placesToVisitAgain.add("Brisbane");
        placesToVisitAgain.add("Perth");



    }

    //METHODS
    private  static void printList(ArrayList<String> arrayList){
        for(int i=0; i<arrayList.size(); i++){
            System.out.println("Places to visit: " + arrayList.get(i));
        }
    }

    private static boolean printLinkedList(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();


        while(stringListIterator.hasNext()){
            //If .compareTo method returns 0, that value = to the current index value.
            //If it returns a 1,
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity + " that city is already in the list.");
                return false;
            }
            else if(comparison > 0){
                //Meaning if comparison is = 1, it'll be placed BEFORE the current index.
                //BUT since .next() method moves on to the next Index, you have to go back to the previous index.
                //EX. Sydney -> Melbourne
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison < 0){
                //Moves on to the next city.
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

}
