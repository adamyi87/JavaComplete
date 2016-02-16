package com.projekt2501;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player adam = new Player("Adam", 100, 50);
        System.out.println(adam.toString());
        savedToObject(adam);

        adam.setHitPoint(75);
        System.out.println(adam);

        adam.setWeapon("Hammer of death");
        savedToObject(adam);
        System.out.println(adam);

        loadToObject(adam);
        System.out.println(adam);


        //=================
        ISaveable monster = new Monster("Two-headed Mosnter", 300, 50);
        System.out.println(monster.toString());
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        do{
            System.out.println("================== Choose option ========\n" +
                    "1: Enter a value into the list.\n" +
                    "0: Exit.");
            int choice = keyboard.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter a value into the list.");
                    keyboard.nextLine();
                    String userInput = keyboard.nextLine();
                    values.add(index, userInput);
                    index += 1;
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }while(!quit);
        return values;
    }


    public static void savedToObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving: " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadToObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
