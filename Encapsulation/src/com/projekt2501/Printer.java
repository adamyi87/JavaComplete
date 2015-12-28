package com.projekt2501;

/**
 * Created by ay-sam on 12/27/15.
 */
public class Printer {
    private int tonerLevel;
    private int tonerBackup;
    private int queuePages;
    private boolean isDuplexPrinter;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getTonerBackup() {
        return tonerBackup;
    }

    public int getQueuePages() {
        return queuePages;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    //CONSTRUCTOR
    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if(tonerLevel < 0 && tonerLevel > 100){
            System.out.println("The default toner level will be set to 50");
            this.tonerLevel = 50;
        }else{
            this.tonerLevel = tonerLevel;
        }
        this.tonerBackup = 100;
        this.queuePages = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }



    //METHODS
    public void addInkToner(int amount){
        if(this.tonerLevel > 0 && this.tonerLevel <=100){
            if(amount + this.tonerLevel > 100){
                int difference = (amount + this.tonerLevel) - 100 ;
                System.out.println("The amount: " + amount + " is too much. We'll put as much as we can.");
                amount -= difference;
                this.tonerLevel += amount;
                this.tonerBackup += difference;
                System.out.println("The remaining ink will be stored in the backup. The total for the backup is: " +
                        this.tonerBackup);
            }else{
                this.tonerLevel += amount;
                System.out.println("The toner level is at: " + this.tonerLevel);
            }
        }else{
            System.out.println("Error");
        }
    }

    public void print(int pages){
        this.queuePages += pages;
        System.out.println("Printing: " + pages + " of pages.");
        System.out.println("Print complete!");
        this.queuePages = 0;
    }
}
