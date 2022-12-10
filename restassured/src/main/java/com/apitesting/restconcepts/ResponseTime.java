package com.apitesting.restconcepts;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ResponseTime {
	
	
      RequestSpecification rs;
      Response resp;

	@BeforeClass
	public void setUp()
	{
		rs=RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
				.contentType(ContentType.JSON);
		

	}

	@Test

	public void calculateResponsetime()
	{
		resp=rs.body("{\r\n"
				+ "    \"firstname\" : \"Tom\",\r\n"
				+ "    \"lastname\" : \"AI Engineer\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.post(); //hitting the request
		long responseTime1=resp.getTime();//by default response time is in milli seconds
		System.out.println(responseTime1);
		long responseTimeinseconds=resp.getTimeIn(TimeUnit.SECONDS);//response time we can get in other format also
		System.out.println("Response time in seconds"+responseTimeinseconds);
		
		long responseTime2=resp.time();
		System.out.println("Response time using time() is"+responseTime2);
		
		long responseTime2inseconds=resp.timeIn(TimeUnit.SECONDS);
		System.out.println("Response time using timeIn() is"+responseTime2inseconds);
		
		//Interface ValidatableResponseOptions :-
		ValidatableResponse validatableResponse=resp.then();
		//Asserting response time is greater than 2000 ms
		
		//validatableResponse.time(Matchers.greaterThan(2000L));
		
		//Asserting response time is greater than 2000ms
		
		//validatableResponse.time(Matchers.lessThan(2000L));	
		
		validatableResponse.time(Matchers.both(Matchers.greaterThanOrEqualTo(2000L)).and(Matchers.lessThanOrEqualTo(3000L)));
		
		validatableResponse.time(Matchers.lessThan(2L),TimeUnit.SECONDS);

		
		
	}

	@AfterClass
	public void tearDown()
	{
		System.out.println("Request is done");

	}

}
