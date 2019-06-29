package com.basic.checkstatuscode;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class CheckStatusCodeSD {

	Response res;
	
	@Given("^user hit the get  request$")
	public void user_hit_the_get_request() throws Throwable {
	 res=	RestAssured.given().get("https://www.google.com/");
		int code=res.statusCode();
		System.out.println("Status code ="+code);
	Assert.assertEquals(200, code);
	}
	

	@When("^user checks the status code$")
	public void user_checks_the_status_code() throws Throwable {
		 res=	RestAssured.given().get("https://www.google.com/");
			int code=res.statusCode();
		
		
	
	
	
	}



}
