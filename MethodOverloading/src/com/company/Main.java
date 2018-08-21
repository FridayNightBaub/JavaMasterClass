package com.company;

public class Main {

    public static void main(String[] args) {

       int newScore = calculateScore("Bob", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();


        double calcFeet = calcFeetAndInchesToCentimeters(13);
        System.out.println(calcFeet);

    }

    //exercise

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet >= 0) && (inches >=0 && inches <= 12)){
            //convert feet and inches to centimeters
            //1 inch - 2.54 cm and foot = 12 inches
            double convertFeetCentimeters = (12 * 2.54) * feet;
            double convertInchesCentimeters = 2.54 * inches;
            double feetAndInchesToCentimeters = convertFeetCentimeters + convertInchesCentimeters;

            return feetAndInchesToCentimeters;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >=0) {
            double calcFeet = (int)inches / 12;
            double remainingInches = (int) inches % 12;

            return calcFeetAndInchesToCentimeters(calcFeet,remainingInches);
        }
           return -1;
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }


}
