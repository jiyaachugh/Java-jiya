package com.jiya;

import java.util.Scanner;

public class TemperatureConversionProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter TEMPERATURE in C; ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);

    }
}
