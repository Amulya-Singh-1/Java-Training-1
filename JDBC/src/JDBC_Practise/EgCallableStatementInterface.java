package JDBC_Practise;
import java.sql.*;

public class EgCallableStatementInterface {
	public static void main(String[] args) {
		String driverr="com.mysql.cj.jdbc.Driver";
		Connection conn=null;
		CallableStatement stmt=null;
		try {
			Class.forName(driverr);
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "amulya", "root123");
			stmt=conn.prepareCall("{call proc(?,?,?)}");
			stmt.setInt(1, 1);
			stmt.setString(2, "AK");
			stmt.setInt(3, 5);
			stmt.execute();
			System.out.println("done");
		} catch (Exception e){
			System.out.println(e);
		}

	}

}
