// Unit 1: Operators Demo
// Concept: Arithmetic, Logical, Comparison operators

public class Operators {

    public static void main(String[] args) {

        // Arithmetic Operators: +, -, *, /, %
        int a = 10;
        int b = 3;

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));      // Addition: 13
        System.out.println("a - b = " + (a - b));      // Subtraction: 7
        System.out.println("a * b = " + (a * b));      // Multiplication: 30
        System.out.println("a / b = " + (a / b));      // Division: 3
        System.out.println("a % b = " + (a % b));      // Remainder: 1

        // Comparison Operators: ==, !=, <, >, <=, >=
        System.out.println("\n=== Comparison Operators ===");
        System.out.println("a == b: " + (a == b));     // false
        System.out.println("a != b: " + (a != b));     // true
        System.out.println("a > b: " + (a > b));       // true

        // Logical Operators: &&(AND), ||(OR), !(NOT)
        System.out.println("\n=== Logical Operators ===");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));     // false (both must be true)
        System.out.println("x || y: " + (x || y));     // true (one must be true)
        System.out.println("!x: " + (!x));             // false (NOT operators reverses)
    }
}
