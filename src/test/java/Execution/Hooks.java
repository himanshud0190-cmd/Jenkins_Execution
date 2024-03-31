package Execution;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.DriverFactory;
import Pages.Utility;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks 
{
	static WebDriver driver;
	static DriverFactory DF;
	
	@BeforeAll //(User @BeforeAll hook for to open the browser only for one time)
	public static void OpenBrowser() throws IOException
	{
		 DF = new DriverFactory();
		 
		 String PropertyBrowser = Utility.PropertyFile("Browser");
		 String MavenBrowser = System.getProperty("CliBrowser");
		 
		 if(MavenBrowser != null)
		 {
			 PropertyBrowser = MavenBrowser;
		 }
		 System.out.println("Browser received from Maven is = "+MavenBrowser);
		 
		 driver = DF.InitializeBrowser(PropertyBrowser);
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	
	
	
	@After
	public void CaptureScreenshot(Scenario scenario)
	{
//		if(scenario.isFailed())
//		{
			String Name = scenario.getName();
			Name.replaceAll(" ", "_");
			byte[] Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(Screenshot, "image/png", Name);
//		}
		
	}
	
	@AfterAll //Use @AfterAll for to close the browser only for one time after all execution of scenario is completed
	public static void CloseBrowser() throws IOException
	{
		driver.quit();
		Desktop.getDesktop().browse(new File("test-output\\SparkReport\\Index.html").toURI());
		System.out.println("Use of Line number 61 is for to open Extent Report automatically after running the project");
	}
	
	
	
}
