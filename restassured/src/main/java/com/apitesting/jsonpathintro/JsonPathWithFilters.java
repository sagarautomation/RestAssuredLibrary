package com.apitesting.jsonpathintro;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathWithFilters {

	public static void main(String[] args) {
		
		String filePath=System.getProperty("user.dir")+"\\People.json";
		File jsonFile=new File(filePath);
		JsonPath path=new JsonPath(jsonFile);
		System.out.println(path.getString("[8]"));
		System.out.println(path.getString("[0].first_name"));
		
		//get all the first nasmes...
		List<String>firstNames=path.getList("first_name");
		System.out.println(firstNames);
		
		//get all females firstname....
		
		List<String>allfemalesFirstname=path.getList("findAll{it.gender== 'Female'}.first_name");
		System.out.println(allfemalesFirstname);

	}

}
