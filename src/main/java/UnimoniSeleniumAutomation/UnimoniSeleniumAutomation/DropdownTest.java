package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownTest {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
//		ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/guru99home/");	
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement ele;

		ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SELENIUM")));
		ele.click();
		System.out.println("Clicked on selenium link");

	}	
	

}
