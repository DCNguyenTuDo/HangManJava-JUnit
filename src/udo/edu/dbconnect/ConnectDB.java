package udo.edu.dbconnect;

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
	
	public static Connection getconnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public static ResultSet getResultset(String commandText){
        try {
            Statement st=getconnect().createStatement();
            ResultSet rs=st.executeQuery(commandText);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        getconnect();
    }

	

}
