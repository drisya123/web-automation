package com.selenium5.org;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddMultipleFunctionalitytoCart {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        try {
	            // Step 1: Login
	            driver.get("https://www.saucedemo.com/");
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
	            driver.findElement(By.id("password")).sendKeys("secret_sauce");
	            driver.findElement(By.id("login-button")).click();

	            // Step 2: Choose multiple items to add
	            List<String> productsToAdd = Arrays.asList(
	                    "sauce-labs-backpack",
	                    "sauce-labs-bike-light",
	                    "sauce-labs-bolt-t-shirt"
	            );

	            for (String product : productsToAdd) {
	                By addButton = By.id("add-to-cart-" + product);
	                wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
	            }

	            // Step 3: Verify cart badge count
	            WebElement badge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".shopping_cart_badge")));
	            String badgeCount = badge.getText().trim();
	            if (!badgeCount.equals(String.valueOf(productsToAdd.size()))) {
	                throw new AssertionError("Expected cart count " + productsToAdd.size() + " but got " + badgeCount);
	            }

	            // Step 4: Go to cart and verify products
	            driver.findElement(By.cssSelector(".shopping_cart_link")).click();
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cart_item")));

	            List<WebElement> cartItems = driver.findElements(By.cssSelector(".inventory_item_name"));
	            Set<String> cartItemNames = new HashSet<>();
	            for (WebElement item : cartItems) {
	                cartItemNames.add(item.getText().toLowerCase());
	            }

	            // Map product IDs to display names
	            Map<String, String> expectedNames = new HashMap<>();
	            expectedNames.put("sauce-labs-backpack", "Sauce Labs Backpack");
	            expectedNames.put("sauce-labs-bike-light", "Sauce Labs Bike Light");
	            expectedNames.put("sauce-labs-bolt-t-shirt", "Sauce Labs Bolt T-Shirt");

	            for (String product : productsToAdd) {
	                String expectedName = expectedNames.get(product).toLowerCase();
	                if (!cartItemNames.contains(expectedName)) {
	                    throw new AssertionError("Product not found in cart: " + expectedName);
	                }
	            }

	            System.out.println("All items successfully added and verified in cart!");

	        } finally {
	            driver.quit();
	        }
	    }
	

	}

