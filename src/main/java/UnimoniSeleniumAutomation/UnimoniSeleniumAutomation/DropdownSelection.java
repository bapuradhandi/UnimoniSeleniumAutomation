package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub\
		
		System.setProperty("webdriver.chrome.driver","D:\\UnimoniSeleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]"));
		
		//select dropdown
		Select sel = new Select(driver.findElement(By.id("carselect")));
		sel.selectByIndex(0);
		Thread.sleep(3000);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		
		

	}

}
