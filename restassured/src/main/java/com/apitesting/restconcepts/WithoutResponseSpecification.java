package com.apitesting.restconcepts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class WithoutResponseSpecification {


	ResponseSpecification rspec;

	@BeforeClass
	public void setUp()
	{
		rspec= RestAssured.expect();
		rspec.statusCode(200)
		.contentType(ContentType.JSON);
		
	}

	@Test
	public void createBooking()
	{

		RestAssured.given()   
		.log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.body("{\r\n"
				+ "    \"firstname\" : \"Expleo\",\r\n"
				+ "    \"lastname\" : \"Technical Engineer\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
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
		.spec(rspec);

	}

}
