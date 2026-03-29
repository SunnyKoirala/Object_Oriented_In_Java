// Unit 2: Book Questions - Variables and Arrays Practice
// Concept: Practice problems on variables and arrays

public class BookQuestions {

    public static void main(String[] args) {

        // Q: Create variables for student info and display them
        System.out.println("QUESTION 1: Student Informations");

        String studentName = "Rohan Kumar";
        int rollNumber = 101;
        double cgpa = 3.85;
        char grade = 'A';

        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println();

        // Q: Find sum and average of array elements
        System.out.println("QUESTION 2: Sum and Average of Array");

        int[] marks = {85, 90, 78, 92, 88};
        int sum = 0;

        // Calculate sum using loop
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        // Calculate average
        double average = (double) sum / marks.length;

        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println();

        // Q: Find maximum (largest) element in array
        System.out.println("QUESTION 3: Find Maximum in Array");

        int[] numbers = {34, 56, 12, 89, 45, 23};
        int max = numbers[0];  // Start with first element

        // Compare each element with max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Maximum number: " + max);
        System.out.println();

        // Q: Check if array contains a specific element
        System.out.println("===== QUESTION 4: Search in Array =====");

        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grape"};
        String searchFruit = "Mango";
        boolean found = false;

        // Search for the fruit
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(searchFruit)) {  // equals() compares strings
                found = true;
                System.out.println(searchFruit + " found at index: " + i);
                break;  // Exit loop when found
            }

        // If not found
        if (!found) {
            System.out.println(searchFruit + " not found in array");
        }
    }
}
