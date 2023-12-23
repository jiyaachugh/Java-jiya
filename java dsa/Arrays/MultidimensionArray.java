package com.jiya;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {
    /*
      1 2 3
      4 5 6
        7 8 9
     */

//    int[][] arr = new int[3][]; // no of rows is mandatory, pehle row then column
        Scanner in = new Scanner(System.in);

//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, //1st index
//                {6, 7, 8, 9}, //2nd index --> arr[2] = {6,7,8,9}
//    };

        int arr[][] = new int[3][3];
        System.out.println(arr.length); // no of rows

        // input

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            int col;
            for (col = 0; col < arr[row].length; col++) ;
            arr[row][col] = in.nextInt();
        }

        // output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            int col;
//            for (col = 0; col < arr[row].length; col++) ;
//            System.out.println(arr[row][col]);
//        }
//        System.out.println();

        // output
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
