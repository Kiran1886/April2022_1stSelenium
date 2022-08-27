package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup System Property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\selenium\\1st_Selenium\\driver\\chromedriver.exe");		
		// Object of Chrome Driver
		WebDriver driver = new ChromeDriver();
		//Go to the different Website
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		// Pause execution 1 sec = 1000ms
		Thread.sleep(5000);
		// Closing browser
		driver.close();
		
	}
	
	
	
}
