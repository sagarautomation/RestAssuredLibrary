package com.apitesting.restconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class DefaultValues1 {
	
	//try changing annotation to @Beforeclass then the exception will be thrown..
	
	@BeforeClass
	
	public void setUp()
	{
		 RestAssured.baseURI="https://restful-booker.herokuapp.com/";
		 RestAssured.basePath="booking";
		// RestAssured.requestSpecification=null;
		 System.out.println("Setup");
		
	}
	
	
	@Test
	public void createbooking1()
	{
		
		System.out.println("Test2");
		RestAssured.given().body("{\r\n"
				+ "    \"firstname\" : \"Sagar5\",\r\n"
				+ "    \"lastname\" : \"AI Engineer\",\r\n"
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
		.log().all()
		.statusCode(200);   //validating the response
		
	}
	
	@Test
	public void createbooking2()
	{
		System.out.println("Test3");

		
		RestAssured.given().body("{\r\n"
				+ "    \"firstname\" : \"Sagar6\",\r\n"
				+ "    \"lastname\" : \"VLSI Engineer\",\r\n"
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
		.log().all()
		.statusCode(200);   //validating the response
		
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("inside after test");
	}

}
