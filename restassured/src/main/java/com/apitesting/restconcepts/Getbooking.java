package com.apitesting.restconcepts;

import io.restassured.RestAssured;

public class Getbooking {

	public static void main(String[] args) {
		
		
		RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/{id}")
		.pathParam("id", 1).log().all()
		.get()
		.then()
		.log().all()
		.statusCode(200);
		
		
		

	}

}
