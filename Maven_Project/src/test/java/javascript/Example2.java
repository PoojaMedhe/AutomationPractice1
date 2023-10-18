package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Example2 extends SeleniumUtil{
	@Test
	public void testCase1() {
		WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//identifying elements from the UI using JavaScript and typing required value in it
		js.executeScript("document.getElementById('username').value='admin'");
		
		//identifying elements from the UI using JavaScript and typing required value in it
		js.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		
		js.executeScript("document.getElementById('loginButton').click();");
		
//		WebElement element=driver.findElement(By.id("loginButton"));
//		js.executeScript("arguments[0].click();", element);
	}
}