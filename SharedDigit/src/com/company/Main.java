package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(hasSharedDigit(21, 92));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 <= 9 || num1 >= 100) && (num2 <= 9 || num2 >= 100)) {
            return false;
        }

        while ((num1 > 9 && num1 < 100) && (num2 > 9 && num2 < 100)) {
            int lastDigitNum1 = num1 % 10;
            int lastDigitNum2 = num2 % 10;

            num1 /= 10;
            num2 /= 10;

            System.out.println(lastDigitNum1 + " " + lastDigitNum2);
            System.out.println(num1 + " " + num2);
            System.out.println(lastDigitNum1 + " " + num2);
            System.out.println(lastDigitNum2 + " " + num1);

            if (lastDigitNum1 == lastDigitNum2 || num1 == num2 || lastDigitNum1 == num2 || lastDigitNum2 == num1) {
                return true;
            } else {
                return false;
            }


        }

        return false;
    }
}
