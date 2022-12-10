package com.apitesting.restconcepts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DefaultValues2 {
	
	@Test
	public void createBooking()
	{
		
         System.out.println("Test1");
		RestAssured.given().
		basePath("auth").
		body("{\r\n"
				+ "    \"username\" : \"admin\",\r\n"
				+ "    \"password\" : \"password123\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.post()        //hitting the request
		.then()
		.log().all()
		.statusCode(200);   //validating the response
		
		
	}

}
