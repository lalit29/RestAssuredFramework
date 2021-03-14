package RestfulBookerPojo;

import java.util.ArrayList;
import java.util.List;
 
import org.testng.annotations.Test;
 
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
 
public class ListOfEmployeesSerializationDeserialization {
 
	public String allEmployeeJson;
 
	@Test
	public void createListOfEmployeesJSONArrayFromEmployeePOJOClass() throws JsonProcessingException {
		// Create first employee
		Employee amod = new Employee();
		amod.setFirstName("Amod");
		amod.setLastName("Mahajan");
		amod.setAge(29);
		amod.setGender("Male");
		amod.setSalary(10000.56);
		amod.setMarried(false);
 
		// Create second employee
		Employee animesh = new Employee();
		animesh.setFirstName("Animesh");
		animesh.setLastName("Prashant");
		animesh.setAge(30);
		animesh.setGender("Male");
		animesh.setSalary(20000.56);
		animesh.setMarried(true);
 
		// Create third employee
		Employee kitty = new Employee();
		kitty.setFirstName("Kitty");
		kitty.setLastName("Gupta");
		kitty.setAge(27);
		kitty.setGender("Female");
		kitty.setSalary(30000.56);
		kitty.setMarried(false);
 
		// Creating a List of Employees
		List<Employee> allEMployees = new ArrayList<Employee>();
		allEMployees.add(amod);
		allEMployees.add(animesh);
		allEMployees.add(kitty);
 
		// Converting a Java class object to a JSON Array payload as string
		ObjectMapper objectMapper = new ObjectMapper();
		allEmployeeJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(allEMployees);
		System.out.println(allEmployeeJson);
	}
 
	@Test
	public void getPojoFromEmployeeObject() throws JsonProcessingException {
		// Converting EMployee json Array string to Employee class object
		ObjectMapper objectMapper = new ObjectMapper();
		List<Employee> allEmploeesDetails = objectMapper.readValue(allEmployeeJson,
				new TypeReference<List<Employee>>() {
				});
		for (Employee emp : allEmploeesDetails) {
			System.out.println("========================================================");
			System.out.println("First Name of employee : " + emp.getFirstName());
			System.out.println("Last Name of employee : " + emp.getLastName());
			System.out.println("Age of employee : " + emp.getAge());
			System.out.println("Gender of employee : " + emp.getGender());
			System.out.println("Salary of employee : " + emp.getSalary());
			System.out.println("Marital status of employee : " + emp.getMarried());
			System.out.println("========================================================");
		}
	}
}