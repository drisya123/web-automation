package testNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTestclass2 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
              "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.saucedemo.com/");
      String currentUrl = driver.getCurrentUrl(); // ✅ driver is initialized here
      System.out.println("Current URL is: " + currentUrl);
      Assert.assertTrue(currentUrl.contains("saucedemo"), "URL does not contain saucedemo!");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("chrome is starting");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("chrome is stoping");
  }

}
