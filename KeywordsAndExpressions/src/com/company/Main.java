package com.company;

public class Main {

    public static void main(String[] args) {

        //a mile is equal to 1.609344
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if(highScore == 50) {
            System.out.println("This is an expression");
        }

        //challenge:
        // in the following code write down what parts of code are expressions

        int score = 100; //expression is score = 100
        if(score > 90) { //expression is score > 90
            System.out.println("You got the high score");
            //expression is You got the high score

            score = 0; //expression score = 0
        }
    }
}
