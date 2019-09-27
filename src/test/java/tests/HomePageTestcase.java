package tests;

import org.testng.annotations.Test;

import pages.HomepagePOM;

public class HomePageTestcase {
	
	@Test
	public void homePageTC() throws InterruptedException {
		
		HomepagePOM homepagePO = new HomepagePOM();
		homepagePO.homePageTC();
		homepagePO.enterUserName("BapuRadhandi");
		homepagePO.enterPassword("bapu@123");
		homepagePO.clickOnLoginButton();
		
		System.out.println("Hello World");
	}

}
