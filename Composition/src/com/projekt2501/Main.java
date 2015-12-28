package com.projekt2501;

public class Main {

    public static void main(String[] args) {
        Case myCase = new Case("B24E", "Beastmode", 250, new Dimension(30, 20, 8));
        Motherboard motherboard = new Motherboard("x25", "Asus", 4, 2, "v.4.33");
        Monitor monitor = new Monitor("UL3600", "Dell", 36, new Resolution(1920, 1080));

        PC gamingBeast = new PC(myCase, motherboard, monitor);

        gamingBeast.getMonitor().drawPixel(1240, 1081, "Red");

    }
}
