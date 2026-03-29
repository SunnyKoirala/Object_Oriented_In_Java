// Unit 4: Inheritance - IS-A Relationship
// Concept: Child class inherits properties from Parent class using 'extends'

// Parent Class (Superclass)
class Animal {
    // Instance variables (properties)
    String name;
    int age;

    // Constructor
    public Animal(String animalName, int animalAge) {
        name = animalName;
        age = animalAge;
    }

    // Inherited methods
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void makeSound() {
        System.out.println(name + " is making sound");
    }
}

// Child Class 1 - Dog inherits from Animal
public class Dog extends Animal {

    String breed;

    // Constructor
    public Dog(String dogName, int dogAge, String dogBreed) {
        super(dogName, dogAge);  // Call parent class constructor
        breed = dogBreed;
    }

    // Method override: Override parent's makeSound() method
    // This is Method Overriding (same method name, different body)
    @Override
    public void makeSound() {
        System.out.println(name + " is barking: Woof! Woof!");
    }

    // Dog-specific method
    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
}

// Child Class 2 - Cat inherits from Animal
class Cat extends Animal {

    String color;

    // Constructor
    public Cat(String catName, int catAge, String catColor) {
        super(catName, catAge);
        color = catColor;
    }

    // Override parent's makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " is meowing: Meow! Meow!");
    }

    // Cat-specific method
    public void scratch() {
        System.out.println(name + " is scratching furniture");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
}

class TestInheritance {
    public static void main(String[] args) {

        System.out.println("INHERITANCE EXAMPLE\n");

        // Create Dog object
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        System.out.println("DOG:");
        dog.displayInfo();
        dog.eat();               // Inherited method
        dog.sleep();             // Inherited method
        dog.makeSound();         // Overridden method
        dog.fetch();             // Dog-specific method

        System.out.println("\n");

        // Create Cat object
        Cat cat = new Cat("Whiskers", 3, "Orange");
        System.out.println("CAT:");
        cat.displayInfo();
        cat.eat();               // Inherited method
        cat.sleep();             // Inherited method
        cat.makeSound();         // Overridden method
        cat.scratch();           // Cat-specific method

        System.out.println("\nKEY CONCEPTS");
        System.out.println("1. extends keyword: Child inherits from Parent");
        System.out.println("2. super() keyword: Call parent constructor");
        System.out.println("3. Override: Child can override parent's methods");
        System.out.println("4. Code reusability: Common methods in parent");
    }
}
