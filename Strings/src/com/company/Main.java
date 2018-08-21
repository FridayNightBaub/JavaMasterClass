package com.company;

public class Main {

    public static void main(String[] args) {
        // 8 data types
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        // these are primitive types. Defined by java language reserved by keyword.

        //Special 9th type (not a primitive type)
        // String - is a sequence of characters.

        String myString = "This is a string";
        myString = myString + " \u00A9 2018";

        System.out.println(myString + " and this some addtional text.");

        String myNumString = "250.55";

        myNumString = myNumString + "49.95";

        System.out.println("The result is " + myNumString);


        String lastString = "10";
        int myInt = 50;

        lastString = lastString + myInt;

        System.out.println(lastString);

    }
}
