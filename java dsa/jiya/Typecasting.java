package com.jiya;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  //      float num = input.nextFloat();
   //     int num = input.nextInt();

   //     System.out.println(num);

        //TypeCasting
 //       int num = (int)(57.8);
  //      System.out.println(num);

        // Automatic Type promotion in expressions
   //     int a = 259;
  //      byte b = (byte) (a); //259 % 256 = 3

   //     System.out.println(b);

  //      byte a = 50;
   //     byte b = 20;
  //      byte c = 30;
 //       int d = (a * b) / c;
  //      System.out.println(d);

        byte b = 42;
        char c = 'a';
        short s = 1000;
        int i = 500;
        float f = 50.33f;
        double d = 0.1234;
        double result = (f * b) + (i * c) - (d - s);
        // float + int - double = double
        System.out.println((f * b)  + " " + (i * c) + " " + (d - s));
        System.out.println(result);



    }
}
