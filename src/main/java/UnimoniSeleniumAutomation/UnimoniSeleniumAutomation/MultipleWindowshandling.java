package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowshandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");

		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("openwindow")).click();
		Set windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		for(String windowHandles1 : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandles1);
			System.out.println(driver.getTitle());
		}
	}

}
