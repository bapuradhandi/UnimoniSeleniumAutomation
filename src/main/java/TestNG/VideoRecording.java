//package TestNG;
//
//import java.lang.reflect.Method;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import atu.testrecorder.ATUTestRecorder;
//import atu.testrecorder.exceptions.ATUTestRecorderException;
//
//public class VideoRecording {
////	ATUTestRecorder recorder;
//	WebDriver driver;
//
//	@BeforeTest
//	public void setup() {
//		String workingDir = System.getProperty("user.dir");
//		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
//		Date date = new Date();
//		// Provide path to store videos and file name format.
////		try {
////			recorder = new ATUTestRecorder(workingDir + "\\ScriptVideos\\", "TestVideo-" + dateFormat.format(date),
////					false);
//			
//		}
////					catch (ATUTestRecorderException e) {
////			e.printStackTrace();
////		}
//
//	}
//
//	@Test
//	public void googleSearch(Method method) throws InterruptedException {
//		// To start video recording.
//		try {
//			recorder.start();
//		} catch (ATUTestRecorderException e) {
//			e.printStackTrace();
//		}
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://google.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("q")).sendKeys("Robot Framework");
//		driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
//		Thread.sleep(1000);
//		driver.findElement(By.name("btnK")).click();
//	}
//
//	@AfterTest
//	public void Close() throws Exception {
//		// To stop video recording.
//		recorder.stop();
//		driver.quit();
//	}
//
//}
