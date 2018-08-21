package com.company;

public class Main {

    public static void main(String[] args) {

        //init; termination; increment
        for(int i=2; i<9; i++){
            System.out.println("10,000 at " + i + " interest = " +
                    String.format("%.2f",calculateInterest(10000d, (double)i)));
        }

        System.out.println("*****************************");

        //init; termination; increment
        for(int i=8; i>1; i--){
            System.out.println("10,000 at " + i + " interest = " +
                    String.format("%.2f",calculateInterest(10000d, (double)i)));
        }

        int number = 0;

        for(int i=10; i<50; i++){

            if(isPrime(i)){
                number++;
                System.out.println("Number " + i + " is a prime number");
                if(number == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }

        }

    }

    public static boolean isPrime(int n) {
        if(n == 1){
            return false;
        }

        for(int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate){
            return(amount *(interestRate/100));
    }

}
