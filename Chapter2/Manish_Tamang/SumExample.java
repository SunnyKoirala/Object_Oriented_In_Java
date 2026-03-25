package chapter2;
import java.util.*;
public class SumExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  number:");
        int a = sc.nextInt();
        System.out.println("Enter second  number:");
        int b = sc.nextInt();

        int product = a+b;
        System.out.println("The sum of two number is: "+product);
    }
}
