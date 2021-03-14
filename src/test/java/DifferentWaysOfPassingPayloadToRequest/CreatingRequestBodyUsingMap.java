package DifferentWaysOfPassingPayloadToRequest;

import java.util.HashMap;
import java.util.Map;
 
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
 
public class CreatingRequestBodyUsingMap {
	
	@Test
	public void passBodyAsMap()
	{
		Map<String,String> authPayload = new HashMap<String,String>();
		authPayload.put("username", "admin");
		authPayload.put("password", "password123");
		
		
		//GIVEN
		RestAssured
		   .given()
			  .baseUri("https://restful-booker.herokuapp.com/auth")
			  .contentType(ContentType.JSON)
			  .body(authPayload)
			  .log()
			  .all()
		// WHEN
		   .when()
			   .post()
		// THEN
		   .then()
			   .assertThat()
			   .statusCode(200)
			   .log()
			   .all();
		
	}
 
}
