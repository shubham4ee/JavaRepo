<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>
		<h2>Enter Restaurant Details:</h2>
		<form action="create_restaurant.jsp" method="post">
				<pre>
					<h2>ID: </h2><input type="text" name="restaurantId"/>
					
					<h2>Name: </h2><input type="text" name="name"/>
					
					<h2>Cuisine: </h2><input type="text" name="cuisine"/>
					
					<h2>Branch Count: </h2><input type="text" name="branchCount"/>
					
					<input type="submit" value="CREATE"/>
				</pre>
			</form>
	</body>
</html>