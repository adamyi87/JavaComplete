package com.projekt2501;

public class Main {

    public static void main(String[] args) {
	    Animal animal1 = new Animal("Big foot", 1, 1, 8, 250);
        System.out.println("Animal1 foot print: " + "\nName: " + animal1.getName() + "\nSize category: " +
                animal1.getSize() + "\nWeighs: " + animal1.getWeight());
        System.out.println("============================");
        Dog xena = new Dog("Xena", 2, 20, 2, 4, 1, 10, "Short");
        System.out.println("Xena foot print: \n" + "Name: " + xena.getName() + "\nSize category: " + xena.getSize() +
                "\nWeighs: " + xena.getWeight());
        System.out.println("Additional information: " + "\nBrain: " + xena.getBrain());

        System.out.println("Xena will be eating now!");
        xena.eat();
        xena.move();
        animal1.move();
    }
}
