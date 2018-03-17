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
	
	/*public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		
		try {
	        Class.forName("com.mysql.jdbc.Driver");
	        conn=DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
	        //conn.close();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    
    }*/
	static Connection conn = null;
	//static Statement stmt = null;
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
	/*public static ResultSet getResultset(){
		//Connection conn = null;
		//Statement stmt = null;
		//ResultSet rs= null;
		//Class.forName("com.mysql.jdbc.Driver");
		try (Connection conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			    Statement stmt = getconnect().createStatement();
			    
				)
			{
		       //Statement st=getconnect().createStatement();
		       //ResultSet rs=st.executeQuery(commandText);
			ResultSet rs = stmt.executeQuery("Select * from game");    
			return rs;
		    } catch (Exception e) {
	        e.printStackTrace();
		    } 
				
	        
		    
		    return null;
		  }*/
		

		
		/*public static ResultSet getResultset(String commandText) throws SQLException{
			Connection conn = null;
			Statement st = null; 
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn=DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
	            st = conn.createStatement();
	            ResultSet rs = st.executeQuery(commandText);
	            
	            //conn.close();
	            //st.close();
	            //rs.close();
	            
	            return rs;
	        }catch(SQLException se){
	            //Handle errors for JDBC
	            se.printStackTrace();
	        }catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        finally {
				
			    //try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
			    st.close();
			    conn.close();
			    
			    return null;
			} 
	    }*/
		
		/*public static ResultSet getResultset(String commandText){
			
		try {
			Statement st=getconnect().createStatement();
            ResultSet rs=st.executeQuery(commandText);
            return rs;
		} catch (SQLException ex) 
			{
			 ex.printStackTrace();
		    
			}finally {
				
			    try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
			    try { st.close(); } catch (Exception e) { e.printStackTrace();}
			    try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
			    
			    return null;
			} 
		}*/
	
	/*public static class Connect {
		static Connection conn = null;
		static Statement st = null;
		static ResultSet rs = null;
		
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
		} catch (SQLException ex) 
			{
			 ex.printStackTrace();
		    
			}finally {
				
			    try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
			    try { st.close(); } catch (Exception e) { e.printStackTrace();}
			    try { conn.close(); } catch (Exception e) { e.printStackTrace(); }
			    
			    return null;
			} 
		}
		
		public static void main(String[] args) {
	        getconnect();
	    }
	    */
		
		/*void getResultset(String commandText)
		{
			try {
		           st=conn.createStatement();
		            rs=st.executeQuery(commandText);
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        } 
		}*/

		
	}
	
	/*public static void main(String[] args) {
        ConnectDB.Connect.getResultset("select * from game");
        System.out.println("Done");
        }*/
	
	/*public static void main(String[] args) {
	        getconnect();
	    }

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
        
	
    }*/
   
	


