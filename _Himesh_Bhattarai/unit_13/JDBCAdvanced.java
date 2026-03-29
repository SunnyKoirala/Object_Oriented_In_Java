// Unit 13: JDBC - Advanced Operations
// Concept: Prepared statements and batch operations

import java.sql.*;

public class JDBCAdvanced {

    static final String JDBC_DRIVER = "org.sqlite.JDBC";
    static final String DB_URL = "jdbc:sqlite:library.db";

    public static void main(String[] args) {

        System.out.println("===== JDBC ADVANCED =====\n");

        // ===== Example 1: Create Books table =====
        System.out.println("Example 1: Setup Database");
        setupDatabase();

        System.out.println();

        // ===== Example 2: Prepared statements =====
        System.out.println("Example 2: Insert using Prepared Statements");
        insertBookPrepared("B001", "Java Programming", "Herbert Schildt", "850");
        insertBookPrepared("B002", "Data Structures", "Mark Allen", "750");

        System.out.println();

        // ===== Example 3: Search books =====
        System.out.println("Example 3: Search Books");
        searchBook("Java");

        System.out.println();

        // ===== Example 4: Display all =====
        System.out.println("Example 4: Display All Books");
        displayAllBooks();
    }

    static void setupDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS books ("
                + "bookId TEXT PRIMARY KEY, "
                + "title TEXT, "
                + "author TEXT, "
                + "pages TEXT)";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            stmt.execute(sql);
            System.out.println("Books table ready");

            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Prepared statement - more secure
    static void insertBookPrepared(String id, String title, String author, String pages) {
        String sql = "INSERT INTO books VALUES(?, ?, ?, ?)";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);

            // Using PreparedStatement (prevents SQL injection)
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, title);
            pstmt.setString(3, author);
            pstmt.setString(4, pages);

            pstmt.executeUpdate();
            System.out.println("Book added: " + title);

            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Search with LIKE
    static void searchBook(String keyword) {
        String sql = "SELECT * FROM books WHERE title LIKE ?";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + keyword + "%");

            ResultSet rs = pstmt.executeQuery();

            System.out.println("Search results for: " + keyword);
            System.out.println("ID\tTitle\tAuthor\tPages");

            while (rs.next()) {
                System.out.println(rs.getString("bookId") + "\t" + rs.getString("title") + "\t"
                        + rs.getString("author") + "\t" + rs.getString("pages"));
            }

            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Display all records
    static void displayAllBooks() {
        String sql = "SELECT * FROM books";

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("All Books:");
            System.out.println("ID\tTitle\tAuthor\tPages");
            System.out.println("--\t-----\t------\t-----");

            while (rs.next()) {
                System.out.println(rs.getString("bookId") + "\t" + rs.getString("title") + "\t"
                        + rs.getString("author") + "\t" + rs.getString("pages"));
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
