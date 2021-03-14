package DifferentWaysOfPassingPayloadToRequest;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
 
public class PassFileAsPayload {
	
	@Test(enabled = true)
	public void passFileAsPayload()
	{
		// Creating a File instance 
		File jsonDataInFile = new File("src/test/resources/AuthPayload.json");
		
		//GIVEN
		RestAssured
		    .given()
				.baseUri("https://restful-booker.herokuapp.com/auth")
				.contentType(ContentType.JSON)
				.body(jsonDataInFile)
		// WHEN
			.when()
				.post()
				// THEN
			.then()
				.assertThat()
				.statusCode(200)
				.body("token", Matchers.notNullValue())
				.body("token.length()", Matchers.is(15))
				.body("token", Matchers.matchesRegex("^[a-z0-9]+$"));
	}
	
	@Test(enabled = false)
	public void passXMLFileAsPayload()
	{
		// Creating a File instance 
		File jsonDataInFile = new File("src/test/resources/AuthPayload.xml");
		
		//GIVEN
		RestAssured
		    .given()
				.baseUri("https://restful-booker.herokuapp.com/auth")
				// Since I am passing payload as xml. Anyway it is optional as Rest Assured automatically identifies.
				.contentType(ContentType.XML)
				.body(jsonDataInFile)
		// WHEN
			.when()
				.post()
				// THEN
			.then()
				.assertThat()
				.statusCode(200);
	}
 
}
