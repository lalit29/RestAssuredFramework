package patchExamples;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
 
public class BDDStylePatchRequest {
 
	public static void main(String[] args) {
		
 
		// There is no need to add escape character manually. Just paste string within
		// double
		// quotes. It will automatically add escape sequence as required.
		String jsonString = "{\r\n" + 
				"    \"firstname\" : \"Amod\",\r\n" + 
				"    \"lastname\" : \"Mahajan\"}";
 
		//GIVEN
		RestAssured
			.given()
					.baseUri("https://restful-booker.herokuapp.com/booking/1")
					.cookie("token", "82648b037bec746")
					.contentType(ContentType.JSON)
					.body(jsonString)
			// WHEN
			.when()
					.patch()
			// THEN
			.then()
					.assertThat()
					.statusCode(200)
					.body("firstname", Matchers.equalTo("Amod"))
					.body("lastname", Matchers.equalTo("Mahajan"));
 
	}
}