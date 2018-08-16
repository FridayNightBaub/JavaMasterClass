package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isBarking = bark(true, 23);
        System.out.println(isBarking);

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if(barking == false || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if(barking == true && hourOfDay >= 0 && hourOfDay < 8) {
            return true;
        } else if(barking == false && hourOfDay >= 8 || hourOfDay <= 22){
            return false;
        } else {
            return true;
        }
    }
}
