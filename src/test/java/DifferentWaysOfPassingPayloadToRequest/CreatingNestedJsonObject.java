package DifferentWaysOfPassingPayloadToRequest;

import java.util.HashMap;
import java.util.Map;
 
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
 
public class CreatingNestedJsonObject {
	
	@Test
	public void CreatingNestedJsonObjectTest()
	{
		Map<String,Object> jsonBodyUsingMap = new HashMap<String,Object>();
		jsonBodyUsingMap.put("firstname", "Jim");
		jsonBodyUsingMap.put("lastname", "Brown");
		jsonBodyUsingMap.put("totalprice", 111);
		jsonBodyUsingMap.put("depositpaid", true);
		
		Map<String,String> bookingDatesMap = new HashMap<String,String>();
		bookingDatesMap.put("checkin", "2021-07-01");
		bookingDatesMap.put("checkout", "2021-07-01");
		
		jsonBodyUsingMap.put("bookingdates", bookingDatesMap);
		jsonBodyUsingMap.put("additionalneeds", "Breakfast");
		
		
		//GIVEN
		RestAssured
		   .given()
			  .baseUri("https://restful-booker.herokuapp.com/booking")
			  .contentType(ContentType.JSON)
			  .body(jsonBodyUsingMap)
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