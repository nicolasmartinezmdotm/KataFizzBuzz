package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    static class FizzBuzz {
        public String fizzBuzz(int n) {
            if (n % 3 == 0) return "Fizz";

            if (n % 5 == 0) return "Buzz";

            return String.valueOf(n);
        }
    }
}