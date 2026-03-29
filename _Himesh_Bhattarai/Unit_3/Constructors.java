// Unit 3: Constructors
// Concept: Special methods that initialize objects automatically

public class Car {

    // Instance variables
    String model;
    String color;
    int year;

    // Constructor 1: With parameters (Parameterized constructor)
    // This constructor accepts 3 parameters
    public Car(String carModel, String carColor, int carYear) {
        model = carModel;
        color = carColor;
        year = carYear;
    }

    // Constructor 2: Without parameters (No-arg constructor)
    // This sets default values
    public Car() {
        model = "Unknown";
        color = "White";
        year = 2020;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {

        System.out.println("CONSTRUCTOR WITH PARAMETERS");
        // Using parameterized constructor
        Car car1 = new Car("BMW", "Black", 2023);
        car1.displayInfo();

        System.out.println("\nCONSTRUCTOR WITHOUT PARAMETERS");
        // Using no-arg constructor
        Car car2 = new Car();
        car2.displayInfo();

        System.out.println("\nNOTE");
        System.out.println("Constructor name MUST be same as class name");
        System.out.println("Constructor runs automatically when object is created");
        System.out.println("We can have multiple constructors (overloading)");
    }
}
