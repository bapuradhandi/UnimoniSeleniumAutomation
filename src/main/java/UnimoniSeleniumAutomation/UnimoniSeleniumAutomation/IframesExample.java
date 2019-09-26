package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");	
		driver.manage().window().maximize();
		System.out.println("total frames count is " + driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.id("search-courses")).sendKeys("java");
		driver.findElement(By.id("search-course-button")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("bmwradio")).click();
	}

}
