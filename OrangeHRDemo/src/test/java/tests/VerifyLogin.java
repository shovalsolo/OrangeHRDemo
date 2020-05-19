/**
 *  @author Solomon
 * 	Test case that is automating the login process to OrangeHR
 */
package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HeaderLogin;
import pages.LoginPage;
import baseUtilClass.ExcelUtils;
import baseUtilClass.WebDriverInit;
import baseUtilClass.ScreenshotManager;


public class VerifyLogin {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir"); 									//Setting the path to the file
	
	@BeforeClass																			//This will run before the class
	public void setUp() {																	//Function that is calling the driver init
		try {
			Reporter.log("=======setUp Started VerifyLogin=======",true);
			WebDriverInit instanceDriver = WebDriverInit.getInstance();						//Creating an object of the "instanceDriver" from class "DriverInit"
			driver = instanceDriver.openBrowser("chrome");									//Setting the browser selected and calling the function from the 
			Reporter.log("=======setUp Ended VerifyLogin=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======setUp Failed VerifyLogin=======",true);
			//ScreenshotManager.cuptureScreenshot(driver , "setUp-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
	
	@Test(priority = 1)
	public void loginToOrangeHR()  {														//Login method
		try {
			Reporter.log("=======Login Started VerifyLogin=======",true);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);																//Wait to see the result
			ExcelUtils excel = new ExcelUtils(projectPath+"/excel/login.xlsx", "sheet1");
			LoginPage login = new LoginPage(driver);										//Creating an object of LoginPage
			Thread.sleep(2000);	
			login.loginToOrangeHRM(excel.getCellDataString(1, 0), excel.getCellDataString(1, 1));	//Calling loginToOrangeHRM with login data
			Thread.sleep(5000);	
			Reporter.log("=======Login Ended VerifyLogin=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======login Failed VerifyLogin=======",true);
			//ScreenshotManager.cuptureScreenshot(driver , "loginToOrangeHR-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
	
	@Test(priority = 2)
	public void checkAbout(){
		try {
			Reporter.log("=======CheckAbout Started Logout=======",true);
			HeaderLogin Hlogin = new HeaderLogin(driver);
			Hlogin.clickOnCloseAbout();
			Reporter.log("=======CheckAbout Ended Logout=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======CheckAbout Failed Logout=======",true);
			//ScreenshotManager.cuptureScreenshot(driver , "checkAbout-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
	
	@AfterClass																				//This will run after the class
	public void tearDown() {																//Function to close the browser
		try {
			Reporter.log("=======tearDown Started VerifyLogin=======",true);
			driver.close();																	//Closing the browser
			driver.quit();																	//Closing the process 
			System.out.println("Test completed successfully");								//Printing message
			Reporter.log("=======tearDown Ended VerifyLogin=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======tearDown Failed VerifyLogin=======",true);
			//ScreenshotManager.cuptureScreenshot(driver , "tearDown-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}

}
