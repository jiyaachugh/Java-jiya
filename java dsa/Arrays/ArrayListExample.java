package com.jiya;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(687);
//        list.add(777);
//        list.add(1111);
//        list.add(1412);
//        System.out.println(list.contains(1412));

//        list.set(0, 99);
//        list.remove(2);
//
//        System.out.println(list);
        //input
        for (int i = 0; i < 5 ; i++) {
            list.add(in.nextInt());
            
        }
        //get item at any index

        for (int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i));// pass index here,list[index] syntax won't work here


        }
        System.out.println(list);
    }
}
