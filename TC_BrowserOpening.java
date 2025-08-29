package com.selenium2.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_BrowserOpening {
	@Test
	public static void Browser() {

	//public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.musafir.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.navigate().to("https://in.musafir.com/Visa");
		//Thread.sleep(2000);
		pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().back();
		//Thread.sleep(2000);
		pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().forward();
		//Thread.sleep(2000);
		pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().refresh();
		pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);
		

	}

}
