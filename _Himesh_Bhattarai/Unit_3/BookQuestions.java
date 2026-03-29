// Unit 3: Book Questions - Classes and Objects Practice
// Concept: Create and use classes with objects

// Create a Bank Account class
class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    // Constructor
    public BankAccount(String name, long accNum, double initialBalance) {
        accountHolder = name;
        accountNumber = accNum;
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("ERROR: Insufficient balance!");
        }
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Create a Book class
class Book {
    String title;
    String author;
    int pages;

    // Constructor
    public Book(String bookTitle, String bookAuthor, int bookPages) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
    }

    // Method to get book info
    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

// Create a Person class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    // Method to check if adult (age >= 18)
    public boolean isAdult() {
        return age >= 18;
    }

    // Method to display person info
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to run all questions
public class BookQuestions {

    public static void main(String[] args) {

        // Q: Create a Bank Account and perform deposit/withdraw operations
        System.out.println(" QUESTION 1: Bank Account Operations ");

        BankAccount account1 = new BankAccount("Raj Kumar", 123456789L, 5000);
        account1.displayAccount();

        System.out.println("\nDepositing 2000:");
        account1.deposit(2000);

        System.out.println("\nWithdrawing 1500:");
        account1.withdraw(1500);

        System.out.println("\nFinal Account Details:");
        account1.displayAccount();

        // Q: Create multiple Book objects and display details
        System.out.println("\nQUESTION 2: Book Information Display");

        Book book1 = new Book("Java Programming", "Herbert Schildt", 850);
        Book book2 = new Book("Data Structures", "Mark Allen", 650);

        System.out.println("Book 1:");
        book1.getInfo();

        System.out.println("\nBook 2:");

        // Q: Check if person is an adult
        System.out.println("\nQUESTION 3: Check Age (Adult or Not)");

        Person person1 = new Person("Arjun", 25);
        Person person2 = new Person("Neha", 16);

        System.out.println("Person 1:");
        person1.showDetails();
        System.out.println("Is Adult: " + person1.isAdult());

        System.out.println("\nPerson 2:");
        person2.showDetails();
        System.out.println("Is Adult: " + person2.isAdult());

        // Q: Create array of objects
        System.out.println("\nUESTION 4: Array of Person Objects");

        // Create array to store 3 Person objects
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 22);
        people[1] = new Person("Bob", 17);
        people[2] = new Person("Charlie", 30);

        System.out.println("People Information:");
        for (int i = 0; i < people.length; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            people[i].showDetails();
            System.out.println("Adult: " + people[i].isAdult());
        }
    }
}
