package testscriptSwag;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;
import webpagesSwagDemo.SwagCheckOutPage;
import webpagesSwagDemo.SwagContinuePage;
import webpagesSwagDemo.SwagDemoLoginPage;
import webpagesSwagDemo.SwagFinishPage;
import webpagesSwagDemo.SwagProductPage;
import webpagesSwagDemo.SwagThankyouPage;

	public class TestSwagDemo extends SeleniumUtil {
		WebDriver driver;
		SwagDemoLoginPage getLoginPage;
		SwagProductPage getSwagProductPage;
		SwagCheckOutPage getSwagCheckOutPage;
		SwagContinuePage getSwagContinuePage;
		SwagFinishPage getSwagFinishPage;
		SwagThankyouPage getSwagThankyouPage;
	
	@BeforeTest
	public void precondition() {
		driver = setUp("chrome", "https://www.saucedemo.com/");
		// initialize your required WebPage class
		getLoginPage = new SwagDemoLoginPage(driver);
		getSwagProductPage = new SwagProductPage(driver);
		getSwagCheckOutPage = new SwagCheckOutPage(driver);
		getSwagContinuePage = new SwagContinuePage(driver);
		getSwagFinishPage = new SwagFinishPage(driver);
		getSwagThankyouPage = new SwagThankyouPage(driver);	
	}
	@Test
	public void testLogin() {
		getLoginPage.clickOnLoginButton("standard_user", "secret_sauce");
			
	}
	
	@Test(priority = 1)
	public void testClickAddCart() throws Throwable {
		getSwagProductPage.addProducts();
		
		
	}
	@Test(priority = 2)
	public void testCheckOutAndFinish() throws Throwable {
		
		getSwagCheckOutPage.checkOut();
		getSwagContinuePage.clickOnContinueButton();
		getSwagFinishPage.clickOnfinishBtn();
	}
	
	@Test(priority = 2)
	public void testThankYouMsg() throws Throwable {
		getSwagThankyouPage.clickMessageValidation();
		
	}
}