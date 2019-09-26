package TestNG;

import org.testng.annotations.Test;


public class GroupsExample {
	
	@Test(groups = { "Test1" })
	public void loginTest() {
		
		System.out.println("Logged in successfully");
	}
	
	@Test(groups = { "Test2" , "Test1" })
	public void loginTest1() {
		
		System.out.println("Logged in new successfully");
	}

	@Test(groups = { "Test1" })
	public void composeMail() {
		System.out.println("Mail Sent");
	}
	
	@Test(groups = { "Test1" })
	public void composeMail1() {
		System.out.println("Mail Sent1");
	}

}
