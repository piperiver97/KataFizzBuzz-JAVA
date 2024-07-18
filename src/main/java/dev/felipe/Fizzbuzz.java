package dev.felipe;

public class Fizzbuzz {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                System.out.println(getFizzBuzzValue(i));
            }
        }
    
        public static String getFizzBuzzValue(int number) {
            boolean divisiblePor3 = number % 3 == 0;
            boolean divisiblePor5 = number % 5 == 0;
            boolean contains3 = String.valueOf(number).contains("3");
            boolean contains5 = String.valueOf(number).contains("5");
    
            if ((divisiblePor3 || contains3) && (divisiblePor5 || contains5)) {
                return "FizzBuzz";
            } else if (divisiblePor3 || contains3) {
                return "Fizz";
            } else if (divisiblePor5 || contains5) {
                return "Buzz";
            } else {
                return String.valueOf(number);
            }
        }
    }
    

