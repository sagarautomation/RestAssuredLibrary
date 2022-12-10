package com.apitesting.jsonpathintro;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonArrays {



	public static void main(String[] args) 

	{
		String jsonObject="{\r\n"
				+ "  \"firstName\": \"Amod\",\r\n"
				+ "  \"lastName\": \"Mahajan\",\r\n"
				+ "  \"address\": [\r\n"
				+ "    {\r\n"
				+ "      \"type\": \"permanent\",\r\n"
				+ "      \"city\": \"Bengaluru\",\r\n"
				+ "      \"state\": \"KA\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"type\": \"temp\",\r\n"
				+ "      \"city\": \"Bhopal\",\r\n"
				+ "      \"state\": \"MP\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";

		JsonPath js=new JsonPath(jsonObject);
		//System.out.println((Object)js.get());
		System.out.println(js.getString("address[0].city"));
		
		
		//String jsonObject2= "{"firstname":"sagar",}";
		
		
		//JsonPath js2=new JsonPath(jsonObject2);
		//System.out.println((Object)js2.get());
		
		List<String> allAddressTypes = js.getList("address.type");
		System.out.println(allAddressTypes);
		
		System.out.println(js.getList("address"));
		System.out.println((js.getList("firstName")));//class.java.lang.string cannot be cast to class.java.util.list

		
		

		
	}

}
