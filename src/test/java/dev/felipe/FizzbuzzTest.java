package dev.felipe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {

    @Test
    public void testFizz() {
        assertEquals("Fizz", Fizzbuzz.getFizzBuzzValue(3));
        assertEquals("Fizz", Fizzbuzz.getFizzBuzzValue(6));
        assertEquals("Fizz", Fizzbuzz.getFizzBuzzValue(13));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", Fizzbuzz.getFizzBuzzValue(5));
        assertEquals("Buzz", Fizzbuzz.getFizzBuzzValue(10));
        assertEquals("Buzz", Fizzbuzz.getFizzBuzzValue(52)); 
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", Fizzbuzz.getFizzBuzzValue(15));
        assertEquals("FizzBuzz", Fizzbuzz.getFizzBuzzValue(30));
        assertEquals("FizzBuzz", Fizzbuzz.getFizzBuzzValue(35)); 
    }

    @Test
    public void testNeitherFizzNorBuzz() {
        assertEquals("1", Fizzbuzz.getFizzBuzzValue(1));
        assertEquals("2", Fizzbuzz.getFizzBuzzValue(2));
        assertEquals("4", Fizzbuzz.getFizzBuzzValue(4));
    }
}
