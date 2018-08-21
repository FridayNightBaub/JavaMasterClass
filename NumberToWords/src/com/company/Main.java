package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        numberToWords(230);

    }

    public static int getDigitCount(int num){
        int count = 0;
        if (num == 0){
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            while (num != 0){
                num /= 10;
                count++;
            }
            return count;
        }
    }

    public static int reverse(int number){

        int reversed = 0;

        while( number != 0){
            int lastDigit = number % 10;
            reversed *= 10;
            reversed += lastDigit;
            number /= 10;

        }

        return reversed;
    }

    public static void numberToWords(int num){
        int numReverse= reverse(num);
        if (num <0){
            System.out.println("Invalid Value");
        }else {
            int digitCount= getDigitCount(num);
            while (digitCount > 0) {
                int check= numReverse%10;
                switch (check) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                numReverse/=10;
                digitCount --;
            }
        }
    }


}
