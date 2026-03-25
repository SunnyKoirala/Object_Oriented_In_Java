package Arrays;
import java.util.*;

public class Input_and_Output_Exampel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an length of the arrays: "+"\n");
        int length = input.nextInt();
        int[] marks=new int[length];

        System.out.println("enter the marks of the subjects");
        //input with the help of loop
        for(int i=0;i<marks.length;i++){
            marks[i]=input.nextInt();
        }

        //output with the help of loop
        System.out.print("The marks of the subjects are: "+"\n");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);

        }

    }
}
