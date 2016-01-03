package com.projekt2501;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] integer = getInteger(5);
        for(int i=0; i<integer.length; i++){
            System.out.println("Index: " + i + ", Values: " + integer[i]);
        }
        System.out.println("The average of the sum of those " + integer.length + " numbers is: \r" +
                    average(integer));
    }

    private static int[] getInteger(int number){
        System.out.println("Enter " + number + " values to be stored in the array. \r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
            System.out.println("Value: " + values[i] + " has been inputted in index " + i);
        }
        return values;
    }

    private static double average(int[] number){
        int total = 0;
        for(int i=0; i<number.length; i++){
            total += number[i];
        }
        return (double) total / (double) number.length;
    }
}
