// Unit 2: Arrays
// Concept: Arrays store multiple values of same type in sequence

public class Arrays {

    public static void main(String[] args) {

        // Creating and initializing arrays
        System.out.println("CREATING ARRAYS\n");

        // 1. Declare and create array with fixed size
        int[] numbers = new int[5];  // Array of size 5 [0,1,2,3,4]-Indexes
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("Method 1 - Array declaration and assignment:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // 2. Declare and initialize array in one line
        System.out.println("\nMethod 2 - Array with initial values:");
        int[] ages = {18, 25, 30, 35, 40};

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Age " + (i + 1) + ": " + ages[i]);
        }

        // 3. String array
        System.out.println("\nString Array:");
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i + 1) + ": " + names[i]);
        }

        // 4. 2D Array (matrix)
        System.out.println("\n 2D ARRAY (MATRIX)");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("2x3 Matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // Array length property
        System.out.println("\nARRAY PROPERTIES");
        System.out.println("Length of numbers array: " + numbers.length);
        System.out.println("Length of names array: " + names.length);
    }
}
