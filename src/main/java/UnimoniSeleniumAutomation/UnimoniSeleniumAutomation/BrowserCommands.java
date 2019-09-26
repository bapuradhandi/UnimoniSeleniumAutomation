package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		Instantiating ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		
//		maximizing the window
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
//		displaying the title of the web page
		String title = driver.getTitle();
		System.out.println("Page title is " +title);

//		displaying the page header
		String pageHeader = driver.findElement(By.xpath("//*[@id=\"block-1069048\"]/div/div/div/h1")).getText();
		System.out.println("Page header is " +pageHeader);
		
//		selecting a radio button
		driver.findElement(By.id("bmwradio")).click();
		
//		selecting a drop down value
		List<WebElement> carClass = driver.findElements(By.name("cars"));
		System.out.println(carClass.size());
		Thread.sleep(3000);
		
//		closing the driver
		driver.close();
		driver.quit();
		
		
	}

}
