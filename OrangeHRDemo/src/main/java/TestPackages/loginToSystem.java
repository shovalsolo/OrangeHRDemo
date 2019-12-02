package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import FrameworkPackages.BrowserFactory;

public class loginToSystem {
	public WebDriver driver = null;
	static BrowserFactory browser = new BrowserFactory();

	@Test
	public void test() throws Exception {
		System.out.println("Started");
		browser.getDriver();
		System.out.println("After");

		//WebDriverManager.chromedriver().setup();							//Setting the WebDriverManager
		//driver = new ChromeDriver();
		try {
			driver.get("https://opensource-demo.orangehrmlive.com/");					//Navigate to url
			System.out.println("Open URL Passed");

		} catch (Exception e) {
			System.out.println("Open URL failed");
			System.out.println("Message is " + e.getMessage());
			System.out.println("Cause is " + e.getCause());
		}
		System.out.println(driver.getTitle());										//Will print the title of the page
		driver.findElement(By.name("txtUsername")).sendKeys("Solotech");			//Sending keys to field
		driver.findElement(By.name("Submit")).sendKeys(Keys.RETURN);				//Sending Enter key

		Thread.sleep(10000);

		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
