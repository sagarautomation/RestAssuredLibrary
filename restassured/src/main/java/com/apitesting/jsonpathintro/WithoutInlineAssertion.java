package com.apitesting.jsonpathintro;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class WithoutInlineAssertion {

	public static void main(String[] args) {
		
		String jsonresponse=RestAssured.
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
		.extract().
		asString();
		
		JsonPath jpath=new JsonPath(jsonresponse);
		//String token=jpath.getString("token");
		Assert.assertNotNull(jpath.get("token"));//always put the key in double quotes in get method

		
		

	}

}
