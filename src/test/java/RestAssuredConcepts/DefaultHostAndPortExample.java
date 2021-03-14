package RestAssuredConcepts;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
public class DefaultHostAndPortExample {
	
	
	public static void main(String[] args) {
		
		// Hitting a GET request without setting any base URI and Path
		RestAssured
		   .given()
		   // Logging all details
		   .log()
		   .all()
		.when()
		   .get();
		
		
		
	}
 
}