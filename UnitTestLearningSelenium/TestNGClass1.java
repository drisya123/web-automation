 package testNGLearning;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGClass1 {
	WebDriver driver;
  @Test
  public void f() {
	  String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
  }
  @BeforeMethod
  public void BeforeMethod() {
	  

			//public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://in.musafir.com/");
				driver.manage().window().maximize();
				System.out.println("Chrome is starting");
  }
  

  }
  

  
