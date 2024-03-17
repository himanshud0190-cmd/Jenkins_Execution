package Execution;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.DriverFactory;
import Pages.Pom;
import Pages.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition 
{
	WebDriver driver;
	DriverFactory DF;
	Pom pom = new Pom(DriverFactory.GetDriver());

	@Given("User should be at Home page")
	public void UsershouldbeatHomepage() throws EncryptedDocumentException, IOException
	{
		driver = DriverFactory.GetDriver();
		driver.get(Utility.ExcelSheet(0, 0));
	}
	@Then("User should be able to see the Logo of the application")
	public void UsershouldbeabletoseetheLogoofheapplication() throws InterruptedException
	{
		boolean Logo = pom.VerifyLogo();
		Assert.assertTrue(Logo);
	}

}
