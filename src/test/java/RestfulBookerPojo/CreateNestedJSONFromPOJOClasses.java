package RestfulBookerPojo;

import java.util.ArrayList;
import java.util.List;
 
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
public class CreateNestedJSONFromPOJOClasses {
 
	public static void main(String[] args) throws JsonProcessingException {
			
		NestedPOJO nestedPOJO = new NestedPOJO();
		nestedPOJO.setCompanyName("MSE");
		nestedPOJO.setCompanyHOCity("Benagluru");
		nestedPOJO.setCompanyCEO("Amod");
		
		List<String> supportedSalaryBanks = new ArrayList<String>();
		supportedSalaryBanks.add("HDFC");
		supportedSalaryBanks.add("ICICI");
		supportedSalaryBanks.add("AXIS");
		nestedPOJO.setSupportedSalaryBanks(supportedSalaryBanks);
		
		List<Integer> pincodesOfCityOffice = new ArrayList<Integer>();
		pincodesOfCityOffice.add(560037);
		pincodesOfCityOffice.add(360034);
		pincodesOfCityOffice.add(456343);
		nestedPOJO.setPincodesOfCityOffice(pincodesOfCityOffice);
		
		// Create first employee
		Employee amod = new Employee();
		amod.setFirstName("Amod");
		amod.setLastName("Mahajan");
		amod.setAge(28);
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
		kitty.setAge(26);
		kitty.setGender("Female");
		kitty.setSalary(30000.56);
		kitty.setMarried(false);
 
		// Creating a List of Employees
		List<Employee> allEMployees = new ArrayList<Employee>();
		allEMployees.add(amod);
		allEMployees.add(animesh);
		allEMployees.add(kitty);
		nestedPOJO.setEmployee(allEMployees);
		
		Contractors seema = new Contractors();
		seema.setFirstName("Seema");
		seema.setLastName("Singh");
		seema.setContractFrom("Jan-2019");
		seema.setContractTo("JAN-2025");
		
		Contractors hari = new Contractors();
		hari.setFirstName("Hari");
		hari.setLastName("Prasad");
		hari.setContractFrom("Jan-2017");
		hari.setContractTo("JAN-2030");
		
		List<Contractors> allContractors = new ArrayList<Contractors>();
		allContractors.add(seema);
		allContractors.add(hari);
		nestedPOJO.setContractors(allContractors);
		
		CompanyPFDeails companyPFDeails = new CompanyPFDeails();
		companyPFDeails.setPfName("XYZ");
		companyPFDeails.setPfCity("Benagluru");
		companyPFDeails.setPfYear(2012);
		companyPFDeails.setNoOfEmployees(10);
		nestedPOJO.setCompanyPFDeails(companyPFDeails);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String nestedJsonPayload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(nestedPOJO);
		System.out.println(nestedJsonPayload);
	}
}
