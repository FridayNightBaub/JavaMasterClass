package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'A'; //stores one value, supports unicode
        char myUnicodeChar = '\u00A9';

        System.out.println(myUnicodeChar);

        boolean myBoolean = true; //only true or false

        boolean isMale = true;

        //Challenge
        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char regSymbol = '\u00AE';

        System.out.println(regSymbol);


    }
}
