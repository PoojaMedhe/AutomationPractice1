package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;


public class Example3  extends SeleniumUtil{
	@Test
	public void testCase1() {
		WebDriver driver = setUp("chrome", "https://www.redbus.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// vertical scrolling
		js.executeScript("window.scrollBy(0,2500)");
		setSleepTime(2000);
		js.executeScript("window.scrollBy(0,-2500)");

		// Horizontal scrolling
		// js.executeScript("window.scrollBy(500,0)");

	}
}