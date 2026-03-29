// Unit 10: Collections - ArrayList, HashMap, HashSet
// Concept: Store and manage groups of objects

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        System.out.println(" COLLECTIONS \n");

        //  Example 1: ArrayList 
        System.out.println("Example 1: ArrayList (Dynamic Array)");

        // Create ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<String>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Fruits: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("First fruit: " + fruits.get(0));

        // Remove element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println();

        //  Example 2: HashMap 
        System.out.println("Example 2: HashMap (Key-Value pairs)");

        // Create HashMap to store student grades
        HashMap<Integer, String> students = new HashMap<Integer, String>();

        // Add key-value pairs
        students.put(101, "Balendra Saha");
        students.put(102, "Sudan Gurung");
        students.put(103, "swadnim wagle");

        System.out.println("Students: " + students);
        System.out.println("Student 101: " + students.get(101));

        // Check if key exists
        if (students.containsKey(102)) {
            System.out.println("Roll 102 exists: " + students.get(102));
        }

        // Remove by key
        students.remove(103);
        System.out.println("After removing 103: " + students);

        System.out.println();

        //  Example 3: HashSet 
        System.out.println("Example 3: HashSet (Unique elements)");

        // Create HashSet to store unique numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);  // Duplicate - won't be added

        System.out.println("Numbers: " + numbers);
        System.out.println("Size: " + numbers.size());

        // Check if element exists
        if (numbers.contains(20)) {
            System.out.println("20 is present in set");
        }

        // Remove element
        numbers.remove(30);
        System.out.println("After removing 30: " + numbers);

        System.out.println();

        //  Example 4: Iterate through collections 
        System.out.println("Example 4: Iteration");

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Colors using for loop:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("  " + colors.get(i));
        }

        System.out.println("\nColors using for-each:");
        for (String color : colors) {
            System.out.println("  " + color);
        }
    }
}
