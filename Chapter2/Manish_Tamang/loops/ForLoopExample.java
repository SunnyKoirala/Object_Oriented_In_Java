package chapter2.loops;
import java.util.*;
public class ForLoopExample {
    public static void main(String args[]){
        System.out.println("Please enter how many times");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Your output is:"+i);
        }
    }
}
