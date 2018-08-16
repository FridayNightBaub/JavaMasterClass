package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("The sum of the first and last digit is: " + sumFirstAndLastDigit(77777));
    }

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit;

        while (number >= 0) {

            if (number == 0) {
                return 0;
            }

            int firstDigit = (int) (Math.log10(number));
            lastDigit = number % 10;
            number = (number / (int) (Math.pow(10, firstDigit)));

            return lastDigit + number;

        }
        return -1;
    }
}
