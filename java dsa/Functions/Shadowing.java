package com.jiya;

public class Shadowing {
    static int x = 100; // this will be shadowed at line 8
    public static void main(String[] args) {
        int x ; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // scope will begin when the value is initialized
        x = 14;
        System.out.println(x);
        fun();

    }

     static void fun() {
    }
}
