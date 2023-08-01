package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    public void shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(9);
        assertEquals(result, "Fizz");
    }

    @Test
    public void shouldReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(10);
        assertEquals(result, "Buzz");
    }

    @Test
    public void shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        assertEquals(result, "FizzBuzz");
    }

    @Test
    public void shouldReturnNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(11);
        assertEquals(result, "11");
    }

}