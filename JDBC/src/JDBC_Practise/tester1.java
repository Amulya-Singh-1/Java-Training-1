package JDBC_Practise;
import java.sql.*;

public class tester1 {
	public static void main(String[] args) {
		String dburl = "com.mysql.cj.jdbc.Driver";
		Statement stmt= null;
		Connection conn=null;
		try {
			Class.forName(dburl);
			conn=DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/db1", "amulya", "root123");
			stmt=conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
			String sql= " Create table players" + " (UID int ," + "FirstName Varchar(255)," + "LastName Varchar(255)," + "Age Int," + "Primary Key (UID) );";
			stmt.executeUpdate(sql);
			System.out.println("table created ");
			
			PreparedStatement ptst=conn.prepareStatement("insert into players values(?,?,?,?)");
			ptst.setInt(1, 1);
			ptst.setString(2, "Amulya");
			ptst.setString(3, "Kumar");
			ptst.setInt(4, 23);
			int i=ptst.executeUpdate();

			ptst.setInt(1, 3);
			ptst.setString(2, "Am");
			ptst.setString(3, "Kr");
			ptst.setInt(4, 23);
			int j=ptst.executeUpdate();
			
			System.out.println("data inserted into table. no. of rows inserted :" + i+j);
			
			
			ResultSet rs= stmt.executeQuery("select * from players ");
			rs.first();
			System.out.println( rs.getInt(1) ) ;
			System.out.println( rs.getString("FirstName") );
			System.out.println( rs.getString(3) );
			System.out.println( rs.getInt("Age") );
			System.out.println("query done");
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
