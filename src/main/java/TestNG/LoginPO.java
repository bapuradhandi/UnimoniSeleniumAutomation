package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {
	
	WebDriver driver;
	public LoginPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "Inpatient Ward")
	private WebElement inPatientWard;
	
}
