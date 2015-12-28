package com.projekt2501;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = CalculateHighScorePosition(1500);
        DisplayHighScorePosition("Steve", highScorePosition);

        highScorePosition = CalculateHighScorePosition(900);
        DisplayHighScorePosition("Adam", highScorePosition);

        highScorePosition = CalculateHighScorePosition(400);
        DisplayHighScorePosition("Donna", highScorePosition);

        highScorePosition = CalculateHighScorePosition(50);
        DisplayHighScorePosition("David", highScorePosition);

    }
    public static void DisplayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position: " + highScorePosition +
                " on the high score table.");
    }
    public static int CalculateHighScorePosition(int playerScore){
        if(playerScore > 1000){
            return 1;
        }
        else if(playerScore > 500){
            return 2;
        }
        else if(playerScore > 100){
            return 3;
        }
        else{
            return 4;
        }
    }
}
