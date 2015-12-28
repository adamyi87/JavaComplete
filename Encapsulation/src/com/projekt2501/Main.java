package com.projekt2501;

public class Main {

    public static void main(String[] args) {
        Printer homePrinter = new Printer(40, false);
        System.out.println("The current toner level is: " + homePrinter.getTonerLevel());
        homePrinter.addInkToner(200);
        System.out.println("The current toner level is: " + homePrinter.getTonerLevel());
        homePrinter.print(5);
        System.out.println(homePrinter.getQueuePages());
    }
}
