package deleteExamples;

import io.restassured.RestAssured;

public class BDDStyleDeleteRequest {
 
	public static void main(String[] args) {
		
 
		// Delete Booking
 
		//GIVEN
		RestAssured
			.given()
					.baseUri("https://restful-booker.herokuapp.com/booking/3")
					.cookie("token", "338c357d133c1e9")
			// WHEN
			.when()
					.delete()
			// THEN
			.then()
					.assertThat()
					.statusCode(201);
		
		// Verifying booking is deleted
		// Given
		RestAssured
		    .given()
				    .baseUri("https://restful-booker.herokuapp.com/booking/1")
		// When
			.when()
					.get()
		// Then
			.then()
					.statusCode(404);
 
	}
}
