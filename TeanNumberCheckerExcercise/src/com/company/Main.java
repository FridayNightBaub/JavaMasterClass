package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isTeen = hasTeen(20,20,15);
            System.out.println(isTeen);

    }

    public static boolean hasTeen(int param1, int param2, int param3){

        if((param1 >= 13 && param1 <= 19) || (param2 >= 13 && param2 <= 19) || (param3 >= 13 && param3 <= 19)){
            return true;
        } else {
            return false;
        }
    }
}
