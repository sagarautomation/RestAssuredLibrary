package com.apitesting.jsonpathintro;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathIntro {
	
	
	@Test
	public void jsonPathDemo()
	{
		String json="{\r\n"
				+ "  \"array\": [\r\n"
				+ "    1,\r\n"
				+ "    2,\r\n"
				+ "    3\r\n"
				+ "  ],\r\n"
				+ "  \"boolean\": true,\r\n"
				+ "  \"color\": \"gold\",\r\n"
				+ "  \"null\": null,\r\n"
				+ "  \"number\": 123,\r\n"
				+ "  \"object\": {\r\n"
				+ "    \"a\": \"b\",\r\n"
				+ "    \"c\": \"d\"\r\n"
				+ "  },\r\n"
				+ "  \"string\": \"Hello World\"\r\n"
				+ "}";
		
		JsonPath jsonPath=new JsonPath(json);
		Object result=jsonPath.get("array");
		System.out.println(result);
		//System.out.println((Object)jsonPath.get("$"));
		System.out.println(jsonPath.getBoolean("boolean"));
		System.out.println(jsonPath.getString("string"));

		
	}
	

}
