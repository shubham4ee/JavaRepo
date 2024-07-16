<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>
		<%-- This page loads the bean with ID: currentRestaurant of type: day4.beans.Restaurant from 
			Session scope and displays its values --%>
			<jsp:useBean id="currentRestaurant" class="day4.beans.Restaurant" scope="session"/>
			<h1>Showing Restaurant Details: </h1>
			<h2>ID : <jsp:getProperty property="restaurantId" name="currentRestaurant"/></h2>
			
			<h2>Name : <jsp:getProperty property="name" name="currentRestaurant"/></h2>
			
			<h2>Cuisine : <jsp:getProperty property="cuisine" name="currentRestaurant"/></h2>
			
			<h2>Branch Count : <jsp:getProperty property="branchCount" name="currentRestaurant"/></h2>
	</body> 
</html>