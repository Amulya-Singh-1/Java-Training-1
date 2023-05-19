package JDBC_Practise;
import java.sql.*;

public class Egtester3 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "amulya", "root123");
			stmt=conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String sql= "Create table jdbcpractise" + " ( id int ," + "dept varchar(20)," + "members int," + "primary key (dept) );";
			stmt.executeUpdate(sql);
			
			String sql2="insert into jdbcpractise values(?,?,?);";
			PreparedStatement ptst=conn.prepareStatement(sql2);
			ptst.setInt(1, 11);
			ptst.setString(2, "Java");
			ptst.setInt(3, 9);
			int i=ptst.executeUpdate();
			
			ptst.setInt(1, 12);
			ptst.setString(2, "JavaScript");
			ptst.setInt(3, 20);
			int j=ptst.executeUpdate();
			
			int k =stmt.executeUpdate("update jdbcpractise set members=25 where id=1; ");
						
			System.out.println("no. of rows affected : " + i+j+k );
			System.out.println();
			
			ResultSet rs=stmt.executeQuery("Select * from jdbcpractise");
			while(rs.next()) {
				System.out.println("id : " + rs.getInt(1));
				System.out.println("id : " + rs.getString(2));
				System.out.println("id : " + rs.getInt(3));
				System.out.println();
			}
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
