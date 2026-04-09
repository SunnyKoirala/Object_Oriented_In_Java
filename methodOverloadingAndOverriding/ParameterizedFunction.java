package OOPS.methodOverloadingAndOverriding;
import java.util.*;
public class ParameterizedFunction {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number");
        int a=sc.nextInt();
        System.out.println("Enter a second number");
        int b=sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("The sum of the numbers is :"+sum);
    }

    public static int calculateSum(int num1, int num2)
    {
        int sum=num1+num2;
        return sum;
    }
}
