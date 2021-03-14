package PojoPayloads;

public class EmployeePojoUsage {
	
	public static void main(String[] args) {
		
		EmployeePojo Amod;
		EmployeePojo Animesh;
		
		// Setting employees details 
		Amod = new EmployeePojo();
		Amod.setFirstName("Amod");
		Amod.setLastName("Mahajan");
		Amod.setCityName("Benagluru");
		Amod.setGender('M');
		Amod.setMarried(false);
		Amod.setSalary(10000.54);
		
		Animesh = new EmployeePojo();
		Animesh.setFirstName("Animesh");
		Animesh.setLastName("Prashant");
		Animesh.setCityName("Kolkata");
		Animesh.setGender('M');
		Animesh.setMarried(false);
		Animesh.setSalary(23232.45);
		
		// Printing details of employees
		System.out.println("Details of Employees :-");
		System.out.println("First Name : "+ Amod.getFirstName());
		System.out.println("Last Name  : "+ Amod.getLastName());
		System.out.println("Full Name  : "+ Amod.getFulName());
		System.out.println("City Name  : "+ Amod.getCityName());
		System.out.println("Is Married?: "+ Amod.isMarried());
		System.out.println("Gender     : "+ Amod.getGender());
		System.out.println("Salary     : "+ Amod.getSalary());
		
		
		System.out.println("==========================================");
		System.out.println("First Name : "+ Animesh.getFirstName());
		System.out.println("Last Name  : "+ Animesh.getLastName());
		System.out.println("Full Name  : "+ Animesh.getFulName());
		System.out.println("City Name  : "+ Animesh.getCityName());
		System.out.println("Is Married?: "+ Animesh.isMarried());
		System.out.println("Gender     : "+ Animesh.getGender());
		System.out.println("Salary     : "+ Animesh.getSalary());
		
	}
}