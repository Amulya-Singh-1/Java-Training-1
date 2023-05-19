import java.sql.*;
import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

public class EgJDBCimplementation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "amulya", "root123");
		Statement stmt=conn.createStatement();
		String sql2="insert into Details(?,?);";
		PreparedStatement ptst=conn.prepareStatement(sql2);
		ptst.setString(1,  );
		ptst.setInt(2, );
		int i=ptst.executeUpdate();
		
	}

}
