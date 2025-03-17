package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    static class FizzBuzz {
        public String fizzBuzz(int n) {
            String result = "";

            char[] numbers = String.valueOf(n).toCharArray();

            for (char c : numbers) {
                if (c == '3') result += "Fizz";
            }

            if (n % 3 == 0) result += "Fizz";

            if (n % 5 == 0) result += "Buzz";

            return result.isEmpty() ? n + "" : result;
        }
    }
}