package com.projekt2501;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integer = getInteger(5);
        System.out.println("The average for the scores is: " + average(integer));
    }

    public static int[] getInteger(int number){
        int[] values = new int[number];
        System.out.println("Please enter " + values.length + " values that will be stored in the array.\r");
        for(int i=0; i<values.length; i++){
            values[i] = keyboard.nextInt();
            System.out.println("The value: " + values[i] + " is placed in index " + i);
        }
        return values;
    }
    public static double average(int[] values){
        double total = 0;
        for(int i=0; i<values.length; i++){
            total += values[i];
        }
        return total / values.length;
    }
}
