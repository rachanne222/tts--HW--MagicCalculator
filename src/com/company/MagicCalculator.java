package com.company;
import java.lang.Math;

public class MagicCalculator extends Calculator {

    public static double getSquareRoot(double num1) {
        return Math.sqrt(num1);
    }

    public static double getSine(double num1) {
        return Math.sin(num1);
    }

    public static double getCosine(double num1) {
        return Math.cos(num1);
    }

    public static double getTangent(double num1) {
        return Math.tan(num1);
    }

    public static int factorial(int num1) {
        int num = num1;
        int total = num1;
        while (num-1 > 0) {
            total *= num-1;
            num--;
        }
        return total;
    }

}







