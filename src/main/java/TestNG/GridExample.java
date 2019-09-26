package TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridExample {
	
	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeTest
	public void init(String browser) throws MalformedURLException {
		if (browser.equals("chrome")) {
			DesiredCapabilities dc = DesiredCapabilities.chrome();
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WIN10);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		} else if (browser.equals("firefox")) {
			
			DesiredCapabilities dc = DesiredCapabilities.firefox();
			//dc.setVersion("66.0.5");
			//dc.set
			//dc.setBrowserName("firefox");
			dc.setPlatform(Platform.WIN10);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		}		
		// driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title:" + driver.getTitle());

	}

	@Test
	public void googleSearch_one() throws InterruptedException {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium");
		element.sendKeys(Keys.ESCAPE);

		WebElement search = driver.findElement(By.name("btnK"));
		Thread.sleep(1000);
		search.click();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
