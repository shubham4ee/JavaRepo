<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>
		<%-- This page instantiates a Java Bean: Restaurant from package: day4.beans and sets values for
		all the properties --%>
		<jsp:useBean id="currentRestaurant" class="day4.beans.Restaurant" scope="session"/>
		<jsp:setProperty property="*" name="currentRestaurant"/>
		<h2>Restaurant created successfully.</h2>
		<h2>To view the same, please <a href="show_restaurant.jsp">Click Here</a></h2>
	</body>
</html>