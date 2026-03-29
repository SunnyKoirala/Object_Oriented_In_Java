// Unit 10: Book Questions - Collections Practice
// Concept: Use ArrayList, HashMap, HashSet in real scenarios

import java.util.*;

public class BookQuestions {

    public static void main(String[] args) {

        // Q: Store and manage student names in ArrayList
        System.out.println(" QUESTION 1: Student List (ArrayList) ");

        ArrayList<String> studentList = new ArrayList<String>();

        // Add students
        studentList.add("Kp oli");
        studentList.add("sher bahadur deuba");
        studentList.add("pushpa kamal dahal(urf prachanda)");
        studentList.add("Ganan Thapa urf(gaganeeeeee)");

        System.out.println("Total students: " + studentList.size());

        System.out.println("Student List:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + studentList.get(i));
        }

        // Remove a student
        studentList.remove("Arjun");
        System.out.println("\nAfter removing Arjun: " + studentList);

        System.out.println();

        //  QUESTION 2 
        // Q: Store employee salary with ID using HashMap
        System.out.println(" QUESTION 2: Employee Salary (HashMap) ");

        HashMap<Integer, Double> employeeSalary = new HashMap<Integer, Double>();

        // Add employee salary
        employeeSalary.put(101, 50000.0);
        employeeSalary.put(102, 60000.0);
        employeeSalary.put(103, 55000.0);
        employeeSalary.put(104, 70000.0);

        System.out.println("Total employees: " + employeeSalary.size());

        System.out.println("Employee Salaries:");
        for (Integer empId : employeeSalary.keySet()) {
            System.out.println("  ID: " + empId + " → Salary: " + employeeSalary.get(empId));
        }

        // Get specific employee salary
        System.out.println("\nSalary of employee 102: " + employeeSalary.get(102));

        System.out.println();

        //  QUESTION 3 
        // Q: Store unique numbers using HashSet
        System.out.println(" QUESTION 3: Unique Numbers (HashSet) ");

        HashSet<Integer> uniqueNumbers = new HashSet<Integer>();

        // Add numbers (try adding duplicates)
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(30);
        uniqueNumbers.add(20);  // Duplicate
        uniqueNumbers.add(10);  // Duplicate
        uniqueNumbers.add(40);

        System.out.println("Numbers added: 10, 20, 30, 20, 10, 40");
        System.out.println("Unique numbers (duplicates removed): " + uniqueNumbers);
        System.out.println("Total unique: " + uniqueNumbers.size());

        System.out.println();

        //  QUESTION 4 
        // Q: Store student marks with names and display top marks
        System.out.println(" QUESTION 4: Student Marks System ");

        HashMap<String, Integer> studentMarks = new HashMap<String, Integer>();

        // Add student marks
        studentMarks.put("Ramesh", 85);
        studentMarks.put("Priya", 92);
        studentMarks.put("Arjun", 78);
        studentMarks.put("Neha", 88);

        System.out.println("Student Marks:");
        for (String name : studentMarks.keySet()) {
            System.out.println("  " + name + ": " + studentMarks.get(name));
        }

        // Find highest marks
        int maxMarks = 0;
        String topStudent = "";

        for (String name : studentMarks.keySet()) {
            if (studentMarks.get(name) > maxMarks) {
                maxMarks = studentMarks.get(name);
                topStudent = name;
            }
        }

        System.out.println("\nTop Student: " + topStudent + " with " + maxMarks + " marks");

        // Find average marks
        int total = 0;
        for (Integer marks : studentMarks.values()) {
            total += marks;
        }
        double average = (double) total / studentMarks.size();

        System.out.println("Average marks: " + average);
    }
}
