package PojoPayloads;

public class EmployeePojo {
	
	// Private fields
	private String firstName;
	private String lastName;
	private double salary;
	private String cityName;
	private boolean isMarried;
	private char gender;
	private String fullName;
	
	// Public constructor
	public EmployeePojo()
	{
		
	}
	
	// Business logic to get full name
	public String getFulName()
	{
		this.fullName =  this.firstName + " "+ this.lastName;
		return fullName;
	}
	
	// Public getter setter methods
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}