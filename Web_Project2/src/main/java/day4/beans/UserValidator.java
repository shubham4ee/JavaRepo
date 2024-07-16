package day4.beans;

public class UserValidator {//This class is used to validate the user against the information available in User object
	public static boolean isValid(User currentUser) {
		boolean success = false;
		String userId = currentUser.getUserName();
		String pwd = currentUser.getPassword();
		if(userId.equals("admin") && pwd.equals("phoenix123"))
			success = true;
		return success;
	}
}
