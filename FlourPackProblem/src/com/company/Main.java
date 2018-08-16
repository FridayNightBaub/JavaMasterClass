package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {


        if (bigCount < 0 || smallCount < 0 || goal < 0 || (bigCount * 5 + smallCount) < goal) {
            return false;
        }

        while (goal != 0){

            if(goal >= 5 && bigCount != 0){
                goal -= 5;
                bigCount--;
            } else if (smallCount != 0){
                goal -= 1;
                smallCount--;
            } else {
                return false;
            }
        }
        return true;
    }
}
