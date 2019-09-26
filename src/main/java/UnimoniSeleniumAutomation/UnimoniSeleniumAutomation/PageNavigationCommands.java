package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigationCommands {
	
	public static void main(String[]args) {
		
//		Instantiating ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://learn.letskodeit.com/p/practice");
		
//		navigating back
		driver.navigate().back();
		
//		navigating forward
		driver.navigate().forward();
		
//		refreshing the page
		driver.navigate().refresh();
	}

}
