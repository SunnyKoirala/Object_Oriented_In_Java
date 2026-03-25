package chapter2.loops;
import java.util.*;

public class WhileLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter what you want to print:");
        String text = sc.nextLine();

        System.out.println("How many times do you want to repeat?");
        int n = sc.nextInt();

        int counter = 0;

        while (counter < n) {
            System.out.println(text);
            counter++;
        }

        System.out.println("Printing is finished.");
        sc.close();
    }
}