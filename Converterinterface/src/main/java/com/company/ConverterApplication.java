package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConverterApplication {
    public static void main(String[] args){

        //setup objects
        Scanner scan = new Scanner(System.in);
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

        //Month Conversion track
        System.out.println("========== Month Conversion ==========");
        System.out.println("Enter integer between 1 and 12 to convert to month");
        int monthNumber = parseInt(scan.nextLine());
        System.out.println("ConverterIf Result: " + converterIf.convertMonth(monthNumber));
        System.out.println("ConverterSwitch Result: " + converterSwitch.convertMonth(monthNumber));
        System.out.println("======================================" + "\n");

        //Day Conversion track
        System.out.println("=========== Day Conversion ===========");
        System.out.println("Enter integer between 1 and 7 to convert to month");
        int dayNumber = parseInt(scan.nextLine());
        System.out.println("ConverterIf Result: " + converterIf.convertDay(dayNumber));
        System.out.println("ConverterSwitch Result: " + converterSwitch.convertDay(dayNumber));
        System.out.println("======================================");


    }
}
