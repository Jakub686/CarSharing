package carsharing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {


    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:file:C:\\Users\\JJ\\IdeaProjects\\Car Sharing\\Car Sharing\\task\\src\\carsharing\\db\\carsharing";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public static void createTable() {


        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            conn = DriverManager.getConnection(DB_URL);

            //STEP 3: Execute a query
            stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS COMPANY " +
                    "(id INTEGER not NULL AUTO_INCREMENT, " +
                    " name VARCHAR(255) not NULL UNIQUE," +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } //end finally try
        } //end try
    }


}
