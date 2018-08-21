package com.company;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018.88";

        System.out.println("numberAsString= " + numberAsString);

//        int number = Integer.parseInt(numberAsString);
//        System.out.println("number = " + number);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println(doubleNumber);

        numberAsString += 1;
       // number += 1;
        doubleNumber += 1;

        System.out.println(numberAsString);
        System.out.println(doubleNumber);
        //System.out.println(number);

    }


}
