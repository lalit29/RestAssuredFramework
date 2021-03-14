package JacksonTutorials;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
 
public class AnnotationJsonIncludeExample {
 
	public static void main(String[] args) throws JsonProcessingException {
 
		// Just create an object of Pojo class
		Employee employee = new Employee();
		// Set value as you wish
		employee.setFirstName("Amod");
		employee.setLastName("Mahajan");
		//employee.setAge(29);
		employee.setSalary(3434343);
		employee.setMarried(true);
		
		// Converting a Java class object to a JSON payload as string
		ObjectMapper objectMapper = new ObjectMapper();
		String employeeJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(employeeJson);
	}
}
