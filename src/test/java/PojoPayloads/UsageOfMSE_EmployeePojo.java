package PojoPayloads;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UsageOfMSE_EmployeePojo {
	
	public static void main(String[] args) throws IOException {
		
		MSE_EmployeePojo mse_EmployeePojo = new MSE_EmployeePojo();
		mse_EmployeePojo.setFirstName("Amod");
		mse_EmployeePojo.setLastName("Mahajan");
		mse_EmployeePojo.setAge(29);
		mse_EmployeePojo.setSalary(10987.77);
		mse_EmployeePojo.setMarried(false);
		mse_EmployeePojo.setGender("M");
		
		ObjectMapper objectMapper = new ObjectMapper();
		String convertedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mse_EmployeePojo);
		System.out.println(convertedJson);
		
		String userDir = System.getProperty("user.dir");
		File outputJsonFile = new File(userDir+ "\\src\\test\\resources\\EmployeePayload.json");
		objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputJsonFile, mse_EmployeePojo);
	}
 
}

