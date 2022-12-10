package com.apitesting.jsonpathintro;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateJsonObjectPayloadUsingJavaMap {
	
	//comment added

	public static void main(String[] args) 
	{
		
		Map<String,String>jsonpayload=new HashMap<String,String>();
		jsonpayload.put("id", "1");
		jsonpayload.put("firstname", "xyz");
		jsonpayload.put("lastname", "abc");
		jsonpayload.put("married", "true");
		jsonpayload.put("salary", "75000");
		RestAssured.given()
		.log().all()
		.contentType(ContentType.JSON);
		//.body(jsonpayload)
		//.get();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		Map<String,Object> map = new HashMap<>();
//		You can convert any Object.
//		String[] value1 = new String[] { "value11", "value12", "value13" };
//		String[] value2 = new String[] { "value21", "value22", "value23" };
//		map.put("key1", value1);
//		map.put("key2", value2);
//		map.put("key3","string1");
//		map.put("key4","string2");
//		System.out.println(map);
		


	}

}
