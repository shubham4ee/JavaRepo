<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body bgcolor="yellow">
			<h2>Please Sign-In</h2>
			<form action="doValidate" method="post">
				<pre>
					<h2>Enter Username: </h2><input type="text" name="user_name"/>
					
					<h2>Enter Password:</h2> <input type="password" name="user_password"/>
					
					<input type="submit" value="Sign In"/>
				</pre>
			</form>
		</body>
</html>