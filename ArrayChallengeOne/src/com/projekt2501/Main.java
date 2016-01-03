package com.projekt2501;
import java.util.Scanner;
public class Main {

    private static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        int[] integers = getIntegers(5);
        printArray(integers);

    }






    public static int[] getIntegers(int number){
        int[] values = new int[number];
        System.out.println("Please enter " + number + " values to be stored in the array.\r");
        for(int i=0; i<number; i++){
            values[i] = keyboard.nextInt();
        }
        return values;
    }
    public static void printArray(int[] number){
        for(int i=0; i<number.length; i++){
            System.out.println("Index: " + i + ", Value: " + number[i]);
        }
    }
    public static int[] sortIntegers(int[] number){
        
    }

}
