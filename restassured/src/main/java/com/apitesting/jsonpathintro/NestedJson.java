package com.apitesting.jsonpathintro;

import io.restassured.path.json.JsonPath;

public class NestedJson {

	public static void main(String[] args) {
		
		
		String jsonObject="{\"isbn\": \"123-456-222\",  \r\n"
				+ " \"author\": \r\n"
				+ "    {\r\n"
				+ "      \"lastname\": \"Doe\",\r\n"
				+ "      \"firstname\": \"Jane\"\r\n"
				+ "    },\r\n"
				+ "\"editor\": \r\n"
				+ "    {\r\n"
				+ "      \"lastname\": \"Smith\",\r\n"
				+ "      \"firstname\": \"Jane\"\r\n"
				+ "    },\r\n"
				+ "  \"title\": \"The Ultimate Database Study Guide\",  \r\n"
				+ "  \"category\": [\"Non-Fiction\", \"Technology\"]\r\n"
				+ " }";
		
		JsonPath jsonPath=new JsonPath(jsonObject);
		System.out.println(jsonPath.getString("author"));
		Object o1=jsonPath.get();
		System.out.println(o1);
		System.out.println(jsonPath.getString("editor.lastname"));



	}

}
