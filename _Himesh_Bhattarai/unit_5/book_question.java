// Unit 5: Book Questions - Exception Handling Practice
// Concept: Handle different exception types

import java.util.Scanner;

public class BookQuestions {

    public static void main(String[] args) {

        // Q: Safe division with exception handling
        System.out.println(" QUESTION 1: Safe Division ");

        try {
            int dividend = 100;
            int divisor = 0;  // This will cause division by zero

            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            int result = dividend / divisor;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Division attempt completed.\n");
        }

        // Q: Safe array access
        System.out.println(" QUESTION 2: Safe Array Access ");

        int[] scores = {85, 90, 78, 92};

        try {
            // Try to access index 10 (doesn't exist)
            int score = scores[10];
            System.out.println("Score: " + score);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: Index does not exist in array!");
            System.out.println("Valid indices are: 0 to " + (scores.length - 1));
        }
        System.out.println();

        // Q: Safe type conversion
        System.out.println(" QUESTION 3: Safe String to Number Conversion ");

        String[] stringNumbers = {"10", "20", "abc", "30"};

        for (int i = 0; i < stringNumbers.length; i++) {
            try {
                // Try to convert string to integer
                int number = Integer.parseInt(stringNumbers[i]);
                System.out.println(stringNumbers[i] + " = " + number);

            } catch (NumberFormatException e) {
                System.out.println(stringNumbers[i] + " = ERROR: Not a valid number");
            }
        }
        System.out.println();

        // Q: Custom error checking
        System.out.println("QUESTION 4: Age Validation");

        int age = -5;  // Invalid age

        try {
            // Check if age is valid
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative!");
            }
            if (age > 120) {
                throw new IllegalArgumentException("Age seems unrealistic!");
            }

            System.out.println("Valid age: " + age);

        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
