package com.apitesting.restconcepts;

import io.restassured.RestAssured;

public class Deletebooking {

	public static void main(String[] args) {
		
	RestAssured.given()
	.log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/6")
		.header("Content-Type","application/json")
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	.when()
		.delete()
		.then()
		.assertThat()
		.statusCode(201).log().all();

	}

}
