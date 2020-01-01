package FrameworkPackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserSetUp {
	
	public static WebDriver driver = null;
	
	@Parameters("browserName")
	public void setupDriver(String browserName) {
		System.out.println("Browser name is :"+browserName);
		System.out.println("Thread id : " +Thread.currentThread().getId());
		
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();						//Creating an object of chrome options
				options.addArguments("--disable-notifications");					//Setting an argument to disable notifications in the browser
				options.setPageLoadStrategy(PageLoadStrategy.NONE);					//Setting PageLoadStrategy to none preventing the page from loading while executing
				WebDriverManager.chromedriver().setup();							//Setting the WebDriverManager
				driver = new ChromeDriver(options);									//Setting the driver to ChromeDriver
				driver.manage().window().maximize();								//Setting the window to maximum
				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds
				System.out.println("Set Up chrome Driver passed");
			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver.manage().window().maximize();								//Setting the window to maximum
				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds 
			}
			else if (browserName.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();								//Setting the driver to IE
				driver.manage().window().maximize();								//Setting the window to maximum
				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds 
			}
			
		} catch (Exception e) {
			System.out.println("Set Up Driver failed");
			System.out.println("Message is " + e.getMessage());
			System.out.println("Cause is " + e.getCause());
		}
		
	}

}
