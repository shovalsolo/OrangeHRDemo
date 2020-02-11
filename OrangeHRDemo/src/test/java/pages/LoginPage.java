/**
 * @author Solomon
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

	public LoginPage() {													//Constructor that is getting the WebDriver
		this.driver=driver;													//Initializing the WebDriver
	}
	
	public void loginToOrangeHRM(String uid, String pass) {
		driver.findElement(username).sendKeys(uid);							//
		driver.findElement(password).sendKeys(pass);						//
		driver.findElement(loginButton).click();							//
	}
	
	public void typeUsername(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public void clickOnforgotPassword() {
		driver.findElement(forgotPassword).click();
	}
	
	public void clickONRedLoginButton() {
		driver.findElement(redLoginButton).click();
	}
	
	public void selectFromBottomDropdown(String uid) {
		driver.findElement(bottomDropdown).sendKeys(uid);
	}
	
	public void clickOnLinkOrangeHRM() {
		driver.findElement(linkOrangeHRM).click();
	}
	
	public void clickOnlogolinkedin(String uid) {
		driver.findElement(logolinkedin).click();
	}
	
	public void clickOnlogoFacebook(String uid) {
		driver.findElement(logoFacebook).click();
	}
	
	public void clickOnlogoTweeter(String uid) {
		driver.findElement(logoTweeter).click();
	}
	
	public void clickOnlogoYoutube(String uid) {
		driver.findElement(logoYoutube).click();
	}
}


