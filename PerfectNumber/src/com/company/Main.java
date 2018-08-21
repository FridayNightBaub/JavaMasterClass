package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(0));
    }

    public static boolean isPerfectNumber(int number){

        int sum = 0;

        if(number == 0){
            return false;
        }

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        if(sum == number){
            return true;
        } else
            return false;

    }
}
