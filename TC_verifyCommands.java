package com.selenium1.org;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TC_verifyCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://in.musafir.com/";
		driver.get(baseUrl);
		String title = driver.getTitle();
		int TitleLength = title.length();
		System.out.println("page title"+title);
		System.out.println("page title length"+TitleLength);
		String actualUrl = driver.getCurrentUrl();
		driver.manage().window().maximize();
		if(baseUrl.equals(actualUrl))
		{
			System.out.println("base url=expected url");
		}
		else
		{
			System.out.println("base url!=expected url");
		}
		  String pageSource = driver.getPageSource();
		  if(pageSource.length()>1000)
		  {
			  System.out.println("page source length is greater");
		  }
		  else
		  {
			  System.out.println("page source length is not greater");
		  }
		  driver.quit();

	}

}
