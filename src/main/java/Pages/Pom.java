package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	 WebDriver driver;
	@FindBy (id = "pushDenied") private WebElement clickingPopup;
	@FindBy ( xpath = "(//img[@title='Snapdeal'])[1]") private WebElement verifyingLogo;
	@FindBy(xpath = "//iframe[@id='loginIframe']") private WebElement Frame;
	@FindBy(xpath = "//i[@class='sd-icon sd-icon-cart-icon-white-2']") private WebElement verifyingCarIcon;
	
	public Pom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean VerifyLogo() throws InterruptedException
	{
		//driver.switchTo().frame("iframeLogin");
		//Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Snapdeal']")));
		clickingPopup.click();
		boolean Logo = verifyingLogo.isDisplayed();
		return Logo;
	}
	
	public boolean VerifyCartIcon()
	{
		boolean Icon = verifyingCarIcon.isDisplayed();
		return Icon;
	}
	
	
	
	
}
