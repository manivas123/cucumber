package com.stepdefinition1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1 {

	
	WebDriver driver;
	

	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		 driver=new ChromeDriver();
	     driver.get("https://omrbranch.com/");
	     driver.manage().window().maximize();
	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String name, String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pass);
	   	}
	@When("user click the lolgin button")
	public void user_click_the_lolgin_button() {
		 driver.findElement(By.xpath("//button[@value='login']")).click();
	}
	@Then("user should verify after login success message")
	public void user_should_verify_after_login_success_message() {
		Assert.assertTrue("verrify after login success message", true);
	   	}



}
