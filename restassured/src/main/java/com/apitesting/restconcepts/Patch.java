package com.apitesting.restconcepts;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Patch {

	public static void main(String[] args) {
		
		
		RestAssured.
		given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/6")
		.log().all()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\"\r\n"
				+ "}")
		.header("Authorization","YWRtaW46cGFzc3dvcmQxMjM=]")
		.when()
		.patch()
		.then()
		.assertThat()
		.statusCode(200).log().all();
	
		

	}

}
