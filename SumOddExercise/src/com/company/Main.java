package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(100, 1000));

    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {

        int sumAll = 0;

        if(end >= start && start > 0){
            for(int i=start; i<=end; i++){
                if(isOdd(i)){
                    sumAll += i;
                }
            }
        } else {
            return -1;
        }

        return sumAll;

    }
}
