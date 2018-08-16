package com.company;

public class Main {

    public static void main(String[] args) {

            int count = 1;

            while(count != 6){
                System.out.println(count);
                count++;
            }

        System.out.println("************************");

            for (int i=1; i<6; i++){
                System.out.println(i);
            }

        System.out.println("************************");

            for (count = 1; count < 6; count++){
            System.out.println(count);
        }

        System.out.println("************************");

            count = 1;

            while(true){
                if(count == 6){
                    break;
                }

                System.out.println(count);
                count++;
            }

        System.out.println("************************");

            count = 1;

            do {
                System.out.println(count);
                count++;

                if(count > 100){
                    break;
                }
            } while(count != 6);

        System.out.println("************************");

        int number = 4;
        int finishNumber = 20;
        int countAll = 0;

        while(number <= finishNumber){
            number++;
            if(isEvenNumber(number)) {

                }
            }

            return;
        }



    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }

    }
}
