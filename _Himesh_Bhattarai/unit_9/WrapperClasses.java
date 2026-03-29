// Unit 9: Wrapper Classes
// Concept: Convert primitive types to objects (Integer, Double, Boolean, etc.)

public class WrapperClasses {

    public static void main(String[] args) {

        System.out.println(" WRAPPER CLASSES \n");

        //  Example 1: Integer Wrapper 
        System.out.println("Example 1: Integer Wrapper");

        // Boxing: Convert primitive int to Integer object
        int primitiveInt = 42;
        Integer integerObject = Integer.valueOf(primitiveInt);  // Explicit boxing

        // Or automatic boxing (Java 5+)
        Integer autoBoxed = 100;

        System.out.println("Primitive: " + primitiveInt);
        System.out.println("Integer Object: " + integerObject);
        System.out.println("Auto-boxed: " + autoBoxed);

        // Unboxing: Convert Integer object back to primitive int
        int unboxed = integerObject.intValue();
        System.out.println("Unboxed: " + unboxed);

        System.out.println();

        //  Example 2: Double Wrapper 
        System.out.println("Example 2: Double Wrapper");

        double primitiveDouble = 3.14;
        Double doubleObject = primitiveDouble;  // Auto-boxing

        System.out.println("Primitive: " + primitiveDouble);
        System.out.println("Double Object: " + doubleObject);

        // Compare doubles
        Double anotherDouble = 3.14;
        System.out.println("Are they equal? " + doubleObject.equals(anotherDouble));

        System.out.println();

        //  Example 3: Boolean Wrapper 
        System.out.println("Example 3: Boolean Wrapper");

        boolean primitiveBoolean = true;
        Boolean booleanObject = primitiveBoolean;  // Auto-boxing

        System.out.println("Primitive: " + primitiveBoolean);
        System.out.println("Boolean Object: " + booleanObject);

        System.out.println();

        //  Example 4: String to Number Conversion 
        System.out.println("Example 4: String to Number Conversion");

        String numberString = "123";
        String doubleString = "45.67";

        // Convert String to Integer
        int number = Integer.parseInt(numberString);
        System.out.println("String '" + numberString + "' to int: " + number);

        // Convert String to Double
        double decimal = Double.parseDouble(doubleString);
        System.out.println("String '" + doubleString + "' to double: " + decimal);

        System.out.println();

        //  Example 5: Useful methods 
        System.out.println("Example 5: Wrapper Utility Methods");

        // Maximum and Minimum values
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);

        // Convert to different bases
        int num = 255;
        System.out.println("Integer 255 in binary: " + Integer.toBinaryString(num));
        System.out.println("Integer 255 in hex: " + Integer.toHexString(num));
    }
}
