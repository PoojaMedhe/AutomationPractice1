package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;



public class Example4 extends SeleniumUtil{
	@Test
	public void testCase1() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		setSleepTime(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//identifying elements from the UI using JavaScript and typing required value in it
		js.executeScript("document.getElementsByName('username')[0].value='Admin'");
		setSleepTime(1000);
		//identifying elements from the UI using JavaScript and typing required value in it
		js.executeScript("document.getElementsByName('password')[0].value='admin123'");
		setSleepTime(1000);
		//js.executeScript("document.getElementsByClassName('orangehrm-login-button')[0].click();");
		
//		WebElement element=driver.findElement(By.id("loginButton"));
//		js.executeScript("arguments[0].click();", element);
	}

}