// Unit 8: File Input/Output Operations
// Concept: Read and write files using Java I/O

import java.io.*;

public class FileOperations {

    public static void main(String[] args) {

        System.out.println(" FILE I/O OPERATIONS \n");

        String fileName = "test.txt";

        //  Example 1: Writing to a file 
        System.out.println("Example 1: Writing to File");
        try {
            // Create FileWriter to write to file
            FileWriter writer = new FileWriter(fileName);

            // Write content to file
            writer.write("Hello Java!\n");
            writer.write("This is file I/O example.\n");
            writer.write("Reading and writing files.");

            // Close the writer (important!)
            writer.close();

            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println();

        //  Example 2: Reading from file 
        System.out.println("Example 2: Reading from File");
        try {
            // Create FileReader to read from file
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("File contents:");

            // Read line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close reader
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println();

        //  Example 3: Append to existing file 
        System.out.println("Example 3: Appending to File");
        try {
            // FileWriter with append mode (true)
            FileWriter appender = new FileWriter(fileName, true);

            appender.write("\nAppended line!");

            appender.close();

            System.out.println("Content appended successfully!");
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println();

        //  Example 4: Check file exists 
        System.out.println("Example 4: File Operations");
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists: " + fileName);
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("File path: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist");
        }

    }
}
