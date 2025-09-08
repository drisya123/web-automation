package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {

	public static void main(String[] args) throws InterruptedException {
		// Set path to chromedriver if not already set in system PATH
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");

        // Initialize WebDriver (Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Open the login page
        driver.get("https://www.saucedemo.com/");  // Example login site

        // Maximize the window
        driver.manage().window().maximize();

        // Locate username field and enter value
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        // Locate password field and enter value
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Locate login button and click
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        System.out.println("Login form submitted successfully!");

        Thread.sleep(3000); // Just to see the result before closing

        // Close browser
        driver.quit();
    }

	
}
