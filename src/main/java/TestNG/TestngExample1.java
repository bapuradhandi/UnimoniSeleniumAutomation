package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngExample1 {
	
	
	@Test(priority =1)
	public void seleniumPracticeLaunch() {
	
	System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.google.com/");
	driver.navigate().to("https://learn.letskodeit.com/p/practice");
	driver.quit();
	}
	
	
	@Test(priority = 0)
	public void googleLaunch() throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title:" + driver.getTitle());
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium");
		element.sendKeys(Keys.ESCAPE);
		
		WebElement search = driver.findElement(By.name("btnK"));
		Thread.sleep(1000);
		search.click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	@BeforeTest
	public void executionStart() {
		
		System.out.println("Starting the selenium execution");
	}
	
	@AfterTest
	public void executionCompleted() {
		
		System.out.println("Closing the selenium execution");
	}
	
	
}
