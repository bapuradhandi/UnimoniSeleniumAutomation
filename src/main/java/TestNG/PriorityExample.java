package TestNG;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test//(priority = 0)
	public void loginTest() {
		System.out.println("Logged in successfully");
	}

	@Test//(priority = 1)
	public void composeMail() {
		System.out.println("Mail Sent");
	}
	
	@Test//(priority = 1)
	public void article() {
		System.out.println("Article");
	}


}
