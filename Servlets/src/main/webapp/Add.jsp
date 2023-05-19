<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*,jakarta.security.auth.message.callback.PrivateKeyCallback.Request" %>

<%!
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
String url = "jdbc:mysql://127.0.0.1:3306/";
String user = "amulya";
String pass = "root123";
%>

<%
	request.setAttribute("Name", request.getAttribute("Nameget"));
	request.setAttribute("Age", request.getAttribute("Ageget"));	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "user", "pass");
	stmt=conn.createStatement();
	String sql2="insert into Details(?,?);";
	PreparedStatement ptst=conn.prepareStatement(sql2);
	ptst.setString(1, String.valueOf(request.getAttribute("Name")) );
	ptst.setInt(2, (Integer)(request.getAttribute("Age")) );
	int i=ptst.executeUpdate();

	// Session sess=request.getSession();
%>

</body>
</html>