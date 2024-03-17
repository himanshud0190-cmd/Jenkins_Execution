package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory 
{
	 static WebDriver driver;
	
	public WebDriver InitializeBrowser(String Browsername)
	{
		if(Browsername.equalsIgnoreCase("Chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("Firefox"))
		{
			 driver = new  FirefoxDriver();
		}
		else if(Browsername.equalsIgnoreCase("Edge"))
		{
			 driver = new EdgeDriver();
		}
		return driver;
	}
	
	public static WebDriver GetDriver()
	{
		return driver;
	}
	
	

}
