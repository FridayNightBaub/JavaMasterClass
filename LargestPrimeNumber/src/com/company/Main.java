package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(getLargestPrime(1));

    }

    public static int getLargestPrime(int number) {


        if (number <= 1) {
            return -1;
        }

        int i;
        long copyOfInput = number;

        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }

        return i;

    }
}
