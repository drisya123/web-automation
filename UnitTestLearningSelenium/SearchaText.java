package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchaText {

	public static void main(String[] args) {
		// Set path for ChromeDriver if not set in system PATH
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver-win32\\\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Maximize window
        driver.manage().window().maximize();

        // Locate the search box by name
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter text into the search box
        searchBox.sendKeys("Selenium WebDriver tutorial");

        // Submit the search form (can also click the search button)
        searchBox.submit();

        // Print the page title after search
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }



}
