/**
 * @author Solomon
 * Class LoginPage that contains all the Login elements and methods of LoginPage to OrangeHRM system
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LoginPage {
	
	WebDriver driver;
	
	//Getting all the page objects to test
	By username = By.xpath("//input[@id='txtUsername']");					//
	By password = By.xpath("//input[@id='txtPassword']");					//
	By loginButton = By.xpath("//input[@id='btnLogin']");					//
	By forgotPassword = By.xpath("//*[@id=\'forgotPasswordLink\']/a");		//
	By redLoginButton = By.xpath("//*[@id='openIdLogin']");					//
	By bottomDropdown = By.xpath("//*[@id=\'openIdProvider\']/option");		//
	By linkOrangeHRM = By.xpath("//a[contains(text(),'OrangeHRM, Inc')]");	//
	By logolinkedin = By.xpath("//a[1]//img[1]");							//
	By logoFacebook = By.xpath("//a[2]//img[1]");							//
	By logoTweeter = By.xpath("//a[3]//img[1]");							//
	By logoYoutube = By.xpath("//a[4]//img[1]");							//

	public LoginPage(WebDriver driver) {													//Constructor that is getting the WebDriver
		this.driver=driver;													//Initializing the WebDriver
	}
	
	public void loginToOrangeHRM(String uid, String pass) {
		Reporter.log("=======loginToOrangeHRM Started=======",true);
		driver.findElement(username).sendKeys(uid);							//
		driver.findElement(password).sendKeys(pass);						//
		driver.findElement(loginButton).click();							//
	}
	
	public void typeUsername(String uid) {
		Reporter.log("=======typeUsername Started=======",true);
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass) {
		Reporter.log("=======typePassword Started=======",true);
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		Reporter.log("=======typePassword Started=======",true);
		driver.findElement(loginButton).click();
	}
	
	public void clickOnforgotPassword() {
		Reporter.log("=======clickOnforgotPassword Started=======",true);
		driver.findElement(forgotPassword).click();
	}
	
	public void clickONRedLoginButton() {
		Reporter.log("=======clickONRedLoginButton Started=======",true);
		driver.findElement(redLoginButton).click();
	}
	
	public void selectFromBottomDropdown(String uid) {
		Reporter.log("=======selectFromBottomDropdown Started=======",true);
		driver.findElement(bottomDropdown).sendKeys(uid);
	}
	
	public void clickOnLinkOrangeHRM() {
		Reporter.log("=======clickOnLinkOrangeHRM Started=======",true);
		driver.findElement(linkOrangeHRM).click();
	}
	
	public void clickOnlogolinkedin(String uid) {
		Reporter.log("=======clickOnlogolinkedin Started=======",true);
		driver.findElement(logolinkedin).click();
	}
	
	public void clickOnlogoFacebook(String uid) {
		Reporter.log("=======clickOnlogoFacebook Started=======",true);
		driver.findElement(logoFacebook).click();
	}
	
	public void clickOnlogoTweeter(String uid) {
		Reporter.log("=======clickOnlogoTweeter Started=======",true);
		driver.findElement(logoTweeter).click();
	}
	
	public void clickOnlogoYoutube(String uid) {
		Reporter.log("=======clickOnlogoYoutube Started=======",true);
		driver.findElement(logoYoutube).click();
	}
}