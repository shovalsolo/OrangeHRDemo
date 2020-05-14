package tests;

import baseUtilClass.*;	
import baseUtilClass.ScreenshotManager;
import baseUtilClass.extentReportsInit;
import pages.HeaderLogin;
import tests.VerifyLogin;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logout {
	WebDriver driver;
	
	@BeforeClass																			//This will run before the class
	public void setUp() {																	//Function that is calling the driver init
		try {
			Reporter.log("=======setUp Started=======",true);
			WebDriverInit instanceDriver = WebDriverInit.getInstance();						//Creating an object of the "instanceDriver" from class "DriverInit"
			driver = instanceDriver.openBrowser("chrome");									//Setting the browser selected and calling the function from the 
			Reporter.log("=======setUp Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======setUp Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "setUp-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
	
	@Test(priority = 1)
	public void login(){
		
		try {
			Reporter.log("=======Login Started=======",true);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);
			VerifyLogin Vlogin = new VerifyLogin();
			Vlogin.loginToOrangeHR();
			Reporter.log("=======Login Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======Login Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "Login-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
	
	@Test(priority = 2)
	public void checkAbout(){
		try {
			Reporter.log("=======checkAbout Started=======",true);
			HeaderLogin Hlogin = new HeaderLogin(driver);
			Hlogin.clickOnCloseAbout();
			Reporter.log("=======checkAbout Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======checkAbout Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "checkAbout-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
	
	
	@AfterClass																				//This will run after the class
	public void tearDown() {																//Function to close the browser
		try {
			Reporter.log("=======tearDown Started=======",true);
			driver.close();																	//Closing the browser
			driver.quit();																	//Closing the process 
			System.out.println("Test completed successfully");								//Printing message
			Reporter.log("=======tearDown Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======tearDown Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "tearDown-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
}
