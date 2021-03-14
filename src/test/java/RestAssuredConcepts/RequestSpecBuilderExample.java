package RestAssuredConcepts;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
public class RequestSpecBuilderExample {
 
	public static void main(String[] args) {
 
		// Creating an object of RequestSpecBuilder
		RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		// Setting Base URI
		reqBuilder.setBaseUri("https://restful-booker.herokuapp.com");
		// Setting Base Path
		reqBuilder.setBasePath("/booking");
		// Getting RequestSpecification reference using builder() method
		RequestSpecification reqSpec = reqBuilder.build();
		
		// Usage in different styles
		// We can directly call http verbs on RequestSpecification
//		Response res1= reqSpec.get();
//		System.out.println(res1.asString());
//		System.out.println("======================");
		
		// We can also pass RequestSpecification reference variable in overloaded given() method
		Response res2 = RestAssured.given(reqSpec).get();
		System.out.println(res2.asString());
		System.out.println("======================");
				
		// We can also pass RequestSpecification using spec() method
		Response res3 = RestAssured.given().spec(reqSpec).get();
		System.out.println(res3.asString());
 
	}
}
