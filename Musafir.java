package com.selenium.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Musafir {
	 public static void main(String[] args) {

	       // Set path to chromedriver (update as needed)
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://in.musafir.com/");

	        // Explicit wait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Click Flights
	        WebElement flights = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Flights")));
	        flights.click();
	        System.out.println("Clicked Flights");

	        // Navigate back to home
	        driver.navigate().back();

	        // Click Hotels
	        WebElement hotels = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Hotels")));
	        hotels.click();
	        System.out.println("Clicked Hotels");
	        driver.navigate().back();

	        // Click Visas
	        WebElement visas = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Visas")));
	        visas.click();
	        System.out.println("Clicked Visas");
	        driver.navigate().back();

	        // Click Holidays
	        WebElement holidays = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Holidays")));
	        holidays.click();
	        System.out.println("Clicked Holidays");
	        driver.navigate().back();

	        // Click Group Departures
	        WebElement groupDepartures = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Group Departures")));
	        groupDepartures.click();
	        System.out.println("Clicked Group Departures");

	        // Close browser
	        driver.quit();
	    }


}
