package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(testNumber(i));
        }
    }

    private static String testNumber(int n) {
        String str = "";

        char[] chars = String.valueOf(n).toCharArray();

        if (n % 3 == 0) {
            str += "Fizz";
        }

        if (n % 5 == 0) {
            str += "Buzz";
        }

        for (char c : chars) {
            if (c == '3') {
                str += "Fizz";
            }

            if (c == '5') {
                str += "Buzz";
            }
        }

        return str.isEmpty() ? n + "" : str;
    }
}