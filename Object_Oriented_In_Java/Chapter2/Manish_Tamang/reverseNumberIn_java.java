package chapter2;
import java.util.*;
public class reverseNumberIn_java {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rev=0, rem, org=num;
        while(num!=0){
            rem= num % 10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println("reverse is: "+rev);

   //palindrome check
        if (org == rev){
            System.out.println("It is palindrome");
        }
        else {System.out.println("It is not palindrome");}
    }
}
