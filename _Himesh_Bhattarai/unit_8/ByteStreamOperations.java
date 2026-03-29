// Unit 8: Byte Streams
// Concept: Read and write binary data using streams

import java.io.*;

public class ByteStreamOperations {

    public static void main(String[] args) {

        System.out.println("BYTE STREAM OPERATIONS \n");

        String fileName = "binary.dat";

        // Example 1: Writing bytes to file 
        System.out.println("Example 1: Writing Bytes");
        try {
            // OutputStream for writing bytes
            FileOutputStream fos = new FileOutputStream(fileName);

            // Write individual bytes
            String message = "Binary Data";
            byte[] bytes = message.getBytes();  // Convert string to bytes

            fos.write(bytes);  // Write bytes to file

            fos.close();

            System.out.println("Bytes written: " + bytes.length);
            System.out.println("Message written: " + message);

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println();

        // Example 2: Reading bytes from file 
        System.out.println("Example 2: Reading Bytes");
        try {
            // InputStream for reading bytes
            FileInputStream fis = new FileInputStream(fileName);

            byte[] buffer = new byte[1024];  // Buffer to store bytes

            // Read bytes from file
            int bytesRead = fis.read(buffer);

            // Convert bytes back to string
            String content = new String(buffer, 0, bytesRead);

            System.out.println("Bytes read: " + bytesRead);
            System.out.println("Content: " + content);

            fis.close();

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println();

        // Example 3: Copy file using streams 
        System.out.println("Example 3: Copy File");
        try {
            // Read from source and write to destination
            FileInputStream input = new FileInputStream(fileName);
            FileOutputStream output = new FileOutputStream("binary_copy.dat");

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Copy byte by byte
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

            input.close();
            output.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
