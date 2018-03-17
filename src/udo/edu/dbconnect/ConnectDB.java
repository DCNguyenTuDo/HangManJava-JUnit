package udo.edu.dbconnect;

//import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Ninh1010l, DC Nguyen - edited by DCNguyen
 */
public class ConnectDB {
	

	private static final String USERNAME ="dbuser";
	private static final String PASSWORD ="123456";
	private static final String CONN_STRING ="jdbc:mysql://localhost/hangman";
	
	
	static Connection conn = null;
	
	public static Connection getconnect() throws SQLException{
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        conn= DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
	        return conn;
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return conn;
	    
	}
	}
   
	


