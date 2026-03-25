package chapter2;
import java.util.*;
public class AreaOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float r = sc.nextFloat();


        float Area = 3.14f*r*r;
        System.out.println("The area of circle is: "+Area);
    }
}
