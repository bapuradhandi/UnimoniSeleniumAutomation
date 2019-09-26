package tests;

import org.testng.annotations.Test;

import pages.HomepagePOM;

public class HomePageTestcase {
	
	@Test
	public void homePageTC() {
		
		HomepagePOM homepagePO = new HomepagePOM();
		homepagePO.homePageTC();
		homepagePO.enterUserName("BapuRadhandi");
		homepagePO.enterPassword("bapu@123");
		homepagePO.clickOnLoginButton();
		
	}

}
