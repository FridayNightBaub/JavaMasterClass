package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;
        int sum = 0;
        int count = 1;


        Scanner scanner = new Scanner(System.in);

        while (count <= 10) {

            System.out.println("Enter number #" + count + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                System.out.println("Unable to parse number");
            }
            scanner.nextLine();
        }

        System.out.println("The sum of all the numbers is: " + sum);

        scanner.close();

    }
}
