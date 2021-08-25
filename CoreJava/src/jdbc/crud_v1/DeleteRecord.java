package jdbc.crud_v1;

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
		
		try {
			Class.forName(DRIVER); //loading driver
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//Insert Record
			
			//Insert SQL Statement			
			//String sql = "INSERT INTO person(pid, full_name, contact_address) VALUES(10,'Krishna','NP')";
			
			String sql = "UPDATE person SET full_name='New Name', contact_address='New Address' WHERE pid=1";
			
			//String sql = "UPDATE person SET full_name='New Name' WHERE pid=1";
			//String sql = "UPDATE person SET contact_address='New Address' WHERE pid=1";
			
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql);//run sql statement | insert, update, delete
			stat.close();
			conn.close();
			System.out.println("Update record successfully!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}