package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import TestNG.BaseTest;

@Test(groups = { "DesktopWeb" })
public class DataProviderExample extends BaseTest {

	private String userId_textbox_name = "uid";
	private String password_textbox_name = "password";
	private String login_button_name = "btnLogin";
	private String reset_button_name = "btnReset";

	@Test(dataProvider = "dp")
	public void login(String name, String password) throws Exception {
		setUserId(name);
		setPassword(password);
		Thread.sleep(5000);
		clickOnLogin();
	}
	@DataProvider
	public Object[][] dp() {
		return new Object[][] {{"mngr195463","rUzyqem"}, {"mngr195464","b"}};
	}
	public void setUserId(String userId) {
		getDriver().findElement(By.name(userId_textbox_name)).clear();
		getDriver().findElement(By.name(userId_textbox_name)).sendKeys(userId);
	}
	public void setPassword(String password) {
		getDriver().findElement(By.name(password_textbox_name)).clear();
		getDriver().findElement(By.name(password_textbox_name)).sendKeys(password);
	}
	public void clickOnLogin() {
		getDriver().findElement(By.name(login_button_name)).click();
	}

	public void clickOnReset() {
		getDriver().findElement(By.name(reset_button_name)).click();
	}
	public void reset() {
		clickOnReset();
	}

}
