// Unit 5: Handling Errors - Exception Handling
// Concept: Try-Catch blocks to handle errors gracefully

public class ExceptionHandling {

    public static void main(String[] args) {

        System.out.println("EXCEPTION HANDLING\n");

        System.out.println("Example 1: Division by Zero");
        try {
            // This will throw ArithmeticException
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;  // ERROR! ??
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block runs if exception occurs
            System.out.println("ERROR: Cannot divide by zero!");
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        System.out.println("Example 2: Array Index Out of Bounds");
        try {
            int[] numbers = {10, 20, 30};
            // Valid indices: 0, 1, 2
            // Index 5 doesn't exist - will throw exception
            int value = numbers[5];  // ERROR!
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: Index out of bounds!");
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Example 3: Invalid Number Format");
        try {
            String text = "abc123";
            int number = Integer.parseInt(text);  // Can't convert "abc123" to int
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid number format!");
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        System.out.println("Example 4: Try-Catch-Finally Block");
        try {
            int x = 50 / 5;
            System.out.println("Division result: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        } finally {
            // This block ALWAYS runs, whether exception occurs or not
            System.out.println("Finally block: Cleanup code runs here");
        }
    }
}