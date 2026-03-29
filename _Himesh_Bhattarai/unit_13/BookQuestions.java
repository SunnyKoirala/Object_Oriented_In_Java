// Unit 13: Book Questions - JDBC Practice
// Concept: Database operations using JDBC

import java.sql.*;

public class BookQuestions {

    static final String JDBC_DRIVER = "org.sqlite.JDBC";

    // Q: Create employee table and insert data
    static void question1() {
        String DB_URL = "jdbc:sqlite:company.db";
        String createSQL = "CREATE TABLE IF NOT EXISTS employees ("
                + "empId TEXT PRIMARY KEY, "
                + "name TEXT, "
                + "salary TEXT)";

        String insertSQL1 = "INSERT INTO employees VALUES('E001', 'Rajesh', '50000')";
        String insertSQL2 = "INSERT INTO employees VALUES('E002', 'Priya', '60000')";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            stmt.execute(createSQL);
            System.out.println("Table created");

            stmt.execute(insertSQL1);
            stmt.execute(insertSQL2);
            System.out.println("Employees added: Rajesh, Priya");

            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Q: Read and display all employees
    static void question2() {
        String DB_URL = "jdbc:sqlite:company.db";
        String sql = "SELECT * FROM employees";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employee List:");
            System.out.println("ID\tName\tSalary");

            while (rs.next()) {
                System.out.println(rs.getString("empId") + "\t" + rs.getString("name") + "\t"
                        + rs.getString("salary"));
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Q: Update employee salary
    static void question3() {
        String DB_URL = "jdbc:sqlite:company.db";
        String updateSQL = "UPDATE employees SET salary='65000' WHERE empId='E001'";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            stmt.execute(updateSQL);
            System.out.println("Salary updated for E001");

            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Q: Search employee by name using PreparedStatement
    static void question4(String searchName) {
        String DB_URL = "jdbc:sqlite:company.db";
        String searchSQL = "SELECT * FROM employees WHERE name LIKE ?";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);

            PreparedStatement pstmt = conn.prepareStatement(searchSQL);
            pstmt.setString(1, "%" + searchName + "%");

            ResultSet rs = pstmt.executeQuery();

            System.out.println("Search results for: " + searchName);

            if (rs.next()) {
                System.out.println("ID: " + rs.getString("empId"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Salary: " + rs.getString("salary"));
            } else {
                System.out.println("No employee found");
            }

            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }




    public static void main(String[] args) {

        System.out.println("JDBC PRACTICE QUESTIONS \n");

        // Run Question 1
        System.out.println("QUESTION 1: Create and Insert Data");
        question1();

        System.out.println();

        // Run Question 2
        System.out.println("QUESTION 2: Read and Display Data");
        question2();

        System.out.println();

        // Run Question 3
        System.out.println("QUESTION 3: Update Employee Salary");
        question3();
        System.out.println("Updated data:");
        question2();

        System.out.println();

        // Run Question 4
        System.out.println("QUESTION 4: Search Employee by Name");
        question4("Rajesh");
    }
}
