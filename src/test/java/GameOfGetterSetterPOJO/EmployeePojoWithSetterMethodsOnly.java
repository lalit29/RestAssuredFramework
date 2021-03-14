package GameOfGetterSetterPOJO;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeePojoWithSetterMethodsOnly {
	 
	// private variables or data members of pojo class
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private double salary;
	private boolean married;
	
	// Setter methods
	
	public void setFirstName(String firstName) {
		System.out.println("Setter - First Name : "+ firstName);
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		System.out.println("Setter - Last Name : "+ lastName);
		this.lastName = lastName;
	}
	
	public void setGender(String gender) {
		System.out.println("Setter - Gender : "+ gender);
		this.gender = gender;
	}
	
	public void setAge(int age) {
		System.out.println("Setter - Age : "+ age);
		this.age = age;
	}
	
	public void setSalary(double salary) {
		System.out.println("Setter - Salary : "+ salary);
		this.salary = salary;
	}
	
	public void setMarried(boolean married) {
		System.out.println("Setter - Married : "+ married);
		this.married = married;
	}
 
	public String alternateGetFirstName() {
		return firstName;
	}
 
	public String alternateGetLastName() {
		return lastName;
	}
 
	public String alternateGetGender() {
		return gender;
	}
 
	public int alternateGetAge() {
		return age;
	}
 
	public double alternateGetSalary() {
		return salary;
	}
 
	public boolean alternateGetMarried() {
		return married;
	} 
	@Test
	public void deserializeWithSetterOnly() throws JsonProcessingException {
		String jsonString = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\" : \"Mahajan\",\r\n" + 
				"  \"gender\" : \"Male\",\r\n" + 
				"  \"age\" : 29,\r\n" + 
				"  \"salary\" : 12323.56,\r\n" + 
				"  \"married\" : false\r\n" + 
				"}";
		
		System.out.println("Deserialization...");
		ObjectMapper objectMapper = new ObjectMapper();
		EmployeePojoWithSetterMethodsOnly employeePojoWithSetterMethodsOnly = objectMapper.readValue(jsonString, EmployeePojoWithSetterMethodsOnly.class);
		
		System.out.println("First name :- "+employeePojoWithSetterMethodsOnly.alternateGetFirstName());
		System.out.println("Last name :- "+employeePojoWithSetterMethodsOnly.alternateGetLastName());
		System.out.println("Age :- "+employeePojoWithSetterMethodsOnly.alternateGetAge());
		System.out.println("Gender :- "+employeePojoWithSetterMethodsOnly.alternateGetGender());
		System.out.println("Salary :- "+employeePojoWithSetterMethodsOnly.alternateGetSalary());
		System.out.println("Married :- "+employeePojoWithSetterMethodsOnly.alternateGetMarried());
		
		
	}
	
}