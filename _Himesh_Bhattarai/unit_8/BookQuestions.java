// Unit 8: Book Questions - I/O & File Operations
// Concept: File handling and stream operations

import java.io.*;

public class BookQuestions {

    public static void main(String[] args) {

        // Q: Write student data to file
        System.out.println(" QUESTION 1: Write Student Data ");

        String studentFile = "students.txt";

        try {
            FileWriter writer = new FileWriter(studentFile);

            // Write header
            writer.write("Student Records\n");
            writer.write("\n\n");

            // Write student data
            writer.write("Roll: 101, Name: Ramesh, Grade: A\n");
            writer.write("Roll: 102, Name: Priya, Grade: B\n");
            writer.write("Roll: 103, Name: Arjun, Grade: A\n");

            writer.close();

            System.out.println("Student data written to: " + studentFile);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println();

        //  QUESTION 2 
        // Q: Read and display file content
        System.out.println(" QUESTION 2: Read File Content ");

        try {
            FileReader reader = new FileReader(studentFile);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("File Contents:");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println();

        //  QUESTION 3 
        // Q: Count lines in file
        System.out.println(" QUESTION 3: Count Lines in File ");

        int lineCount = 0;

        try {
            FileReader reader = new FileReader(studentFile);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
            }

            bufferedReader.close();

            System.out.println("Total lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println();

        //  QUESTION 4 
        // Q: Copy content from one file to another
        System.out.println(" QUESTION 4: Copy File ");

        String sourceFile = studentFile;
        String destinationFile = "students_backup.txt";

        try {
            FileReader reader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(reader);

            FileWriter writer = new FileWriter(destinationFile);

            String line;

            // Read from source and write to destination
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line + "\n");
            }

            bufferedReader.close();
            writer.close();

            System.out.println("File copied from: " + sourceFile);
            System.out.println("File copied to: " + destinationFile);
            System.out.println("Copy completed successfully!");

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
