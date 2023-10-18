package vtigerbyusingutilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class VTigerBeforeAndAfterTest extends SeleniumUtil {


	@BeforeTest
	public void beforeTestPre() {
		System.out.println("I am @BeforeTest Method");
		System.out.println();
		WebDriver driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	}
	
	
	@BeforeMethod
	public void simpleBefore() {
		System.out.println("	I am Before Method");
	}

	@Test(priority = 1)
	public void usernameFeild() {
		WebElement element1 = driver.findElement(By.id("username"));
		typeInput(element1, "Admin");
		waitUntilElementIsVisible(driver.findElement(By.id("username")));
		element1.clear();
		element1.sendKeys("Admin");
		System.out.println("		I am Test1(Username Input) Method");
	}

	@Test(priority = 2)
	public void passwordFeild() {

		WebElement element2 = driver.findElement(By.id("password"));
		typeInput(element2, "admin");
		waitUntilElementIsVisible(driver.findElement(By.id("password")));
		element2.clear();
		element2.sendKeys("admin");
		System.out.println("		I am Test2(Password Input) Method");
	}
	@Test(priority=3)
	public void loginButton() {
		clickOnElement(driver.findElement(By.tagName("button")));
		System.out.println("		I am Test3(Login Button Click) Method");
		String expectedHomePageTitle="Dashboard";
		String actualHomePageTitle=getCurrentPageTitle("Dashboard");
		Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle,"Either login failed or home page title changed");
	}
	

	@Test(priority=4)
	public void vtigerLogOutButton() {
		clickOnElement(driver.findElement(By.cssSelector(".fa-user")));
		clickOnElement(driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")));
		System.out.println("		I am Test4(LogOut) Method");

	}
	@AfterMethod
	public void simpleAfter() {
		System.out.println("	I am After Method");
		System.out.println();
	}
	
	@AfterTest
	public void afterTestPost() {
		System.out.println("I am @AfterTest Method");
		driver.close();
	}
}
