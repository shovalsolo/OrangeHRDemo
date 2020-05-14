package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class HeaderLogin {
	
	WebDriver driver;
	
	//Getting all the page objects to test
	By welcomeAdmin = By.xpath("//a[text()='Welcome Admin']");				//Locating WelcomeAdmin object menu
	By about = By.xpath("//a[text()='About']");								//Locating about object
	By closeAbout = By.xpath("//*[@id=\"displayAbout\"]/div/a");								//Locating about object
	By logout = By.xpath("//a[text()='Logout']");							//Locating logout object 
	By orangeHRMLogo = By.xpath("//img[@alt='OrangeHRM']");					//Locating orangeHRMLogo object 
	
	public HeaderLogin(WebDriver driver) {									//Constructor that is getting the WebDriver
		this.driver=driver;													//Initializing the WebDriver
	}
	
	public void clickOnwelcomeAdmin() {										//click On Welcome Admin menu
		Reporter.log("=======clickOnwelcomeAdmin Started=======",true);
		driver.findElement(welcomeAdmin).click();
		Reporter.log("=======clickOnwelcomeAdmin Ended=======",true);
	}
	
	
	public void clickOnAbout() {											//click On About
		Reporter.log("=======clickOnAbout Started=======",true);
		clickOnwelcomeAdmin();
		driver.findElement(about).click();
		Reporter.log("=======clickOnAbout Ended=======",true);
	}
	
	
	public void clickOnCloseAbout() {											//click On About
		Reporter.log("=======clickOnAbout Started=======",true);
		clickOnAbout();
		driver.findElement(closeAbout).click();
		Reporter.log("=======clickOnAbout Ended=======",true);
	}
	
	
	public void clickOnLogout() {											//click On Logout
		Reporter.log("=======clickOnLogout Started=======",true);
		clickOnwelcomeAdmin();
		driver.findElement(logout).click();
		Reporter.log("=======clickOnLogout Ended=======",true);
	}
	
	
	public void clickOnOrangeHRMLogo() {									//click On Orange HRM Logo
		Reporter.log("=======clickOnOrangeHRMLogo Started=======",true);
		driver.findElement(orangeHRMLogo).click();
		Reporter.log("=======clickOnOrangeHRMLogo Ended=======",true);
	}

}
