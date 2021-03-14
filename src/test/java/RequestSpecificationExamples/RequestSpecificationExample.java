package RequestSpecificationExamples;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
public class RequestSpecificationExample {
 
	public static void main(String[] args) {
 
		// Creating request specification using given()
		RequestSpecification request1 = RestAssured.given();
		// Setting Base URI
		request1.baseUri("https://restful-booker.herokuapp.com");
		// Setting Base Path
		request1.basePath("/booking");
 
		// Creating request specification using with()
		RequestSpecification request2 = RestAssured.with();
		// Setting Base URI
		request2.baseUri("https://restful-booker.herokuapp.com");
		// Setting Base Path
		request2.basePath("/ping");
 
		// You can also use builder pattern as below
		RequestSpecification request3 = RestAssured.with();
		request3.baseUri("https://restful-booker.herokuapp.com").basePath("/ping");
 
	}
 
}