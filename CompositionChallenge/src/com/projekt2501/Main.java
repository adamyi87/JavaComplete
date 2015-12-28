package com.projekt2501;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //OBJECT INSTANTIATION ===========================
        //ADAM'S ROOM
        //PC
        Motherboard myMotherboard = new Motherboard("x2501", "Asus", "V.2.43", "ATX", 4, 2);
        Case myCase = new Case("BeastMode", "MSI", false, new Dimension(5, 10, 12));
        Monitor myMonitor = new Monitor("UL2700", "Dell", false, new Resolution(1920, 1080));
        Keyboard myKeyboard = new Keyboard("R201", "Razor", null, true);
        PC myPc = new PC(myMotherboard, myCase, myMonitor, myKeyboard);
        //BED
        Bed myBed = new Bed("MattressGiant", new Dimension(6, 10, 4), 2, 1);
        //TV
        TV myTv = new TV("S2701", "Sony", 27, new Dimension(32, 30, 3), new Resolution(1920, 1080));

        //STEVE'S ROOM
        Motherboard steveMotherboard = new Motherboard("s3800", "Apple", "v.3.00", "ATX", 8, 4);
        Case steveCase = new Case("Tower", "Apple", false, new Dimension(5, 10, 12));
        Monitor steveMonitor = new Monitor("A40D", "Apple", false, new Resolution(3840, 2160));
        Keyboard steveKeyboard = new Keyboard("Extreme201", "SteelSeries", null, true);
        PC stevePc = new PC(steveMotherboard, steveCase, steveMonitor, steveKeyboard);
        //BED
        Bed steveBed = new Bed("Temperpedic", new Dimension(10, 10, 3), 2, 1);
        //TV
        TV steveTv = new TV("SUNG48", "Samsung", 48, new Dimension(49, 40, 1), new Resolution(4096, 2160));


        //region ROOMS *** AT THE MOMENT, THIS INSTANTIATION IS USELESS. ***
        MyRoom adamRoom = new MyRoom(myPc, myTv, myBed);
        MyRoom steveRoom = new MyRoom(stevePc, steveTv, steveBed);
        //endregion

        //SCANNER
        Scanner keyboard = new Scanner(System.in);


        //WHERE IT BEGINS
        int userInput;
        boolean inRoom = true;
        boolean secondTime = false;
        do {
            if(secondTime) {
                System.out.println("What would you like to do next?");
                System.out.println("1. Use your PC. \n2. Use the bed.");
            }else {
                System.out.println("Welcome to your room.");
                System.out.println("What would you like to do?" + "\n1. Use your PC. \n2. Use the bed.");
            }
            userInput = keyboard.nextInt();
            if(userInput == 1){
                System.out.println("1. Turn on your PC. \n2. Turn on the pc's monitor. \n3. Use the keyboard to type" +
                        "\n4. Play a game.");
                int secondInput = keyboard.nextInt();
                switch(secondInput){
                    case 1:
                        if(myPc.getMyCase().getIsOnOrOff() == false){
                            System.out.println("You have turned your pc on.");
                            myPc.turnPcOnOrOff(true);
                        }else{
                            System.out.println("Your pc is already on.");
                        }
                        break;
                    case 2:
                        if(myPc.getMyMonitor().getIsOnOrOff() == false){
                            System.out.println("You have turned your pc's monitor on.");
                            myPc.turnMonitorOnOrOff(true);
                        }else{
                            System.out.println("Your monitor is already one.");
                        }
                        break;
                    case 3:
                        System.out.println("What would you like to write in your document?");
                        String document = keyboard.nextLine();
                        myPc.writeDocument(document);
                        System.out.println("Document saved.");
                        break;
                    case 4:
                        System.out.println("What game would you like to play? \nList of installed games:\n" +
                                "1. Starcraft 2. \n2. Diablo 3. \n3.Counter-strike. \n4.Metal gear solid V");
                        int game = keyboard.nextInt();
                        switch(game){
                            case 1:
                                myPc.loadGame("Starcraft 2");
                                break;
                            case 2:
                                myPc.loadGame("Diablo 3");
                                break;
                            case 3:
                                myPc.loadGame("Counter-strike");
                                break;
                            case 4:
                                myPc.loadGame("Metal gear solid V");
                                break;
                        }
                        break;
                }
            }
            else if(userInput == 2){
                System.out.println("What would you like to do?" + "\n1. Make the bed. \n2. Go to sleep");
                int thirdInput = keyboard.nextInt();
                switch(thirdInput){
                    case 1:
                        myBed.makeBed();
                        secondTime = true;
                        break;
                    case 2:
                        myBed.sleep();
                        System.out.println("Good night.");
                        inRoom = false;
                        break;
                }
            }
            if(inRoom == false){
                break;
            }else{
                System.out.println("Would you like to leave the room? \n1. Yes. \n2. No.");
                int fourthInput = keyboard.nextInt();
                switch(fourthInput){
                    case 1:
                        inRoom = false;
                        break;
                    case 2:
                        inRoom = true;
                }
            }
        }while(inRoom == true);


    }
}
