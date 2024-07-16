package example.spring.rest;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Marks this class as a Restful Controller i.e. meant for providing REST API
public class SpringRestController {
	@RequestMapping("/first-rest-demo")
	public String firstRestDemo() {
		return "Welcome to my first REST demo";//Returning some data
	}
	//Creating an end-point that returns some Person's data
	@RequestMapping("/one-person")
	public Person getOnePerson() {
		Person pr = new Person("Hritik", "Roshan", "Actor", 51);
		return pr;
	}
	
	//Creating an end-point that returns all Person's data
	@RequestMapping("/all-persons")
	public Collection<Person> getAllPersons(){
		Person pr = new Person("Hritik", "Roshan", "Actor", 51);
		Person pr2 = new Person("Virat", "Kohli", "Cricketer", 35);
		Person pr3 = new Person("Steffi", "Graf", "Tennis Player", 55);
		Collection<Person> allPersons = Arrays.asList(pr, pr2, pr3);
		return allPersons;
	}
}






