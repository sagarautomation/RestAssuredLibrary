package com.apitesting.restconcepts;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateJsonObjectPayloadUsingMap {
	
	//In most of the cases we need to run the payload dynamically we cannot run the API 
	//with the same data always.so instead of hardcoding we should create the dynamic one.
	//We can create a JSON object using Java map
	
	
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
