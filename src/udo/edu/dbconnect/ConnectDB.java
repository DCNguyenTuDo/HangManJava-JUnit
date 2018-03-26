package udo.edu.dbconnect;

//import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Ninh1010l, DCNguyen - edited by DCNguyen
 */
public class ConnectDB {
	

	private static final String USERNAME ="dbuser";
	private static final String PASSWORD ="123456";
	private static final String CONN_STRING ="jdbc:mysql://localhost/hangman";
	
	
	private static Connection conn = null;
	
	public synchronized static Connection getconnect() throws SQLException{
	    try {
		if(null != conn && conn.isValid(1000)) return conn;
	        Class.forName("com.mysql.jdbc.Driver");
	        conn= DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
	        return conn;
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    
	    return conn;
	    
	}
}
   
	


