package comnewsql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connection {

	
	
	

	
	    public static void main(String[] args) {
	        // JDBC URL, username, and password of MySQL server
	        String url = "jdbc:mysql://localhost:3306/Basic";
	        String user = "root";
	        String password = "Jailer@777";

	        // Establish a connection
	        try (Connection connection = DriverManager.getConnection(url, user, password)) {
	            System.out.println("Connected to the database");
	        } catch (SQLException e) {
	            System.err.println("Error connecting to the database: " + e.getMessage());
	        }
	    }
	}


