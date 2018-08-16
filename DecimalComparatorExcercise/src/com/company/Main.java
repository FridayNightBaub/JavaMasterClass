package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isEqual = areEqualByThreeDecimalPlaces(3.176, 3.175);

        System.out.println(isEqual);
    }

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2){

        int compareParam1 = (int)(param1 * 1000);
        int compareParam2 = (int)(param2 * 1000);

        System.out.println(compareParam1);
        System.out.println(compareParam2);

        if(compareParam1 == compareParam2){
            return true;
        } else {
            return false;
        }

    }
}
