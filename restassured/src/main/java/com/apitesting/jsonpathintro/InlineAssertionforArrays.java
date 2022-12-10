package com.apitesting.jsonpathintro;

import org.hamcrest.Matchers;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class InlineAssertionforArrays {
	
	//if we run the request without internet connection then we will get unknown host exception

	public static void main(String[] args) {
		
		RestAssured.
		given()
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.when()
		.get()
		.then()
		.log()
		.all()
		.body("bookingid", Matchers.hasItems(11893,15016));
		

	}

}
