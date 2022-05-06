package com.company;

import java.util.Scanner;

public class AppCalculator {

    public static void main(String[] args){

        //setup objects
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("========== Joe's Calculator ==========" + "\n");
        System.out.println("Example calculations: " + "\n");
        System.out.println("Calculation : 1 + 1");
        System.out.println("Result : " + calc.add(1,1) + "\n");
        System.out.println("Calculation : 23 - 52");
        System.out.println("Result : " + calc.subtract(23,52) + "\n");
        System.out.println("Calculation : 34 * 2");
        System.out.println("Result : " + calc.multiply(32,2) + "\n");
        System.out.println("Calculation : 12 / 3");
        System.out.println("Result : " + calc.divide(12,3) + "\n");
        System.out.println("Calculation : 12 / 7");
        System.out.println("Result : " + calc.divide(12,7) + "\n");
        System.out.println("Calculation : 3.4 + 2.3");
        System.out.println("Result : " + calc.add(3.4,2.3) + "\n");
        System.out.println("Calculation : 6.7 * 4.4");
        System.out.println("Result : " + calc.multiply(6.7,4.4) + "\n");
        System.out.println("Calculation : 5.5 - 0.5");
        System.out.println("Result : " + calc.subtract(5.5,0.5) + "\n");
        System.out.println("Calculation : 10.8 / 2.2");
        System.out.println("Result : " + calc.divide(10.8,2.2) + "\n");
        System.out.println("======================================");

    }

}
