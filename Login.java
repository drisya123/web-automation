package com.selenium4.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	//public static void main(String[] args) {
	@Test
	public void login() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.name("user-name"));
		uname.sendKeys("standard_user");
		WebElement pname = driver.findElement(By.name("password"));
		pname.sendKeys("secret_sauce");
		WebElement button = driver.findElement(By.name("login-button"));
		button.click();
		
		

	}

}
