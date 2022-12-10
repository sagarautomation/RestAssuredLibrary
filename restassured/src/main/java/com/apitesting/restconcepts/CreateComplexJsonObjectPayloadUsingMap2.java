package com.apitesting.restconcepts;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateComplexJsonObjectPayloadUsingMap2 {
	
	
	
	
	@Test
	public void passBodyAsMap()
	{
		Map<String,Object>jsonObjectbody=new HashMap<>();
		jsonObjectbody.put("firstname", "Jim");
		jsonObjectbody.put("lastname", "Brown");
		jsonObjectbody.put("totalprice", 111);
		jsonObjectbody.put("depositpaid", true);
		
		Map<String,Object>bookingDatemap=new HashMap<>();
		bookingDatemap.put("checkin", "2018-01-01");
		bookingDatemap.put("checkout", "2019-01-01");
		
		jsonObjectbody.put("bookingdates", bookingDatemap);
		jsonObjectbody.put("additionalneeds", "Breakfast");
		
		
		
		//GIVEN
				RestAssured
				   .given()
					  .baseUri("https://restful-booker.herokuapp.com/booking")
					  .contentType(ContentType.JSON)
					  .body(jsonObjectbody)
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
