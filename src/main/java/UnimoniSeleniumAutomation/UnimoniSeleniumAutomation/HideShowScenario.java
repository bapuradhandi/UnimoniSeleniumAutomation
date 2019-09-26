package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HideShowScenario {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
//		ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");	
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']")).click();
		Thread.sleep(3000);

	}

}
