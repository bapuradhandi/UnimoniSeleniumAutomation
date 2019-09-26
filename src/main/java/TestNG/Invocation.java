package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation {
	
	@Test(invocationCount = 7)
	public void loginTest() {
		System.out.println("Logged in successfully");
		
		
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://learn.letskodeit.com/p/practice");
		driver.quit();
	}

}
