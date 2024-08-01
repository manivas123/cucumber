package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.stepdefinition",features =  "src\\test\\resources\\Feature\\class.feature")
		
public class TestRunnerClass {

	
	
	
}
