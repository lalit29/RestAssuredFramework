package GameOfGetterSetterPOJO;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeePojoWithGetterSetterMethods {
 
	// private variables or data members of pojo class
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private double salary;
	private boolean married;
	
	// Getter and setter methods
	public String getFirstName() {
		System.out.println("Getter - First Name : "+ firstName);
		return firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println("Setter - First Name : "+ firstName);
		this.firstName = firstName;
	}
	public String getLastName() {
		System.out.println("Getter - Last Name : "+ lastName);
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("Setter - Last Name : "+ lastName);
		this.lastName = lastName;
	}
	public String getGender() {
		System.out.println("Getter - Gender : "+ gender);
		return gender;
	}
	public void setGender(String gender) {
		System.out.println("Setter - Gender : "+ gender);
		this.gender = gender;
	}
	public int getAge() {
		System.out.println("Getter - Age : "+ age);
		return age;
	}
	public void setAge(int age) {
		System.out.println("Setter - Age : "+ age);
		this.age = age;
	}
	public double getSalary() {
		System.out.println("Getter - Salary : "+ salary);
		return salary;
	}
	public void setSalary(double salary) {
		System.out.println("Setter - Salary : "+ salary);
		this.salary = salary;
	}
	public boolean getMarried() {
		System.out.println("Getter - Married : "+ married);
		return married;
	}
	public void setMarried(boolean married) {
		System.out.println("Setter - Married : "+ married);
		this.married = married;
	} 	
	
	@Test(enabled = false) 
	public void serializeWithBothGetterSetter() throws JsonProcessingException {
		// Just create an object of Pojo class
		EmployeePojoWithGetterSetterMethods employeePojoWithGetterSetterMethods = new EmployeePojoWithGetterSetterMethods();
		employeePojoWithGetterSetterMethods.setFirstName("Amod");
		employeePojoWithGetterSetterMethods.setLastName("Mahajan");
		employeePojoWithGetterSetterMethods.setAge(29);
		employeePojoWithGetterSetterMethods.setGender("Male");
		employeePojoWithGetterSetterMethods.setSalary(12323.56);
		employeePojoWithGetterSetterMethods.setMarried(false);
		
		// Converting a Java class object to a JSON payload as string
		System.out.println("Serialization...");
		ObjectMapper objectMapper = new ObjectMapper();
		String employeeJson = objectMapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(employeePojoWithGetterSetterMethods);
		System.out.println(employeeJson);
	}
	
	@Test
	public void deserializeWithBothGetterSetter() throws JsonProcessingException {
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
		EmployeePojoWithGetterSetterMethods employeePojoWithGetterSetterMethods = objectMapper.readValue(jsonString, EmployeePojoWithGetterSetterMethods.class);
		
		System.out.println("First name :- "+employeePojoWithGetterSetterMethods.getFirstName());
		System.out.println("Last name :- "+employeePojoWithGetterSetterMethods.getLastName());
		System.out.println("Age :- "+employeePojoWithGetterSetterMethods.getAge());
		System.out.println("Gender :- "+employeePojoWithGetterSetterMethods.getGender());
		System.out.println("Salary :- "+employeePojoWithGetterSetterMethods.getSalary());
		System.out.println("Married :- "+employeePojoWithGetterSetterMethods.getMarried());
		
		
	}
}