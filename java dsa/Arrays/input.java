package com.jiya;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ARRAYS OF PRIMITIVES

        int[] arr = new int[5];
        arr[0] = 13;
        arr[1] = 11;
        arr[2] = 45;
        arr[3] = 111;
        arr[4] = 405;
//    internally {13,11,45,111,405}
        System.out.println(arr[3]);
//
//        // input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int j : arr) {
//            System.out.println(j + " ");
//        }
//
//        for (int num : arr) { // for every element in array, print the element
//            System.out.print(num + " "); // here num represents element of the array
//
//        }
//        System.out.println(arr[5]); // index out of bound error

        // ARRAYS OF OBJECTS
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++);{
//            str[i] = in.next();
//
//        }
//        System.out.println(Arrays.toString(str));
//
//        // modify
//        str[1] = "Jiya";
//        System.out.println(Arrays.toString(str));


    }
}
