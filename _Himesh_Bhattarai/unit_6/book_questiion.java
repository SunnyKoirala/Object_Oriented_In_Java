// Unit 6: Book Questions - String Handling Practice
// Concept: Solve problems using String methods

public class BookQuestions {

    public static void main(String[] args) {

        // Q: Count vowels in a string
        System.out.println(" QUESTION 1: Count Vowels ");

        String text1 = "Hello World";
        int vowelCount = 0;

        // Convert to lowercase for easier comparison
        String lowerText = text1.toLowerCase();

        // Loop through each character
        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Text: " + text1);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println();

        //  QUESTION 2 
        // Q: Check if string is palindrome (reads same forwards and backwards)
        System.out.println(" QUESTION 2: Check Palindrome ");

        String str = "racecar";
        String reversed = new StringBuilder(str).reverse().toString();

        // StringBuilder with reverse() is built-in Java way
        // Alternative: Manually reverse using loop

        boolean isPalindrome = str.equals(reversed);

        System.out.println("String: " + str);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println();

        //  QUESTION 3 
        // Q: Replace all spaces with underscore
        System.out.println(" QUESTION 3: Replace Spaces ");

        String sentence = "Java is a programming language";
        String modified = sentence.replace(" ", "_");

        System.out.println("Original: " + sentence);
        System.out.println("Modified: " + modified);
        System.out.println();

        //  QUESTION 4 
        // Q: Check if two strings are anagram (same letters, different order)
        System.out.println(" QUESTION 4: Check Anagram ");

        String word1 = "listen";
        String word2 = "silent";

        // Convert both to character arrays and sort
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        // Sort both arrays
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        // Convert back to string and compare
        String sorted1 = new String(arr1);
        String sorted2 = new String(arr2);

        boolean isAnagram = sorted1.equals(sorted2);

        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);
        System.out.println("Is Anagram: " + isAnagram);
    }
}
