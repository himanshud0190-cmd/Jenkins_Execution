package Execution;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.util.Set;

	public class WindowHandleExample {
	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();

	        // Open main site
	        driver.get("https://www.google.com");
	        driver.manage().window().maximize();

	        // Click a link that opens new window (example)
	        // Let's assume we have a link with target="_blank"
	        // Replace locator as per your site
	        driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	        // Get main window ID
	        String mainWindow = driver.getWindowHandle();

	        // Get all window IDs
	        Set<String> allWindows = driver.getWindowHandles();

	        // Switch to child window
	        for (String win : allWindows) {
	            if (!win.equals(mainWindow)) {
	                driver.switchTo().window(win);
	                System.out.println("Switched to child window: " + driver.getTitle());

	                // perform action in child
	                Thread.sleep(2000);
	                driver.close(); // close child
	            }
	        }

	        // Switch back to main window
	        driver.switchTo().window(mainWindow);
	        System.out.println("Back to main window: " + driver.getTitle());

	        driver.quit();
	    }
	}



