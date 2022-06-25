package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "C:\\Users\\titu8\\eclipse-workspace\\BATCHNEW24\\Feature",
		glue={"com.steps"},
		tags= {"@HRM24"},
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
		dryRun=false,
		monochrome=true
		
		
		
		
		)


public class RunnerHRM {

	
}
