/* 
 * This is a demo test to show WebDriver driver setup
 */

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
	
	
	public void setUpDriver(String browserName) {
		System.out.println("Browser name is :"+browserName);
		System.out.println("Thread id : " +Thread.currentThread().getId());
		String projectPath = System.getProperty("user.dir");		// creating a parameter of the path to the chrome driver

		
		try {
			
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");	//the location of the driver
				driver = new ChromeDriver();
				Thread.sleep(4000);	
				System.out.println("Set Up chrome Driver passed");
			}
				
				else if(browserName.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\firefox\\geckodriver.exe");	//the location of the driver
					driver = new FirefoxDriver();
					Thread.sleep(4000);	
					System.out.println("Set Up firefox Driver passed");
				}
				
				else if(browserName.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");	//the location of the driver
					driver = new InternetExplorerDriver();
					Thread.sleep(4000);	
					System.out.println("Set Up ie Driver passed");
				}
			}
			
		catch (Exception e) {
			System.out.println("Set Up Driver failed");
			System.out.println("Message is " + e.getMessage());
			System.out.println("Cause is " + e.getCause());
		}	
		
	}
	
}
