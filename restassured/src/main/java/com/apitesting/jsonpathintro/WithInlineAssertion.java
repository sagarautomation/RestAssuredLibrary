package com.apitesting.jsonpathintro;

import org.hamcrest.Matchers;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class WithInlineAssertion {
	
	//if we run the request without internet connection then we will get unknown host exception

	public static void main(String[] args) {
		
		RestAssured.
		given()
		.baseUri("https://restful-booker.herokuapp.com/auth")
		.body("{\r\n"
				+ "    \"username\" : \"admin\",\r\n"
				+ "    \"password\" : \"password123\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.when()
		.post()
		.then()
		.log()
		.all()
		.body("token",Matchers.notNullValue())
		.body("token.length()", Matchers.equalTo(15))
		.body("token",Matchers.matchesPattern("[A-Z a-z 0-9]"));
		
		

	}

}
