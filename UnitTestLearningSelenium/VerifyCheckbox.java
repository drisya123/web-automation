package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// Set path to chromedriver if not already set in system PATH
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver-win32\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a sample checkbox page (example)
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        // Maximize window
        driver.manage().window().maximize();

        // Locate the first checkbox
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        // Click to select if not already selected
        if (!checkbox1.isSelected()) {
            checkbox1.click();
            System.out.println("Checkbox is now selected.");
        } else {
            System.out.println("Checkbox was already selected.");
        }

        // Verify checkbox is selected
        if (checkbox1.isSelected()) {
            System.out.println("PASS: Checkbox is selected.");
        } else {
            System.out.println("FAIL: Checkbox is not selected.");
        }

        Thread.sleep(2000); // Pause for visibility

        // Close browser
        driver.quit();
    

	}

}
