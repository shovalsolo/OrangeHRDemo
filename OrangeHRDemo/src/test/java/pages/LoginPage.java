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
}
