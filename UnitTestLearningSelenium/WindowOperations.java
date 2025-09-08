package com.selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");

        // Initialize WebDriver (Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Maximize the browser window
        driver.manage().window().maximize();
        System.out.println("Browser window maximized");
        Thread.sleep(2000); // Pause for visibility

        // Minimize the browser window
        driver.manage().window().minimize();
        System.out.println("Browser window minimized");
        Thread.sleep(2000); // Pause for visibility

        // Close the browser window
        driver.close();
        System.out.println("Browser window closed");
    }

	}


