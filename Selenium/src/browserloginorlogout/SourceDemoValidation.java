package browserloginorlogout;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SourceDemoValidation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("Title: "+driver.getTitle());
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Swag Labs";
		System.out.println("Is Swag Labs Page Open??? "+ActualTitle.equals(ExpectedTitle));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String expectedHomePageTitle="Swag Labs";
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		
		String actualHomePageTitle=driver.getTitle();
		System.out.println("Home page Acutal Title: "+actualHomePageTitle);
		System.out.println("Home page Expected Title: "+expectedHomePageTitle);
		System.out.println("Is Home Page And Actual Title Same???"+actualHomePageTitle.equals(expectedHomePageTitle));
		
		WebElement UsernameDefault=driver.findElement(By.id("user-name"));
		System.out.println("Is Username Feild is visible: "+UsernameDefault.isDisplayed());
		System.out.println("Is Username Feild is editable: "+UsernameDefault.isEnabled());
		System.out.println("Username Felid Default value: "+UsernameDefault.getAttribute("placeholder"));
		System.out.println("Username Border color: "+UsernameDefault.getCssValue("border-bottom"));
		
		WebElement passwordDefault=driver.findElement(By.id("password"));
		System.out.println("Is Password Feild is visible: "+passwordDefault.isDisplayed());
		System.out.println("Is Password Feild is editable: "+passwordDefault.isEnabled());
		System.out.println("Password Felid Default value: "+passwordDefault.getAttribute("placeholder"));
		System.out.println("Password Border color: "+passwordDefault.getCssValue("border-bottom"));
		
		WebElement loginButton=driver.findElement(By.id("login-button"));
		System.out.println("Is login Button Feild is visible: "+loginButton.isDisplayed());
		System.out.println("Is login Button Feild is Clickable: "+loginButton.isEnabled());
		System.out.println("Login Button Name:"+loginButton.getAttribute("value"));
		System.out.println("Login Button Bakground Color: "+loginButton.getCssValue("background-color"));	
		System.out.println("Login Button Font size: "+loginButton.getCssValue("font-size"));
		System.out.println("Login Button Font Family: "+loginButton.getCssValue("font-family"));
		System.out.println("Login Button Text color: "+loginButton.getCssValue("color"));
		
		
		/*WebElement UsernameInput=driver.findElement(By.id("user-name"));
		Point ptuser=UsernameInput.getLocation();
		int user_y=ptuser.getY();
		System.out.println("Username Feild Y cordinate:"+user_y);
		WebElement errormsg1=driver.findElement(By.className("error-message-container"));
		Point pterror1=errormsg1.getLocation();
		int error_y1=pterror1.getY();
		System.out.println("Username error msg Y cordinate:"+error_y1);
		System.out.println("Error msg is display below the Username feild:"+(user_y<error_y1));
		System.out.println("Username Error msg Bakground Color: "+errormsg1.getCssValue("background-color"));	
		System.out.println("Username Error msg Font size: "+errormsg1.getCssValue("font-size"));
		System.out.println("Username Error msg Font Family: "+errormsg1.getCssValue("font-family"));
		System.out.println("Username Error msg Text color: "+errormsg1.getCssValue("color"));
		System.out.println("Error msg Text:"+errormsg1.getText());*/
		
		
		WebElement passwordInput=driver.findElement(By.id("password"));
		Point ptpass=passwordInput.getLocation();
		int pass_y=ptpass.getY();
		System.out.println("Password FeildY cordinate:"+pass_y);
		WebElement errormsg2=driver.findElement(By.className("error-message-container"));
		Point pterror2=errormsg2.getLocation();
		int error_y2=pterror2.getY();
		System.out.println("Password error msg Y cordinate:"+error_y2);
		System.out.println("Error msg is display below the password feild:"+(pass_y<error_y2));
		System.out.println("Password Error msg Bakground Color: "+errormsg2.getCssValue("background-color"));	
		System.out.println("Password Error msg Font size: "+errormsg2.getCssValue("font-size"));
		System.out.println("Password Error msg Font Family: "+errormsg2.getCssValue("font-family"));
		System.out.println("Password Error msg Text color: "+errormsg2.getCssValue("color"));
		System.out.println("Error msg Text:"+errormsg2.getText());
	}

}

/*
open browser and enter url as https://www.saucedemo.com/
click on login button
validate following things-
	1. username & password ---> visible, enable, default text, border color
	2. error msg ---> visible, enable, text msg, text size, text color, background color
	3. login button ---->visible, enable, text msg, text size, text color, background color
	4. error msg below password input field
*/