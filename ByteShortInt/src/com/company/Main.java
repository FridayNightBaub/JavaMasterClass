package com.company;

public class Main {

    public static void main(String[] args) {

        // Int has a width of 32
	    int myMinValueInt = -2_147_483_648;
        int myMaxValueInt = 2_147_483_647;

        int myIntTotal = (myMinValueInt/2);

        System.out.println(myIntTotal + " myTotal Int");

        // Byte has width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        byte myByteTotal = (byte) (myMinByteValue/2);

        System.out.println(myByteTotal + " My Total Byte");

        // Short has width of 16
        short myMinShortValue = -32_768;
        short myMaxShortValue = 32_767;

        short myNewShort = (short) (myMaxShortValue/2);

        System.out.println(myNewShort + " My Total Short");

        // Long has width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;

        long myNewLong = (myMinLongValue/2);

        System.out.println(myNewLong + " My Total Long");


        // Challenge
        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int


        byte myByteVar = 10;
        short myShortVar = 20;
        int myIntVar = 50;
        long myLongVar = 50_000L + 10 * (myByteVar + myShortVar + myIntVar);
        short shortTotal = (short) (1000 + 10 * (myByteVar + myShortVar + myIntVar));

        System.out.println("The total is: " + myLongVar);
        System.out.println("The total is: " + shortTotal);


    }
}
