package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginToSystem {
	public static WebDriver driver = null;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();									//
		driver = new ChromeDriver();
		driver.get("https://google.com");											//Navigate to url
		System.out.println(driver.getTitle());										//Will print the title of the page
		driver.findElement(By.name("q")).sendKeys("Solotech");						//Sending keys to field
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);						//Sending Enter key

		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
