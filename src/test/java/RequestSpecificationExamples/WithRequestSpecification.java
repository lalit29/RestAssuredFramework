package RequestSpecificationExamples;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
 
public class WithRequestSpecification {
	
	RequestSpecification requestSpecification;
	
	@BeforeClass
	public void setupRequestSpecification()
	{
		requestSpecification = RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.basePath("/booking");
	}
	
	@Test
	public void getAllBookings()
	{
		// Given
		RestAssured
		  .given()
		  .spec(requestSpecification)
		// When
		   .when()
		// Then
		   .then()
		   .statusLine("HTTP/1.1 200 OK");	
		
	}
	
	@Test
	public void getBookingDetailsWithInvalidFirstName()
	{
		// Given
		RestAssured
		  .given(requestSpecification)
			 .param("firstName", "Rahul")
		// When
		   .when()
		// Then
		   .then()
		   .statusLine("HTTP/1.1 200 OK");		
	}
}