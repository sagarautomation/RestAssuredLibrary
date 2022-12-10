package com.apitesting.restconcepts;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class ReqrespJsonSchemaValidation {

	public static void main(String[] args) {
		
		
		RestAssured.given()
		.baseUri("https://reqres.in/")
		.basePath("api/users?page=3")
		.get()
		.then()
		.log()
		.all()
		.statusCode(200)
		.assertThat()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Reqresgetresponse.json"));
		

	}

}
