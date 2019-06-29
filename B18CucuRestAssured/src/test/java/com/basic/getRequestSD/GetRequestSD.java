package com.basic.getRequestSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestSD {
	Response resp;
	
	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test() throws Throwable {
		System.out.println("starting of the get request");
	    
	    
	}
	
	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
resp=RestAssured.given().relaxedHTTPSValidation().when().get("http://ergast.com/api/f1/2017/circuits.json");
	    
	    //print response in string
		
		String respString=resp.asString();
		System.out.println(respString);
	
	   	}
	
	@Then("^user checks the status code$")
	public void user_checks_the_status_code() throws Throwable {
	int statuscode=resp.getStatusCode();
	Assert.assertTrue(200==statuscode);
	
	
	}

	@When("^user check the limit$")
	public void user_check_the_limit() throws Throwable {
		String limit=resp.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30", limit);
		
		}
	@Then("^user checks at path \"([^\"]*)\" with the \"([^\"]*)\" value$")
	public void user_checks_at_path_with_the_value(String CircuitId, String value) throws Throwable {
		String id=resp.getBody().jsonPath().getString(CircuitId);
		System.out.println("Circuit id :"+id);
	//	Assert.assertEquals("aaa",id);                id=null
	String value1=	resp.getBody().jsonPath().getString(value);
	Assert.assertEquals(null,value1);
	}


}
