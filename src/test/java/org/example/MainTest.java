package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void name() {

        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz();
        String result = fizzBuzz.fizzBuzz(1);
        assertEquals("1", result);
    }

    @Test
    void verifyIfIPassThreeTheResultShouldBeFizz() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz();
        String result = fizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    void verifyIfIPassFiveTheResultShouldBeBuzz() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz();
        String result = fizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    void verifyIfIPassSevenTheResultShouldBeSeven() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz();
        String result = fizzBuzz.fizzBuzz(7);
        assertEquals("7", result);
    }

    @Test
    void verifyIfIPassFiveTeenTheResultShouldBeFizzFuzz() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz();
        String result = fizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }


}