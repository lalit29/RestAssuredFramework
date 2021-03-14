package patchExamples;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
 
public class NonBDDPatchRequest {
 
	public static void main(String[] args) {
 
		// There is no need to add escape character manually. Just paste string within
		// double
		// quotes. It will automatically add escape sequence as required.
		String jsonString = "{\r\n" + 
				"    \"firstname\" : \"Amod\",\r\n" + 
				"    \"lastname\" : \"Mahajan\"}";
 
		// Create a request specification
		RequestSpecification request = RestAssured.given();
 
		// Setting content type to specify format in which request payload will be sent.
		// ContentType is an ENUM.
		request.contentType(ContentType.JSON);
		// Setting a cookie for authentication as per API documentation
		request.cookie("token", "82648b037bec746");
		// Adding URI
		request.baseUri("https://restful-booker.herokuapp.com/booking/1");
		// Adding body as string
		request.body(jsonString);
 
		// Calling PATCH method on URI. After hitting we get Response
		Response response = request.patch();
 
		// Printing Response as string
		System.out.println(response.asString());
 
		// Get Validatable response to perform validation
		ValidatableResponse validatableResponse = response.then();
 
		// Validate status code as 200
		validatableResponse.statusCode(200);
 
		// Validate value of firstName is updated
		validatableResponse.body("firstname", Matchers.equalTo("Amod"));
 
		// Validate value of lastName is updated
		validatableResponse.body("lastname", Matchers.equalTo("Mahajan"));
 
	}
}