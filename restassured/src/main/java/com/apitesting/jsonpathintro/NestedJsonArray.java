package com.apitesting.jsonpathintro;

import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;

public class NestedJsonArray {
	
	
	public static void main(String[]args)
	{
		String jsonArrayString = "{\r\n" + 
				"  \"firstName\": \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\",\r\n" + 
				"  \"address\": [\r\n" + 
				"    [\r\n" + 
				"      {\r\n" + 
				"        \"type\": \"permanent\",\r\n" + 
				"        \"city\": \"Bengaluru\",\r\n" + 
				"        \"state\": \"KA\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"type\": \"temp\",\r\n" + 
				"        \"city\": \"Bhopal\",\r\n" + 
				"        \"state\": \"MP\"\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    [\r\n" + 
				"      {\r\n" + 
				"        \"type\": \"communication\",\r\n" + 
				"        \"city\": \"Delhi\",\r\n" + 
				"        \"state\": \"DL\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"type\": \"old\",\r\n" + 
				"        \"city\": \"Kanpur\",\r\n" + 
				"        \"state\": \"UP\"\r\n" + 
				"      }\r\n" + 
				"    ]\r\n" + 
				"  ]\r\n" + 
				"}";
		
		JsonPath js=new JsonPath(jsonArrayString);
		//System.out.println(js.getList("address"));
		
		//  [[{},{}],[{},{}]]
		
		for(Object l:js.getList("address"))
		{
			 //System.out.println(l);
			
		}
		
		
		System.out.println(js.getString("address[1]"));
		System.out.println(js.getString("address[1].type"));
//		System.out.println(js.getString("address[1].type"));
//		System.out.println(js.getString("address[0][0]"));
//		System.out.println(js.getString("address[0][0].type"));
//		System.out.println(js.getString("address[0][1].type"));
		
		//get the city from first array..
		 
		//System.out.println(js.getList("address[0].city"));
		//System.out.println(js.getList("address[0]"));
		
		
		List<Map<Object,String>>data=js.getList("address[0]");
		for(Map<Object,String>eachdata:data)
		{
			//System.out.println("eachdata is"+eachdata.get("type")+eachdata.get("city")); //customized iteration.
			
		}


		

		
		
		
		
	}
	

}
