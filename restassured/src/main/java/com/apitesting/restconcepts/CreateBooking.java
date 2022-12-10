package com.apitesting.restconcepts;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {

	public static void main(String[] args) {
		
		
		//Build Request
		
//		RequestSpecification requestSpecification=RestAssured.given();
//		requestSpecification=requestSpecification.log().all();
//		
//		requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
//		requestSpecification.basePath("booking");
//		requestSpecification.body("{\r\n"
//				+ "    \"firstname\" : \"Sagar\",\r\n"
//				+ "    \"lastname\" : \"Sapkota\",\r\n"
//				+ "    \"totalprice\" : 111,\r\n"
//				+ "    \"depositpaid\" : true,\r\n"
//				+ "    \"bookingdates\" : {\r\n"
//				+ "        \"checkin\" : \"2018-01-01\",\r\n"
//				+ "        \"checkout\" : \"2019-01-01\"\r\n"
//				+ "    },\r\n"
//				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
//				+ "}");
//		
//		
//		requestSpecification.contentType(ContentType.JSON);
//		
//		
//		//hit the request...
//		Response response=requestSpecification.post();
//		
//		//Validate the response....
//		ValidatableResponse validatableResponse=response.then();
//		validatableResponse.statusCode(200);
		
		
		
		
		RestAssured.given()   //Building the request
		.log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.body("{\r\n"
				+ "    \"firstname\" : \"Sagar\",\r\n"
				+ "    \"lastname\" : \"Automation Engineer\",\r\n"
				+ "    \"totalprice\" : 112,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.post()        //hitting the request
		.then()
		.log().all()
		.statusCode(200);
		
		
		
		
		
	

	}

}
