// Unit 2: Variables & Data Types
// Concept: Java variables store data in memory

public class Variables {

    public static void main(String[] args) {

        // Java has 8 primitive data types
        System.out.println("PRIMITIVE DATA TYPES\n");

        // 1. byte: 8-bit integer (-128 to 127)
        byte singleByte = 100;
        System.out.println("byte: " + singleByte);

        // 2. short: 16-bit integer
        short smallNumber = 5000;
        System.out.println("short: " + smallNumber);

        // 3. int: 32-bit integer (most common)
        int age = 25;
        System.out.println("int: " + age);

        // 4. long: 64-bit integer (add 'L' at end)
        long phoneNumber = 9841234567L;
        System.out.println("long: " + phoneNumber);

        // 5. float: 32-bit decimal (add 'f' at end)
        float height = 5.8f;
        System.out.println("float: " + height);

        // 6. double: 64-bit decimal (default for decimals)
        double salary = 50000.50;
        System.out.println("double: " + salary);

        // 7. boolean: true or false
        boolean isStudent = true;
        System.out.println("boolean: " + isStudent);

        // 8. char: single character (store in single quotes)
        char grade = 'A';
        System.out.println("char: " + grade);

        // NON-PRIMITIVE DATA TYPE: String
        System.out.println("\nNON-PRIMITIVE DATA TYPE\n");

        // String: sequence of characters (store in double quotes)
        String name = "Himesh Bhattarai";
        System.out.println("String: " + name);

        // Variable naming rules
        System.out.println("\nVARIABLE NAMING RULES");
        System.out.println("1. Can't start with number: myVar (valid), 1myVar (invalid)");
        System.out.println("2. Can contain letters, digits, underscore, $");
        System.out.println("3. Case sensitive: name and Name are different");
        System.out.println("4. Use camelCase for naming: myVariableName");
    }
}
