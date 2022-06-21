package carsharing;

public class Main {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:file:C:\\Users\\JJ\\IdeaProjects\\Car Sharing\\Car Sharing\\task\\src\\carsharing\\db\\carsharing;IFEXISTS=TRUE";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) throws Exception {

        //Creating Table if exists
        CreateTable.createTable();

        MenuMain.mainMenu();
//        InsertTable.insertTable();
//        ReadTable.readTable();


    }

}