package com.apitesting.restconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateSimpleJsonArray {
	
	
	//  https://www.mockaroo.com/

	public static void main(String[] args) {


		/* JSON Array	[
		  {
		    "id": 1,
		    "first_name": "Zorah",
		    "last_name": "Vaudin",
		    "email": "zvaudin0@cmu.edu",
		    "gender": "Polygender",
		    "City": "Athmuqam"
		  },
		  {
		    "id": 2,
		    "first_name": "Saree",
		    "last_name": "Brood",
		    "email": "sbrood1@bloomberg.com",
		    "gender": "Female",
		    "City": "Mastung"
		  }
		]    

		 */

		Map<String,Object> empData1=new LinkedHashMap<>();

		empData1.put("id", 1);
		empData1.put("first_name", "Zorah");
		empData1.put("last_name", "Vaudin");
		empData1.put("email", "zvaudin0@cmu.edu");
		empData1.put("gender", "Polygender");
		empData1.put("City", "Athmuqam");


		Map<String,Object> empData2=new LinkedHashMap<>();

		empData2.put("id", 2);
		empData2.put("first_name", "Saree");
		empData2.put("last_name", "Brood");
		empData2.put("email", "sbrood2@bloomberg.com");
		empData2.put("gender", "Female");
		empData2.put("City", "Mastung");
		
		List<Object> allempData=new ArrayList<>();
		allempData.add(empData1);
		allempData.add(empData2);
		
		RestAssured.
		given()
		.log().all()
		.body(allempData)
		.get();
		
		
		

		
		







	}

}
