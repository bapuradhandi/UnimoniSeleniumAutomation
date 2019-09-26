package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
//		ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");	
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();      // Switching to Alert ​

		String alertMessage= driver.switchTo().alert().getText();     // Capturing alert message.    ​

		System.out.println(alertMessage);       // Displaying alert message	​

		alert.accept();      // Accepting alert​

		 driver.close();

	}		

}
