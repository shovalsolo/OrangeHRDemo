package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import baseUtilClass.ScreenshotManager;

import baseUtilClass.ScreenshotManager;

public class HeaderLogin {
	
	public static WebDriver driver = null;
	
																			//Getting all the page objects to test
	By welcomeAdmin = By.xpath("//a[@id='welcome']");						//Locating WelcomeAdmin object menu
	By about = By.xpath("//a[text()='About']");								//Locating about object
	By closeAbout = By.xpath("//*[@id=\"displayAbout\"]/div/a");			//Locating about object
	By logout = By.xpath("//a[text()='Logout']");							//Locating logout object 
	By orangeHRMLogo = By.xpath("//img[@alt='OrangeHRM']");					//Locating orangeHRMLogo object 
	
	public HeaderLogin(WebDriver driver) {									//Constructor that is getting the WebDriver
		this.driver=driver;													//Initializing the WebDriver
	}
	
	public void clickOnwelcomeAdmin() {										//click On Welcome Admin menu
		try {
			Reporter.log("=======ClickOnwelcomeAdmin Started=======",true);
			Thread.sleep(5000);	
			driver.findElement(welcomeAdmin).click();
			Reporter.log("=======ClickOnwelcomeAdmin Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======ClickOnwelcomeAdmin Failed=======",true);
			//ScreenshotManager.cuptureScreenshot(driver , "ClickOnwelcomeAdmin-Failed");
			System.out.println("failed to click on" + welcomeAdmin);
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());	
		}
	}
	
	public void clickOnAbout() {											//click On About
		try {
			Reporter.log("=======ClickOnAbout Started=======",true);
			Thread.sleep(5000);	
			clickOnwelcomeAdmin();
			Thread.sleep(2000);
			driver.findElement(about).click();
			Reporter.log("=======ClickOnAbout Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======ClickOnAbout Failed=======",true);
			//ScreenshotManager.cuptureScreenshot(driver , "ClickOnAbout-Failed");
			System.out.println("failed to click on" + about);
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
		}
	}
	
	
	public void clickOnCloseAbout() {											//click On About
		try {
			Reporter.log("=======ClickOnCloseAbout Started=======",true);
			Thread.sleep(5000);	
			clickOnAbout();
			Thread.sleep(2000);
			driver.findElement(closeAbout).click();
			Thread.sleep(2000);
			Reporter.log("=======ClickOnCloseAbout Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======ClickOnCloseAbout Failed=======",true);
			//ScreenshotManager.cuptureScreenshot(driver , "ClickOnCloseAbout-Failed");
			System.out.println("failed to click on" + closeAbout);
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
		}
	}
	
	
	public void clickOnLogout() {											//click On Logout
		try {
			Reporter.log("=======ClickOnLogout Started=======",true);
			Thread.sleep(5000);	
			clickOnwelcomeAdmin();
			Thread.sleep(2000);
			driver.findElement(logout).click();
			Thread.sleep(2000);
			Reporter.log("=======ClickOnLogout Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======ClickOnLogout Failed=======",true);
			//ScreenshotManager.cuptureScreenshot(driver , "ClickOnLogout-Failed");
			System.out.println("failed to click on" + logout);
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
		}
	}
	
	
	public void clickOnOrangeHRMLogo() {									//click On Orange HRM Logo
		try {
			Reporter.log("=======clickOnOrangeHRMLogo Started=======",true);
			Thread.sleep(5000);	
			driver.findElement(orangeHRMLogo).click();
			Thread.sleep(2000);
			Reporter.log("=======clickOnOrangeHRMLogo Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======clickOnOrangeHRMLogo Failed=======",true);
			//ScreenshotManager.cuptureScreenshot(driver , "clickOnOrangeHRMLogo-Failed");
			System.out.println("failed to click on" + orangeHRMLogo);
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
		}
	}
}
