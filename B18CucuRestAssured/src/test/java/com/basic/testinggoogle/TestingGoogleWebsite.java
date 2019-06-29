package com.basic.testinggoogle;

import org.junit.Assert;



import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGoogleWebsite {
	
	
//	public static void main(String[] args) {
//	Response res=RestAssured.given().get("https://www.google.com/");
//		int startCode=res.statusCode();
//		System.out.println("Status Code"+startCode);
//	}


	public void googleTest() {
		
		io.restassured.response.Response res=RestAssured.given().get("https://www.google.com/");
		int startCode=res.statusCode();
		System.out.println("Status Code"+startCode);
		Assert.assertEquals(startCode,200);
	}
}
