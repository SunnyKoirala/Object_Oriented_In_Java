// Unit 4: Book Questions - Inheritance Practice
// Concept: Solve problems using inheritance and method overriding

// ===== QUESTION 1 =====
// Create Vehicle hierarchy: Vehicle -> Car, Bike
class Vehicle {
    String brand;
    int year;

    public Vehicle(String vehicleBrand, int vehicleYear) {
        brand = vehicleBrand;
        year = vehicleYear;
    }

    public void start() {
        System.out.println(brand + " is starting");
    }

    public void stop() {
        System.out.println(brand + " is stopping");
    }
}

// ===== QUESTION 2 =====
// Car inherits from Vehicle
class Car extends Vehicle {
    int doors;

    public Car(String carBrand, int carYear, int numDoors) {
        super(carBrand, carYear);
        doors = numDoors;
    }

    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Doors: " + doors);
    }
}

// ===== QUESTION 3 =====
// Bike inherits from Vehicle
class Bike extends Vehicle {
    String type;  // Cruiser, Sport, etc.

    public Bike(String bikeBrand, int bikeYear, String bikeType) {
        super(bikeBrand, bikeYear);
        type = bikeType;
    }

    public void displayBikeInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
    }
}

// ===== QUESTION 4 =====
// Employee hierarchy: Employee -> Manager, Developer
class Employee {
    String name;
    double salary;

    public Employee(String empName, double empSalary) {
        name = empName;
        salary = empSalary;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

// Manager class
class Manager extends Employee {
    int teamSize;

    public Manager(String managerName, double managerSalary, int numTeam) {
        super(managerName, managerSalary);
        teamSize = numTeam;
    }

    public void manageTeam() {
        System.out.println(name + " is managing team of " + teamSize + " people");
    }
}

// Developer class
class Developer extends Employee {
    String language;

    public Developer(String devName, double devSalary, String progLanguage) {
        super(devName, devSalary);
        language = progLanguage;
    }

    public void code() {
        System.out.println(name + " is coding in " + language);
    }
}

// Main class to run all questions
public class BookQuestions {

    public static void main(String[] args) {

        // Q: Create Car and Bike objects and demonstrate inheritance
        System.out.println("QUESTION 1 & 2: Vehicle - Ca");

        Car car = new Car("Toyota", 2023, 4);
        car.displayCarInfo();
        car.start();    // Inherited method
        car.stop();     // Inherited method

        System.out.println("\nQUESION 3: Vehicle - Bike");

        Bike bike = new Bike("Harley", 2022, "Cruiser");
        bike.displayBikeInfo();
        bike.start();   // Inherited method
        bike.stop();    // Inherited method

        System.out.println("\nQUESTION 4: Employee Hierarchy");

        // Create Manager
        Manager manager = new Manager("Balen Saha", 80000, 5);
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        manager.displaySalary();
        manager.work();           // Inherited method
        manager.manageTeam();     // Manager-specific method

        System.out.println();

        // Create Developer
        Developer developer = new Developer("Sudan Furung", 60000, "Java");
        System.out.println("Developer Details:");
        System.out.println("Name: " + developer.name);
        developer.displaySalary();
        developer.work();         // Inherited method
        developer.code();         // Developer-specific method
    }
}
