package com.jiya;

public class Reverse {
    public static void main(String[] args) {
        int num = 123456;
        int ans = 0;

        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);

    }
}
