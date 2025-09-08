package com.selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlandTitlefetch {

	public static void main(String[] args) {
		// Set path to chromedriver if not already set in system PATH
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");

        // Initialize WebDriver (using Chrome here)
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Fetch the title of the current page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Fetch the current URL of the page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Close the browser
        driver.quit();
    }

	}

