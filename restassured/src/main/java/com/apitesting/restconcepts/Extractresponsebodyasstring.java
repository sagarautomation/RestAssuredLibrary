package com.apitesting.restconcepts;

import io.restassured.RestAssured;

public class Extractresponsebodyasstring {

	public static void main(String[] args) {


		String response=RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"firstname\" : \"Jim\",\r\n"
						+ "    \"lastname\" : \"Brown\",\r\n"
						+ "    \"totalprice\" : 111,\r\n"
						+ "    \"depositpaid\" : true,\r\n"
						+ "    \"bookingdates\" : {\r\n"
						+ "        \"checkin\" : \"2018-01-01\",\r\n"
						+ "        \"checkout\" : \"2019-01-01\"\r\n"
						+ "    },\r\n"
						+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
						+ "}")
				.post()
				.then()
				.extract()
				.response()
				.asPrettyString();

		System.out.println(response);


	}

}
