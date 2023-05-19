import java.sql.*;

public class tableduhh {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "amulya", "root123");
		Statement stmt=conn.createStatement();
		String sql="create table Details " + "(Name varchar(20)," + "Age int" + "Primary key (name) );";
		ResultSet rs= stmt.executeQuery(sql);
		conn.close();
	}
}
