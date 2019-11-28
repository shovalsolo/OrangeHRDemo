package FrameworkPackages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	public static WebDriver driver = null;
	
	public BrowserFactory() {				//Contractor 
		
	}
	
	public static WebDriver getDriver() {
		if(driver==null) {
			ChromeOptions options = new ChromeOptions();						//Creating an object of chrome options
			options.addArguments("--disable-notifications");					//Setting an argument to disable notifications in the browser
			options.setPageLoadStrategy(PageLoadStrategy.NONE);					//Setting PageLoadStrategy to none preventing the page from loading while executing
			WebDriverManager.chromedriver().setup();							//Setting the WebDriverManager
			driver = new ChromeDriver(options);									//Setting the driver to ChromeDriver
			driver.manage().window().maximize();								//Setting the window to maximum
			driver.manage().deleteAllCookies(); 								//Deleting all the cookies
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds 
		}
		return driver;
	}
	public static WebDriver getDriver(String browserName) {
		if(driver==null) {
			if(browserName.equalsIgnoreCase("firefox")) {
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
			else {
				WebDriverManager.chromedriver().setup();							//Setting the WebDriverManager
				driver = new ChromeDriver();										//Setting the driver to ChromeDriver
				driver.manage().window().maximize();								//Setting the window to maximum
				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds
			}
		}
		return driver;
	}
	
}
