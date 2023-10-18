package swagdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class SwagDemoValidation extends SeleniumUtil {
	@Test
	public void swagProductAdding() {
		WebDriver driver = setUp("chrome", "https://www.saucedemo.com/");
		WebElement element1 = driver.findElement(By.id("user-name"));
		typeInput(element1, "standard_user");
		WebElement element2 = driver.findElement(By.id("password"));
		typeInput(element2, "secret_sauce");
		clickOnElement(driver.findElement(By.id("login-button")));
		
		clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")));
		clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")));
		clickOnElement(driver.findElement(By.cssSelector(".shopping_cart_link")));
		clickOnElement(driver.findElement(By.cssSelector(".checkout_button")));
		
		WebElement element3 = driver.findElement(By.id("first-name"));
		typeInput(element3, "ABC");
		WebElement element4 = driver.findElement(By.id("last-name"));
		typeInput(element4, "XYZ");
		WebElement element5 = driver.findElement(By.id("postal-code"));
		typeInput(element5, "422103");
		clickOnElement(driver.findElement(By.id("continue")));
		
		clickOnElement(driver.findElement(By.cssSelector(".cart_button")));
		
		WebElement msg = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
		System.out.println("Confirmation Message:"+msg.getText());

		clickOnElement(driver.findElement(By.id("back-to-products")));
		
		String expectedHomePageTitle="Swag Labs";
		String actualHomePageTitle=getCurrentPageTitle("Swag Labs");
		Assert.assertTrue(actualHomePageTitle.equals(expectedHomePageTitle),"Either login failed or home page title changed");
	}
}
