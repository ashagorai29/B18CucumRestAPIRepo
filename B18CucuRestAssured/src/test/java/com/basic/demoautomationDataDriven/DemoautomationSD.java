package com.basic.demoautomationDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoautomationSD {
	WebDriver driver;
	
	@Given("^launch the application$")
	public void launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalAnilSir\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
	    
	    
	}

	@Given("^user enter the name as \"([^\"]*)\"$")
	public void user_enter_the_name_as(String firstname) throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
	   
	}

	@When("^user enter the surname as \"([^\"]*)\"$")
	public void user_enter_the_surname_as(String lastname) throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
		


	}




}
