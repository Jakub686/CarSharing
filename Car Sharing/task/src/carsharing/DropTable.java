package carsharing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {


    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";


    public static void dropTable() {

        Connection conn = null;
        Statement stmt = null;

        try {
            // STEP 1: Register JDBC driver
            Class.forName(Main.JDBC_DRIVER);

            //STEP 2: Open a connection
            conn = DriverManager.getConnection(Main.DB_URL);

            //STEP 3: Execute a query
            stmt = conn.createStatement();
            String sql =  "DROP TABLE   COMPANY ";

            stmt.executeUpdate(sql);


            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stmt !=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn !=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end try
    }
}
