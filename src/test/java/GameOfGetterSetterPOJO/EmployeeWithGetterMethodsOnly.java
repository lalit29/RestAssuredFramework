package GameOfGetterSetterPOJO;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeWithGetterMethodsOnly {
	 
	// private variables or data members of pojo class
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private double salary;
	private boolean married;
	
	// Getter methods only
	public String getFirstName() {
		System.out.println("Getter - First Name : "+ firstName);
		return firstName;
	}
	
	public String getLastName() {
		System.out.println("Getter - Last Name : "+ lastName);
		return lastName;
	}
	
	public String getGender() {
		System.out.println("Getter - Gender : "+ gender);
		return gender;
	}
	
	public int getAge() {
		System.out.println("Getter - Age : "+ age);
		return age;
	}
	
	public double getSalary() {
		System.out.println("Getter - Salary : "+ salary);
		return salary;
	}
	
	public boolean getMarried() {
		System.out.println("Getter - Married : "+ married);
		return married;
	}
	
	@Test(enabled = false) 
	public void serializeWithGetterOnly() throws JsonProcessingException {
		// Just create an object of Pojo class but we can set values as we do not have any setter methods
		EmployeeWithGetterMethodsOnly employeeWithGetterMethodsOnly = new EmployeeWithGetterMethodsOnly();
			
		// Converting a Java class object to a JSON payload as string
		ObjectMapper objectMapper = new ObjectMapper();
		String employeeJson = objectMapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(employeeWithGetterMethodsOnly);
		System.out.println("Serialization...");
		System.out.println(employeeJson);
	}
	
	@Test
	public void deserializeWithGetterOnly() throws JsonProcessingException {
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
		EmployeeWithGetterMethodsOnly employeeWithGetterMethodsOnly = objectMapper.readValue(jsonString, EmployeeWithGetterMethodsOnly.class);
		
		System.out.println("First name :- "+employeeWithGetterMethodsOnly.getFirstName());
		System.out.println("Last name :- "+employeeWithGetterMethodsOnly.getLastName());
		System.out.println("Age :- "+employeeWithGetterMethodsOnly.getAge());
		System.out.println("Gender :- "+employeeWithGetterMethodsOnly.getGender());
		System.out.println("Salary :- "+employeeWithGetterMethodsOnly.getSalary());
		System.out.println("Married :- "+employeeWithGetterMethodsOnly.getMarried());
		
		
	}
}