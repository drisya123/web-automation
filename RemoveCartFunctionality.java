package com.selenium4.org;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RemoveCartFunctionality {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
            // Step 1: Open site and log in
            driver.get("https://www.saucedemo.com/");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            // Step 2: Add “Sauce Labs Backpack” to cart
            By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
            wait.until(ExpectedConditions.elementToBeClickable(addBackpack)).click();

            // Step 3: Go to cart
            driver.findElement(By.cssSelector(".shopping_cart_link")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cart_item")));

            // Step 4: Remove from cart
            By removeBackpack = By.id("remove-sauce-labs-backpack");
            wait.until(ExpectedConditions.elementToBeClickable(removeBackpack)).click();

            // Step 5: Verify cart is empty (no cart items, no badge)
            boolean isCartEmpty = driver.findElements(By.cssSelector(".cart_item")).isEmpty();
            boolean badgeMissing = driver.findElements(By.cssSelector(".shopping_cart_badge")).isEmpty();

            if (isCartEmpty && badgeMissing) {
                System.out.println("Item successfully removed from cart!");
            } else {
                throw new AssertionError("Cart is not empty after removing item");
            }

        } finally {
            driver.quit();
        }
    }


	}

