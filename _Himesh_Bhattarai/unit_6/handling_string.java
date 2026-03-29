// Unit 6: String Handling
// Concept: String manipulation and common methods

public class StringHandling {

    public static void main(String[] args) {

        System.out.println("STRING METHODS \n");

        // Create a String object
        String text = "Hello Java World";

        // 1. length() - Get length of string
        System.out.println("1. LENGTH:");
        System.out.println("Text: " + text);
        System.out.println("Length: " + text.length());  // Output: 16

        System.out.println();

        // 2. toUpperCase() - Convert to uppercase
        System.out.println("2. TO UPPERCASE:");
        System.out.println("Original: " + text);
        System.out.println("Upper: " + text.toUpperCase());  // HELLO JAVA WORLD

        System.out.println();

        // 3. toLowerCase() - Convert to lowercase
        System.out.println("3. TO LOWERCASE:");
        System.out.println("Original: " + text);
        System.out.println("Lower: " + text.toLowerCase());  // hello java world

        System.out.println();

        // 4. charAt() - Get character at specific index
        System.out.println("4. CHARACTER AT INDEX:");
        System.out.println("Text: " + text);
        System.out.println("Character at index 0: " + text.charAt(0));    // H
        System.out.println("Character at index 6: " + text.charAt(6));    // J

        System.out.println();

        // 5. substring() - Extract part of string
        System.out.println("5. SUBSTRING:");
        System.out.println("Original: " + text);
        System.out.println("substring(0, 5): " + text.substring(0, 5));   // Hello
        System.out.println("substring(6): " + text.substring(6));         // Java World

        System.out.println();

        // 6. indexOf() - Find position of character/substring
        System.out.println("6. INDEX OF:");
        System.out.println("Text: " + text);
        System.out.println("Index of 'a': " + text.indexOf('a'));         // 9
        System.out.println("Index of 'Java': " + text.indexOf("Java"));   // 6

        System.out.println();

        // 7. replace() - Replace characters/words
        System.out.println("7. REPLACE:");
        System.out.println("Original: " + text);
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        // Hello Python World

        System.out.println();

        // 8. split() - Split string into array
        System.out.println("8. SPLIT:");
        String sentence = "apple,banana,mango,orange";
        String[] fruits = sentence.split(",");  // Split by comma

        System.out.println("Original: " + sentence);
        System.out.println("Split by comma:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("  [" + i + "] " + fruits[i]);
        }

        System.out.println();

        // 9. trim() - Remove leading/trailing spaces
        System.out.println("9. TRIM:");
        String spacedText = "  Hello World  ";
        System.out.println("Original: '" + spacedText + "'");
        System.out.println("Trimmed: '" + spacedText.trim() + "'");

        System.out.println();

        // 10. equals() - Compare strings
        System.out.println("10. EQUALS:");
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        System.out.println("'" + str1 + "'.equals('" + str2 + "'): " + str1.equals(str2));      // true
        System.out.println("'" + str1 + "'.equals('" + str3 + "'): " + str1.equals(str3));      // false
        System.out.println("'" + str1 + "'.equalsIgnoreCase('" + str3 + "'): " + str1.equalsIgnoreCase(str3));  // true

        System.out.println();

        // 11. contains() - Check if string contains substring
        System.out.println("11. CONTAINS:");
        String message = "Java is awesome";
        System.out.println("Text: " + message);
        System.out.println("Contains 'Java': " + message.contains("Java"));       // true
        System.out.println("Contains 'Python': " + message.contains("Python"));   // false

        System.out.println();

        // 12. Concatenation - Join strings
        System.out.println("12. CONCATENATION:");
        String firstName = "Himesh";
        String lastName = "Bhattarai";
        String fullName = firstName + " " + lastName;  // using +
        System.out.println("Full Name: " + fullName);

        // Alternative using concat()
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name (using concat): " + fullName2);
    }
}
