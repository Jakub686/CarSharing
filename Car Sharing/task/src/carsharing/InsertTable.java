package carsharing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTable {


    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public static void insertTable() {
        Scanner scanner = new Scanner(System.in);


        View.showEnterTheCompanyName();
        String input = scanner.nextLine();


        Connection conn = null;
        Statement stmt = null;

        try{
            // STEP 1: Register JDBC driver
            Class.forName(Main.JDBC_DRIVER);

            // STEP 2: Open a connection

            conn = DriverManager.getConnection(Main.DB_URL);
            conn.setAutoCommit(true);


            // STEP 3: Execute a query
            stmt = conn.createStatement();
            String sql ="";


            sql = "INSERT INTO COMPANY(name) VALUES('"+input+"')";
            stmt.executeUpdate(sql);

            System.out.println("The company was created!");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if(stmt !=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn !=null) conn.close();
            } catch(SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
    }
}
