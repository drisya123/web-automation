package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxClear {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Open the login page
	        driver.get("https://www.saucedemo.com/");

	        // Maximize window
	        driver.manage().window().maximize();

	        // Locate username field
	        WebElement usernameField = driver.findElement(By.id("user-name"));

	        // Enter some text
	        usernameField.sendKeys("wrongUser");

	        Thread.sleep(2000); // Pause for visibility

	        // Clear the text field
	        usernameField.clear();

	        // Enter correct text
	        usernameField.sendKeys("standard_user");

	        Thread.sleep(2000); // Pause for visibility

	        // Close browser
	        driver.quit();
	  

	}

}
