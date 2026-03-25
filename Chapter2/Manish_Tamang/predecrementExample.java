package chapter2;
import java.util.*;

public class predecrementExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int a = sc.nextInt();

        int b = a--;
        System.out.println("Your predecrement is");
        System.out.println("B:"+b);
        System.out.println("A:"+a);
    }

}
