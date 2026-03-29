// Unit 13: JDBC - Java Database Connectivity
// Concept: Connect and interact with databases

import java.sql.*;

public class JDBCBasics {

    // Database connection details
    static final String JDBC_DRIVER = "org.sqlite.JDBC";
    static final String DB_URL = "jdbc:sqlite:students.db";

    public static void main(String[] args) {

        System.out.println("===== JDBC BASICS =====\n");

        // ===== Example 1: Create table =====
        System.out.println("Example 1: Create Table");
        createTable();

        System.out.println();

        // ===== Example 2: Insert data =====
        System.out.println("Example 2: Insert Data");
        insertData("101", "Ramesh", "85");
        insertData("102", "Priya", "92");
        insertData("103", "Arjun", "78");

        System.out.println();

        // ===== Example 3: Read data =====
        System.out.println("Example 3: Read Data");
        readData();

        System.out.println();

        // ===== Example 4: Update data =====
        System.out.println("Example 4: Update Data");
        updateData("101", "90");
        readData();

        System.out.println();

        // ===== Example 5: Delete data =====
        System.out.println("Example 5: Delete Data");
        deleteData("103");
        readData();
    }

    // Method to create table
    static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students ("
                + "roll TEXT PRIMARY KEY, "
                + "name TEXT, "
                + "marks TEXT)";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            stmt.execute(sql);
            System.out.println("Table created successfully!");

            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Method to insert data
    static void insertData(String roll, String name, String marks) {
        String sql = "INSERT INTO students VALUES('" + roll + "', '" + name + "', '" + marks + "')";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            stmt.execute(sql);
            System.out.println("Record inserted: Roll=" + roll + ", Name=" + name + ", Marks=" + marks);

            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Method to read data
    static void readData() {
        String sql = "SELECT * FROM students";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Student Records:");
            System.out.println("Roll\tName\tMarks");
            System.out.println("----\t----\t-----");

            while (rs.next()) {
                String roll = rs.getString("roll");
                String name = rs.getString("name");
                String marks = rs.getString("marks");

                System.out.println(roll + "\t" + name + "\t" + marks);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Method to update data
    static void updateData(String roll, String newMarks) {
        String sql = "UPDATE students SET marks='" + newMarks + "' WHERE roll='" + roll + "'";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            stmt.execute(sql);
            System.out.println("Record updated: Roll=" + roll + ", New Marks=" + newMarks);

            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Method to delete data
    static void deleteData(String roll) {
        String sql = "DELETE FROM students WHERE roll='" + roll + "'";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            stmt.execute(sql);
            System.out.println("Record deleted: Roll=" + roll);

            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

/*
STEPS TO USE JDBC:

1. LOAD DRIVER:
   Class.forName("org.sqlite.JDBC");

2. CREATE CONNECTION:
   Connection conn = DriverManager.getConnection(url);

3. CREATE STATEMENT:
   Statement stmt = conn.createStatement();

4. EXECUTE QUERY:
   ResultSet rs = stmt.executeQuery("SELECT ...");

5. PROCESS RESULTS:
   while(rs.next()) { ... }

6. CLOSE CONNECTIONS:
   rs.close();
   stmt.close();
   conn.close();

SQL OPERATIONS:
- INSERT: Add new records
- SELECT: Read records
- UPDATE: Modify records
- DELETE: Remove records
*/
