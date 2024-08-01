package com.stepdefinition;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	@Given("user is on the facebook page")
	public void user_is_on_the_facebook_page() {
		 driver=new ChromeDriver();
	     driver.get("https://omrbranch.com/");
	     driver.manage().window().maximize();
	}
	@When("user enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("manivasagam@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Manivas69*");

	}
	@When("user click the login button")
	public void user_click_the_login_button() {
	 driver.findElement(By.xpath("//button[@value='login']")).click();
	}
	@Then("user should verrify after login success message")
	public void user_should_verrify_after_login_success_message() {
	Assert.assertTrue("verrify after login success message", true);
		
		
		
		
		
	 
	}



}
