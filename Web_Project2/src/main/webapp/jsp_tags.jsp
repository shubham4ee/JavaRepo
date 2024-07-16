<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>
		<%--Including the resource: color.html --%>
		<%@ include file="color.html" %>
		<%-- Declaring some variable and defining some method using Declaration --%>
		<%!
			int num = 7;
			String getMessage(String name){
				return "Welcome " + name;
			}
		%>
		<%-- Printing HELLO message using h1 heading style 5 times --%>
		<%
			for(int x=1;x<=5;x++){
		%>
				<h1>HELLO</h1>
		<%
			}
		%>
		<%-- Showing today's date using java.time.LocalDate --%>
		<%
			LocalDate today = LocalDate.now();
		%>
		<h2>Today's date is <%=today %></h2>
		<h2>Reply from method getMessage() is <%=getMessage("Micky") %></h2>
		<h2>The value of the variable num is <%=num %></h2>
		<h2>The square of <%=num %> is <%= (num * num) %></h2>
	</body>
</html>










