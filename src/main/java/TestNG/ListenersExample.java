package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestNG.BaseTest;

public class ListenersExample extends BaseTest implements ITestListener  {

	// When Test case get failed, this method is called.
	public void onTestFailure(ITestResult iTestResult) {
		//Get driver from BaseTest and assign to local webdriver variable.
        Object testClass = iTestResult.getInstance();
        WebDriver webDriver = ((BaseTest) testClass).getDriver();
        
		System.out.println( webDriver.getTitle());
		System.out.println("The name of the testcase failed is :" + iTestResult.getName());
	}

	// When Test case get Skipped, this method is called.
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is :" + Result.getName());
	}

	// When Test case get Started, this method is called.
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + " test case started");
	}

	// When Test case get passed, this method is called.
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is :" + Result.getName());
	}

	// ISuiteListener, IInvokedMethodListener
	public void onFinish(ITestContext Result) {
	}

	public void onStart(ITestContext iTestContext) {
		iTestContext.setAttribute("WebDriver", getDriver());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
	}

}