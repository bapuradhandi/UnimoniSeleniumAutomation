package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.name("enter-name")).sendKeys("Bapu");
		driver.findElement(By.id("alertbtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert popup text is " + alertText);
		
		driver.switchTo().alert().accept();
		

	}

}
