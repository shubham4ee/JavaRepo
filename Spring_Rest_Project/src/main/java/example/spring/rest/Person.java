package example.spring.rest;

public class Person {
	private String firstName;
	private String lastName;
	private String profession;
	private int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName, String lastName, String profession, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.profession = profession;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
