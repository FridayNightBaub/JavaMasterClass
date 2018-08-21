package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }

        int switchValueTwo = 2;

        switch (switchValueTwo) {
            case 1:
            case 2:
            case 3:
                System.out.println("was a 1, 2 or 3");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }

        //create a new switch statement using char instead of int
        //create a new char variable
        //create a switch statement testing for A,B,C,D or E
        //display a message if any of these are found and then break
        //Add default which displays saying not found

        char switchChar = 'G';

        switch(switchChar){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(switchChar + " was found");
                break;
            default:
                System.out.println("Was not A, B, C, D or an E");
                break;

        }

        String month = "January";

        switch(month.toLowerCase()){
            case "january":
                System.out.println(month);
                break;
            case "february":
                System.out.println(month);
                break;
            case "march":
                System.out.println(month);
        }

    }


}
