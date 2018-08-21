package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(54, 24));
    }

//    public static int getGreatestCommonDivisor(int first, int second) {
//
//        if(first < 10 || second < 10){
//            return -1;
//        }
//
//        BigInteger x = new BigInteger("" + first);
//        BigInteger y = new BigInteger("" + second);
//        BigInteger gcd = x.gcd(y);
//
//        return gcd.intValue();
//
//    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }

        int commonDivisor = 1;
        int min = first < second ? first : second;

        for(int i = 1; i <= min; i++){
            if (first % i == 0 && second % i == 0) commonDivisor = i;
        }

        return commonDivisor;

    }
}
