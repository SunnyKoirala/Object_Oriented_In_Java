package chapter2;
import java.util.*;
public class swap {
    public static void main(String args[]){
        int a, b, temp;
        a=5;
        b=10;
        swap(a,b);
        System.out.println("Your swap is:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
}
