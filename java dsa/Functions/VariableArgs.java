package com.jiya;

import java.util.Arrays;

public class VariableArgs {
    public static void main(String[] args) {
//        fun(1,2,3,3,4,5,5,6);
//        multiple(3,4,"jiya", "priya", "ram");
//        demo(1,2,14,161,19);
        demo("Jiya", "xyz");

    }

    static void demo(int ...v) {
        System.out.println( Arrays.toString(v));
    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ... j) {
// variable should be in end always
    }
    static void fun(int ... a) {
        System.out.println(Arrays.toString(a));
    }
}
