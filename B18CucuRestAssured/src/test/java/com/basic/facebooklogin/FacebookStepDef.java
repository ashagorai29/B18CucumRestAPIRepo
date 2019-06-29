package com.basic.facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStepDef {
	WebDriver driver;
	
		
	@Given("^open the  browser$")
	public void open_the_browser()  {
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalAnilSir\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	   
	}

	@When("^Open url$")
	public void open_url(){
		driver.get("https://www.facebook.com/");
		
	    
	   
	}

	@Then("^enter valid username$")
	public void enter_valid_username()  {
		driver.findElement(By.id("email")).sendKeys("ashagorai29@gmail.com");
	   
	}

	@Then("^enter valid password$")
	public void enter_valid_password()  {
		driver.findElement(By.id("pass")).sendKeys("password");
	   	}

	@Then("^click on loginbutton$")
	public void click_on_loginbutton()  {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	    
	}


	
	

}
