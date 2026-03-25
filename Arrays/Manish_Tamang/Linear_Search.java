package Arrays;
import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] value = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.print("Enter number to search: ");
        int n = input.nextInt();

        int index = -1;

        for (int i = 0; i < value.length; i++) {
            if (value[i] == n) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("element not found in the array.");
        }
    }
    }