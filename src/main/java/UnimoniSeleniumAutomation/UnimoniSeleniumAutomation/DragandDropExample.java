package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement destinationEle = driver.findElement(By.id("droppable"));
		
		System.out.println(destinationEle.getText());
		act.dragAndDrop(sourceEle, destinationEle).build().perform();
		
	}

}
