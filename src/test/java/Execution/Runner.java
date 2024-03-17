package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\FeatureFiles\\HYR.feature"},
		
		glue = {"Execution"},
		
		publish = true,
		
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
)

public class Runner extends AbstractTestNGCucumberTests
{
	

}
