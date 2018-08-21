package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result++;
        System.out.println("Result is now " + result);

        result = result--;
        System.out.println("Result is now " + result);

        result = result+= 2;
        System.out.println("Result is now " + result);

        result = result*= 10;
        System.out.println("Result is now " + result);

        result = result-= 10;
        System.out.println("Result is now " + result);

        result = result/= 10;
        System.out.println("Result is now " + result);


        boolean isAlien = false;

        if(isAlien){
            System.out.println("It is an alien");
        } else {
            System.out.println("It is not an alien");
        }

        int topScore = 90;

        if(topScore == 100){
            System.out.println("you got the high score!");
        } else {
            System.out.println("you didn't get the high score.");
        }

        int secondTopScore = 60;

        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than top score less than 100");
        }

    }
}
