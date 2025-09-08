package com.selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpening {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	              "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	      driver.get("https://www.google.com/");

	}

}
