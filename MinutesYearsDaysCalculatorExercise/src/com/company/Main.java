package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        printYearsAndDays(5555555);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long minutesToYears = minutes / 525600;
            long remaningDays = (minutes % 525600) / 1440;

            System.out.println(minutes + " min = " + minutesToYears + " y " + "and " + remaningDays + " d");
        }
    }
}
