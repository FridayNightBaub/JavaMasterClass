package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printSquareStar(2);
    }

    public static void printSquareStar(int number) {

        if (number >= 5) {

            //loop for getting rows
            for (int row = 0; row < number; row++) {

                //loop for getting columns
                for (int cols = 0; cols < number; cols++) {

                    //checking boundary conditions
                    //and main diagonal and
                    //secondary diagonal conditions
                    if (row == 0 || cols == 0 || row == cols
                            || row == number - 1 || cols == number - 1
                            || row + cols == number - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }


    }

}
