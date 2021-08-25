package jdbc.crud_v2;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class DeleteRecord {
	
	public static void main(String[] args) {
		
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		
		final String SERVER = "remotemysql.com";
		final int PORT = 3306;
		final String DB_NAME = "kO3VCMea81";
		
		final String USER = "kO3VCMea81";
		final String PASSWORD = "aenJX7VLJC";
		
		final String URL ="jdbc:mysql://"+SERVER+":"+PORT+"/"+DB_NAME;
		
		int pid;
		pid=1; //Read from Keyboard
		try {
			Class.forName(DRIVER); //loading driver
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);									
			
			String sql = "DELETE FROM person WHERE pid="+pid;//based on primary key
			
			//String sql = "DELETE FROM person WHERE pid=1";//based on primary key			
			//String sql = "DELETE FROM person WHERE full_name='Raj'";
			//String sql = "DELETE FROM person WHERE contact_address='KTM'";
			//String sql = "DELETE FROM person WHERE full_name='Raj' and contact_address='KTM'";
			//String sql = "DELETE FROM person WHERE full_name='Raj' or contact_address='KTM'";
			
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql);//run sql statement | insert, update, delete
			stat.close();
			conn.close();
			System.out.println("Delete Record(s) Successfully!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}