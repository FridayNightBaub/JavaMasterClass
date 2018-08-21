package com.company;

public class Main {

    public static void main(String[] args) {

        boolean findLeapYear =isLeapYear(1800);
        System.out.println(findLeapYear);
	// write your code here
    }

    public static boolean isLeapYear(int year){

        if(year < 1 || year >= 10000){
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        } else {
            return false;
        }

    }

}
