package com.projekt2501;

public class Main {

    public static void main(String[] args) {
	    Motherboard myMotherboard = new Motherboard("x341", "Asus", "v.3.2", 2, 4);
        Case myCase = new Case("BeastMode", "MSI", 450, new Dimension(30, 15, 8));
        Monitor myMonitor = new Monitor("UL3201", "Dell", new Resolution(1920, 1080));

        PC myAsusDesktop = new PC(myMotherboard, myCase, myMonitor);


        System.out.println("What version is the BIOS for your motherboard?");
        String biosVersion = myAsusDesktop.getMotherboard().getBios();
        System.out.println("Version: " + biosVersion);

        System.out.println("Which brand model is your monitor? " + myAsusDesktop.getMonitor().getModel());
        // GETTING THE DIMENSION SIZE OF THE CASE.
        myAsusDesktop.getMyCase().getDimension().getDimensionSize();
    }
}
