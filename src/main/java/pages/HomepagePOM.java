package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePOM {

	//POM approach
	@FindBy(name = "uid") 
	private WebElement userName;
	
	@FindBy(name = "password") 
	private WebElement passWord;
	
	@FindBy(name = "btnLogin") 
	private WebElement loginButton;
	
	public void homePageTC() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\UnimoniSeleniumAutomation\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
		
		PageFactory.initElements(driver, this);	
		
	}
		//enter Username
		public void enterUserName(String userName1) {
			userName.sendKeys(userName1);
		}
		
		//enter Username
		public void enterPassword(String password1) {
			passWord.sendKeys(password1);
		}

		//click on login button
		public void clickOnLoginButton() {
			loginButton.click();
		}

}
