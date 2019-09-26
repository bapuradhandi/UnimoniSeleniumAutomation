package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathScenarios {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

//		ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");	
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header-sign-up-btn\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("bapuraj19");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("bapuraj19@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("rajabapu@123");
		driver.findElement(By.xpath("//*[@id=\"user_password_confirmation\"]")).sendKeys("rajabapu@123");
		
		
	}

}
