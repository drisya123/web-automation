package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinkExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver.exe");


	        // Launch the browser
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the target website
	        driver.get("https://in.musafir.com/");
	        driver.manage().window().maximize();

	        // Option 1: Click by link text
	        WebElement HotelsLink = driver.findElement(By.id("ctl00_ctrlHeader_ltlVisaUrl"));
	        HotelsLink.click();
	        WebElement HolidaysLink = driver.findElement(By.id("ctl00_ctrlHeader_ltlHolidaysUrl"));
	        HolidaysLink.click();
	      
	        WebElement BlogLink = driver.findElement(By.linkText("Blogs"));
	        BlogLink.click();
	        WebElement OfferLink = driver.findElement(By.id("ctl00_ctrlHeader_ltlOffersClass"));
	        OfferLink.click();
	        

	        // Option 2: If text is partial
	        // WebElement aboutUsLink = driver.findElement(By.partialLinkText("About"));
	        // aboutUsLink.click();

	        // Option 3: If it's a button or styled differently, use XPath or CSS selector
	        // WebElement aboutUsLink = driver.findElement(By.xpath("//a[@href='/about']"));
	        // aboutUsLink.click();

	        // Wait and close (for demonstration purposes)
	        try {
	            Thread.sleep(3000); // Let it load
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	     // Locate and click "Offers" link
	        WebElement offersLink = driver.findElement(By.xpath("//a[contains(text(),'Offers')]"));
	        offersLink.click();

	        System.out.println("Clicked on Offers link successfully!");


	        //driver.quit();
	    }
	

	}

