package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\FeatureFiles\\Snapdeal.feature"},
		
		glue = {"Execution"},
		
		publish = true,
		
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"html:target/cucumber-reports/reports.html",
						"json:target/cucumber-report.json"}
		
)

public class Runner extends AbstractTestNGCucumberTests
{
	

}
