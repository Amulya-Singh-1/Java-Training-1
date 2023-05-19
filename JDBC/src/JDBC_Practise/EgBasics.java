package JDBC_Practise;

import java.sql.*;

public class EgBasics {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc.mysql:// ", "u", "p");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
