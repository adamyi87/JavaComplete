package com.projekt2501;


import java.util.Random;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String plot(){
        return "No plot.";
    }
}

class DumbAndDumber extends Movie {
    public DumbAndDumber() {
        super("Dumb and Dumber");
    }
    public String plot(){
        return "The adventure of two idiots returning a briefcase.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner(){
        super("Maze Runner");
    }
    public String plot(){
        return "A group of teenage settlers stranded in a closed environment, working together" +
                " to survive an onslaughts of strange creatures.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence day.");
    }
    public String plot(){
        return "A former U.S. air force pilot, working to bring down and obstruct an on going alien invasion.";
    }
}

class TheUglyEight extends Movie {
    public TheUglyEight(){
        super("The Ugly Eight.");
    }
    // No plot method.
}


public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " is " + movie.getName() + "\n" +
                    "plot: " + movie.plot() + "\n");
        }
    }


    public static Movie randomMovie(){
        int randomNumber = (int) (Math.ceil(Math.random() * 4));
        switch(randomNumber){
            case 1:
                return new DumbAndDumber();
            case 2:
                return new MazeRunner();
            case 3:
                return new IndependenceDay();
            case 4:
                return new TheUglyEight();
            default:
                return null;
        }
    }
}
