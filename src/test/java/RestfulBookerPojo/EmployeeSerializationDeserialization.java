package RestfulBookerPojo;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
public class EmployeeSerializationDeserialization {
 
	@Test
	public void createEmployeeJSONFromEmployeePOJOClass() throws JsonProcessingException
	{
		// Just create an object of Pojo class
		Employee employee = new Employee();
		// Set value as you wish
		employee.setFirstName("Amod");
		employee.setLastName("Mahajan");
		employee.setAge(29);
		employee.setGender("Male");
		employee.setSalary(3434343);
		employee.setMarried(false);
		
		// Converting a Java class object to a JSON payload as string
		ObjectMapper objectMapper = new ObjectMapper();
		String employeeJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(employeeJson);
	}
	
	
	@Test
	public void getPojoFromEmployeeObject() throws JsonProcessingException
	{
		// Just create an object of Pojo class
		Employee employee = new Employee();
		// Set value as you wish
		employee.setFirstName("Amod");
		employee.setLastName("Mahajan");
		employee.setAge(29);
		employee.setGender("Male");
		employee.setSalary(3434343);
		employee.setMarried(false);
		
		// Converting a Java class object to a JSON payload as string
		ObjectMapper objectMapper = new ObjectMapper();
		String employeeJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		
		
		// Converting EMployee json string to Employee class object
		Employee employee2 = objectMapper.readValue(employeeJson, Employee.class);
		System.out.println("First Name of employee : "+employee2.getFirstName());
		System.out.println("Last Name of employee : "+employee2.getLastName());
		System.out.println("Age of employee : "+employee2.getAge());
		System.out.println("Gender of employee : "+employee2.getGender());
		System.out.println("Salary of employee : "+employee2.getSalary());
		System.out.println("Marital status of employee : "+employee2.getMarried());
	}
}