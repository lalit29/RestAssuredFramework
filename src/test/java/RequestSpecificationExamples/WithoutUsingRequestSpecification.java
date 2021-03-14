package RequestSpecificationExamples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
 
public class WithoutUsingRequestSpecification {
	
	@Test
	public void getAllBookings()
	{
		// Given
		RestAssured
		  .given()
		  // Common baseURI and basePath
			 .baseUri("https://restful-booker.herokuapp.com")
			 .basePath("/booking")
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
		  .given()
		  // Common baseURI and basePath
			 .baseUri("https://restful-booker.herokuapp.com")
			 .basePath("/booking")
			 .param("firstName", "Rahul")
		// When
		   .when()
		// Then
		   .then()
		   .statusLine("HTTP/1.1 200 OK");		
	}
 
}
