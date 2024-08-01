package com.runner1;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.repoe.Reportingg;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty","json:target/reports/index.json"},glue ="com.stepdefinition1",features = "src\\test\\resources\\Feature\\lasss.feature")

public class RunnerTest1 {
	
@AfterClass
public static void afterClass() {
	Reportingg.generateJvm("target/reports/index.json");

}
	
}
