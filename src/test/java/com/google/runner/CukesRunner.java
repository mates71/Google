package com.google.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/features",
	
		glue="stepdefination",
		tags="@Regression"
		)


public class CukesRunner {

}

