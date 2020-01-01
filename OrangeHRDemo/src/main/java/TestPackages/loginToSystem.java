package TestPackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import FrameworkPackages.BrowserFactory;


public class loginToSystem {
	public static WebDriver driver = null;
	static BrowserFactory browser = new BrowserFactory();
	
	@Test
	public void test(String browserName) throws Exception {
		
		try {
			if(browserName==null) {
				browser.setUpDriver("chrome");
				
			}
			else {
				browser.setUpDriver("browserName");
			}
			
		} catch (Exception e) {
			System.out.println("Set Up Driver failed");
			System.out.println("Message is " + e.getMessage());
			System.out.println("Cause is " + e.getCause());
		}
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");						//Navigate to url
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				//A wait that will wait 10 seconds the default is zero and is applicable for the entire session
		
		System.out.println(driver.getTitle());											//Print the page title
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");					//Sending keys to field
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");				//Sending Enter key
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).sendKeys(Keys.RETURN);	//Sending Enter key
		

		Thread.sleep(5000);
		driver.close();
		driver.quit();
		System.out.println("Test completed succesfully");
	}

}
