package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

@Test(groups={"DesktopWeb"})
public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s, String name) {
	  System.out.println("The current run:" + n + ":" + s + ":" + name);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a",  "Seshu" },
      new Object[] { 2, "b", "Kumar" },
    };
  }
}
