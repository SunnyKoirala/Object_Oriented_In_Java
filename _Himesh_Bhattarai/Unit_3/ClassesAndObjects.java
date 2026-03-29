// Unit 3: Classes and Objects
// Concept: Blueprint for creating objects

// Step 1: Create a CLASS (blueprint)
public class Student {

    // Instance variables (attributes)
    String name;
    int age;
    double gpa;

    // Constructor: runs when object is created
    // Initializes the object's values
    public Student(String studentName, int studentAge, double studentGpa) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
    }

    // Method: displays student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    // Method: check if student passed (GPA > 2.0)
    public boolean isPassed() {
        return gpa > 2.0;
    }

    public static void main(String[] args) {

        // Step 2: Create OBJECTS (instances of Class)
        System.out.println("CREATING OBJECTS\n");

        // Object 1: Create a Student object
        Student student1 = new Student("Kp Sharma Oli", 20, 3.5);

        System.out.println("Student 1:");
        student1.displayInfo();
        System.out.println("Passed: " + student1.isPassed());

        System.out.println();

        // Object 2: Another Student object
        Student student2 = new Student("Ramesh Lekhak", 19, 3.8);

        System.out.println("Student 2:");
        student2.displayInfo();
        System.out.println("Passed: " + student2.isPassed());
    }
}
