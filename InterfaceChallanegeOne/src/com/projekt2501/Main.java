package com.projekt2501;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {








    }

    private static List<String> readValues(){
        List<String> values = new ArrayList<String>();
        boolean quit = false;
        Scanner keyboard = new Scanner(System.in);
        int index = 0;
        do{
            System.out.println("=================== STATS CONFIGURATION ====================\n" +
                    "1: Add stats to Player\n" +
                    "0: Exit\n" +
                    "=====================================================");
            int userInput = keyboard.nextInt();
            switch(userInput){
                case 1:
                    if(index < 3){
                        System.out.println("Enter value to data.");
                        keyboard.nextLine();
                        String value = keyboard.nextLine();
                        values.add(index, value);
                        index++;
                    }else{
                        System.out.println("Stats all filled out. Exiting...");
                        index = 0;
                        quit = true;
                    }
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }while(!quit);
        return values;
    }
    // objectToSave == ANY OBJECT that implements the ISaveable interface.
    private static void saveToObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){

        }
    }
    private static void loadToObject(ISaveable objectToLoad){

    }


}
