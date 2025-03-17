package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    static class FizzBuzz {
        public String fizzBuzz(int n) {
            if (n % 3 == 0) return "Fizz";

            return String.valueOf(n);
        }
    }
}