package com.basic.demoautomationform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoAutoFormSD {

	WebDriver driver;

	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalAnilSir\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@When("^launch the url$")
	public void launch_the_url() throws Throwable {
		driver.get("http://demo.automationtesting.in/Register.html");

	}

	@Then("^enter \"([^\"]*)\" as firstname \"([^\"]*)\" as lastname$")
	public void enter_as_firstname_as_lastname(String fname, String lname) throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);

	}

	@Then("^enter \"([^\"]*)\" as address \"([^\"]*)\" as email$")
	public void enter_as_address_as_email(String address, String email) throws Throwable {
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(email);

	}

	@Then("^enter \"([^\"]*)\" as valid phone number$")
	public void enter_as_valid_phone_number(String mob) throws Throwable {
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(mob);
	}

	@Then("^select \"([^\"]*)\" as gender$")
	public void select_as_gender(String fe) throws Throwable {
		// driver.findElement(By.xpath("//label/input[@value='FeMale']")).click();
		boolean result = true;
		driver.findElement(By.xpath("//label/input[@value='FeMale']")).isSelected();

		driver.findElement(By.xpath("//label/input[@value='FeMale']")).click();

	}

	@Then("^select \"([^\"]*)\" and \"([^\"]*)\" as hobbies$")
	public void select_and_as_hobbies(String cricket, String Movies) {
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
	}

	@Then("^select the language$")
	public void select_the_language() throws Throwable {
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//li/a[text()='English']")).click();

	}

	@Then("^select skills$")
	public void select_skills() throws Throwable {
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select sel = new Select(ele1);
		sel.selectByVisibleText("CSS");

	}

	@Then("^select country$")
	public void select_country() throws Throwable {
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='countries']"));
		Select sel = new Select(ele2);
		sel.selectByVisibleText("India");
	}

	@Then("^select year month and date from date of birth tab$")
	public void select_year_month_and_date_from_date_of_birth_tab() throws Throwable {
		WebElement ele3 = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sel = new Select(ele3);
		sel.selectByVisibleText("2000");

		WebElement ele4 = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select sel1 = new Select(ele4);
		sel1.selectByVisibleText("July");

		WebElement ele5 = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select sel2 = new Select(ele5);
		 sel2.selectByVisibleText("20");
	}

	@Then("^enter \"([^\"]*)\" as password$")
	public void enter_as_password(String pass) throws Throwable {
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(pass);

	}

	@Then("^enter confirm password$")
	public void enter_confirm_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("demo1234");

	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

	}

	@Then("^click on refresh$")
	public void click_on_refresh() throws Throwable {
		driver.findElement(By.xpath("//button[@value='Refresh']")).click();

	}

}
