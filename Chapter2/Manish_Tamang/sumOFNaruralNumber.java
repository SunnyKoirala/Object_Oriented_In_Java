package chapter2;

import java.util.*;

public class sumOFNaruralNumber {
    public static void main(String args[]){
        System.out.println("Enter The Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum=0;
        while(i <= n){
            sum=sum+i;
            i++;
        }
        System.out.println("the sum of given number: "+sum);
    }
}
