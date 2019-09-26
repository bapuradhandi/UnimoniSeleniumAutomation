package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
//		ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		
		driver.manage().window().maximize();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.
//		WebElement ele = driver.findElement(By.xpath("//button[@id='mousehover']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(ele).build().perform();
		
		
		WebElement element = driver.findElement(By.xpath("//button[@id='mousehover']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000); 

	
		driver.close();

	}

}
