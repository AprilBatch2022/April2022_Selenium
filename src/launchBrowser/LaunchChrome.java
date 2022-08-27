package launchBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Setup System Property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adria\\Selenium\\1st_Selenium\\driver\\chromedriver.exe"); 
		// Object of Chrome Driver
		WebDriver driver = new ChromeDriver(); 
		// Goes To A Website
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize(); 
		// Pauses Execution
		Thread.sleep(3000); 
		// Closes Browser
		driver.close(); 
		
	} 

}
