<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Add page </title>
</head>
<body>

<%@page import="java.util.*" %>

<%!
	int d=5;
	public int dosomething(int t){
		return 2*t;
	}
%>

<%
int i=Integer.parseInt(request.getParameter("num1"));
int j=Integer.parseInt(request.getParameter("num2"));
int k=i+j;

out.println("output is : " + k);
%>
<br>
using expression tag of jsp, we can print d without using PrintWriter Object : <%=	d %>

</body>
</html>