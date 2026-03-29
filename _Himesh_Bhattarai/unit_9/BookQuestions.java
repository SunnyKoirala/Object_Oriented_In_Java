// Unit 9: Book Questions - Wrapper Classes Practice
// Concept: Use wrapper classes for conversions and operations

public class BookQuestions {

    public static void main(String[] args) {

        //  QUESTION 1 
        // Q: Boxing and Unboxing
        System.out.println(" QUESTION 1: Boxing and Unboxing ");

        // Boxing: primitives to objects
        int primitiveInt = 50;
        Integer wrappedInt = primitiveInt;  // Auto-boxing

        Double wrappedDouble = 99.99;
        Boolean wrappedBoolean = true;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Boolean: " + wrappedBoolean);

        // Unboxing: objects back to primitives
        int unwrappedInt = wrappedInt;
        double unwrappedDouble = wrappedDouble;

        System.out.println("\nUnboxed int: " + unwrappedInt);
        System.out.println("Unboxed double: " + unwrappedDouble);

        System.out.println();

        //  QUESTION 2 
        // Q: Convert String to different number types
        System.out.println(" QUESTION 2: String to Number Conversion ");

        String intString = "1000";
        String doubleString = "99.5";
        String booleanString = "true";

        // Parse String to Integer
        int intValue = Integer.parseInt(intString);
        System.out.println("String '" + intString + "' to int: " + intValue);

        // Parse String to Double
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("String '" + doubleString + "' to double: " + doubleValue);

        // Parse String to Boolean
        boolean boolValue = Boolean.parseBoolean(booleanString);
        System.out.println("String '" + booleanString + "' to boolean: " + boolValue);

        System.out.println();

        //  QUESTION 3 
        // Q: Check limits of wrapper classes
        System.out.println(" QUESTION 3: Wrapper Class Limits ");

        System.out.println("Integer Maximum: " + Integer.MAX_VALUE);
        System.out.println("Integer Minimum: " + Integer.MIN_VALUE);

        System.out.println("Double Maximum: " + Double.MAX_VALUE);
        System.out.println("Double Minimum: " + Double.MIN_VALUE);

        System.out.println("Float Maximum: " + Float.MAX_VALUE);
        System.out.println("Float Minimum: " + Float.MIN_VALUE);

        System.out.println("Byte Maximum: " + Byte.MAX_VALUE);
        System.out.println("Byte Minimum: " + Byte.MIN_VALUE);

        System.out.println();

        //  QUESTION 4 
        // Q: Convert numbers to different formats
        System.out.println(" QUESTION 4: Number Format Conversion ");

        int number = 255;

        // Convert to different number systems
        System.out.println("Number: " + number);
        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal: " + Integer.toHexString(number));

        // Parse from different formats
        int binaryValue = Integer.parseInt("11111111", 2);      // Parse binary
        int octalValue = Integer.parseInt("377", 8);            // Parse octal
        int hexValue = Integer.parseInt("FF", 16);              // Parse hexadecimal

        System.out.println("\nBinary 11111111 = " + binaryValue);
        System.out.println("Octal 377 = " + octalValue);
        System.out.println("Hex FF = " + hexValue);
    }
}
