package com.apitesting.restconcepts;

import io.restassured.RestAssured;

public class PathParameterExample2 {

	public static void main(String[] args) {
		
		
		
		
		//https://restful-booker.herokuapp.com/booking/id
		RestAssured.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("{basePath}/{bookingId}")
		.when()
		.get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}","booking",1)
		.then()
		.log()
		.all()
		.statusCode(200);
		
		
		
		

	}

}
