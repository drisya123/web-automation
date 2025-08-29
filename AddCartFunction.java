package com.selenium4.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCartFunction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
            driver.get("https://www.saucedemo.com/");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            // Add “Sauce Labs Backpack”
            By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
            wait.until(ExpectedConditions.elementToBeClickable(addBackpack)).click();

            // Verify cart badge shows 1
            WebElement badge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".shopping_cart_badge")));
            if (!"1".equals(badge.getText().trim())) {
                throw new AssertionError("Expected cart count 1 but got: " + badge.getText());
            }

            // Go to cart and verify item present
            driver.findElement(By.cssSelector(".shopping_cart_link")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cart_item")));
            WebElement itemName = driver.findElement(By.cssSelector(".inventory_item_name"));
            if (!itemName.getText().contains("Sauce Labs Backpack")) {
                throw new AssertionError("Backpack not found in cart");
            }

            System.out.println("Item successfully added to cart!");
        } finally {
            driver.quit();
        }
    }

	}

		
