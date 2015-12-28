package com.projekt2501;

public class Main {

    public static void main(String[] args) {
        byte myByteVar = 100;
        short myShortVar = 1200;
        int myIntVar = 3500;
        long myLongVar = 50000L + 10L * (myByteVar + myShortVar + myIntVar);
        System.out.println("My long total is: " + myLongVar);
    }
}
