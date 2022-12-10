package com.apitesting.restconcepts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class CreateMultipleBookings {


	RequestSpecification reqSpecification;

	@BeforeClass
	public void spec()
	{

		reqSpecification=RestAssured.given();
		reqSpecification.log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.contentType(ContentType.JSON);

	}

	@Test
	public void Createbooking()
	{
		RestAssured.given()
		.spec(reqSpecification)
		.basePath("booking")
		.body("{\r\n"
				+ "    \"firstname\" : \"Sagar\",\r\n"
				+ "    \"lastname\" : \"Automation Engineer\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.post()        //hitting the request
		.then()
		.log().all()
		.statusCode(200);   //validating the response


	}

	@Test
	public void Updatebooking()
	{

		RestAssured.given()
		.spec(reqSpecification)
		.basePath("booking/1")
		.header("Authorization","YWRtaW46cGFzc3dvcmQxMjM=]")
		.body("{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")

		.when()
		.put()
		.then()
		.log().all()
		.assertThat()
		.statusCode(200);

	}

}
