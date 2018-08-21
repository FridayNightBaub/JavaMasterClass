package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calclulateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        highScore = calclulateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score was " + highScore);


        int playerPosition = calculatedHighScorePosition(1500);
        displayHighScorePosition("Jim", playerPosition);

        playerPosition = calculatedHighScorePosition(900);
        displayHighScorePosition("Joe", playerPosition);

        playerPosition = calculatedHighScorePosition(400);
        displayHighScorePosition("Eric", playerPosition);

        playerPosition = calculatedHighScorePosition(50);
        displayHighScorePosition("Jenna", playerPosition);

        playerPosition = calculatedHighScorePosition(1000);
        displayHighScorePosition("Tim", playerPosition);

        playerPosition = calculatedHighScorePosition(500);
        displayHighScorePosition("Ben", playerPosition);

        playerPosition = calculatedHighScorePosition(100);
        displayHighScorePosition("Beau", playerPosition);

    }


    // doesn't return anything to the method
//    public static void calclulateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
//        }
//    }

    //returns finalScore back to the method

    public static int calclulateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into postion " + position + " on the high score table.");
    }

    public static int calculatedHighScorePosition(int score) {

        //        if(score >= 1000){
        //            return 1;
        //        } else if(score >= 500){
        //            return 2;
        //        } else if(score >= 100){
        //            return 3;
        //        } else {//            return 4;
        //        }

        //in below setting a variable position to contain the position 4
        //as that is the false case. This limits the number of return return statements
        int position = 4;  //assuming position 4 will be returned

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;

    }

}
