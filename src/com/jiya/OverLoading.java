package com.jiya;

public class OverLoading {
    public static void main(String[] args) {
        fun(23);
        fun("Jiya");
    }
    static void fun (int a) {
        System.out.println(a);

    }
    static void fun (String name) {
        System.out.println(name);

    }
}
