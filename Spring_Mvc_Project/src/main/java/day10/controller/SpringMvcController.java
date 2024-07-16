package day10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import day10.model.User;
import day10.model.UserValidator;

@Controller//Marks this class as a Controller of Spring MVC
public class SpringMvcController {
	//Defining a Request Handling Method that returns the view name
	@RequestMapping("/showIndex")//By default GET request is handled
	public String getIndexPage() {
		return "index";
	}
	
	@RequestMapping("/showLogin")
	public String getLoginPage() {
		return "login";
	}
	@RequestMapping(value =  "/doValidate", method = RequestMethod.POST)
	public String doValidateUser(
			@RequestParam("user_name") String uid,  
			@RequestParam("user_password") String pwd) {
		//This method is used to capture user credentials, validate them and return
		//the view name accordingly. Valid --> success, Invalid --> failure
		//It is also handling HTTP POST request.
		String resultPage = "failure";
		User userObj = new User(uid, pwd);
		boolean valid = UserValidator.isValid(userObj);
		if(valid)
			resultPage = "success";
		return resultPage;
	}
}








