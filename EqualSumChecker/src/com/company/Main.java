package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isEqual = hasEqualSum(1,2,3);

        System.out.println(isEqual);

    }

    public static boolean hasEqualSum(int param1, int param2, int param3){

        int sumParams = param1 + param2;

        if(sumParams == param3){
            return true;
        } else {
            return false;
        }
    }
}
