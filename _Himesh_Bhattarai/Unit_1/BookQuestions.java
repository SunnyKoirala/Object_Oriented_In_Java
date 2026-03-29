// Unit 1: Book Questions - Practice Problems
// Questions with solutions to test basic concepts

public class BookQuestions {

    public static void main(String[] args) {

        // Q: Write a program to calculate simple interest
        // Formula: SI = (Principal * Rate * Time) / 100
        System.out.println("QUESTION  N) 1: Simple Interest Calculator");

        int principal = 1000;   // Amount invested
        int rate = 5;           // Interest rate %
        int time = 2;           // Years

        // Calculation
        int simpleInterest = (principal * rate * time) / 100;
        int totalAmount = principal + simpleInterest;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println();

        // Q: Check if a number is even or odd
        System.out.println("QUESTION NO 2: Even or Odd Checker");

        int num = 15;

        // If num % 2 == 0, it's even; otherwise it's odd
        if (num % 2 == 0) {
            System.out.println(num + " is EVEN");
        } else {
            System.out.println(num + " is ODD");
        }
        System.out.println();

        // Q: Find the largest of three numbers
        System.out.println("QUESTION 3: Largest of Three Numbers");

        int n1 = 25;
        int n2 = 40;
        int n3 = 30;

        // Find largest using if-else
        int largest = n1;

        if (n2 > largest) {
            largest = n2;
        }

        if (n3 > largest) {
            largest = n3;
        }

        System.out.println("Numbers: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("Largest: " + largest);
        System.out.println();

        // Q: Print multiplication table of 5
        System.out.println("===== QUESTION 4: Multiplication Table =====");

        int table = 5;
        System.out.println("Multiplication table of " + table + ":");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }
    }
}
