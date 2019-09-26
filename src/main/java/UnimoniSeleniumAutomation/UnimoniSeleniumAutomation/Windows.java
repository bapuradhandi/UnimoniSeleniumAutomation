package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
public static void main(String[] args) throws Exception{
	// TODO Auto-generated method stub
	
//	ChromeDriver
	System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://learn.letskodeit.com/p/practice");
	
	driver.manage().window().maximize();
	
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	driver.findElement(By.id("openwindow")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	for(String windowHandles1 : windowHandles) {
		driver.switchTo().window(windowHandles1);
		driver.findElement(By.id("search-courses")).sendKeys("java");
	}
	
}
}
