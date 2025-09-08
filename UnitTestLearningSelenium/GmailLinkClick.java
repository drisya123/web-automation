package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLinkClick {

	public static void main(String[] args) throws InterruptedException {
		// Set path to chromedriver if not already set in system PATH
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver-win32\\\\chromedriver.exe");

        // Initialize WebDriver (Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Open Google homepage
        driver.get("https://www.google.com");

        // Maximize window
        driver.manage().window().maximize();

        // Click on the "Gmail" link using linkText
        driver.findElement(By.linkText("Gmail")).click();
        System.out.println("Clicked on Gmail link");

        Thread.sleep(3000); // Pause to see the result

        // Close browser
        driver.quit();
    

	}

}
