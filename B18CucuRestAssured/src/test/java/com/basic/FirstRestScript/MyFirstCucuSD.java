package com.basic.FirstRestScript;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class MyFirstCucuSD {
	Response res;
	
	@Given("^user hit the get  request$")
	public void user_hit_the_get_request(){
		 res=RestAssured.given().get("https://www.google.com/");
		
	}
	
	
	@When("^user checks the status code$")
	public void user_checks_the_status_code() throws Throwable {
		
		int stCode= res.statusCode();
		System.out.println(stCode);
	   	}
	
	@When("^user checks the \"([^\"]*)\" status code$")
	public void user_checks_the_status_code(String code) {
		
		
		
		
		
		
	}

	

	@Given("^user hit the form application$")
	public void user_hit_the_form_application() {
		RestAssured.given().get("https://www.blablacar.in/");
		
		
	    
	}
	


	@When("^user enter \"([^\"]*)\" as firstname \"([^\"]*)\" as lastname \"([^\"]*)\" as mobile num$")
	public void user_enter_as_firstname_as_lastname_as_mobile_num(String fname, String lname, String mob)  {
		
	   
	}


}
