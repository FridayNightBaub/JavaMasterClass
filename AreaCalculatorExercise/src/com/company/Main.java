package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(area(5.8,88));


    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double areaCircle = (radius * radius) * 3.14159;
            return areaCircle;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            double areaRectangle = x * y;

            return areaRectangle;
        }
    }
}
