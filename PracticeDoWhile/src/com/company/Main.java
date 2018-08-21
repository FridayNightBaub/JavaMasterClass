package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int number){

        int num = number;
        int reverse = 0;
        int lastDigit;

        while(number != 0){
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;

        }

        if(reverse == num){
            return true;
        }
        return false;

    }
}
