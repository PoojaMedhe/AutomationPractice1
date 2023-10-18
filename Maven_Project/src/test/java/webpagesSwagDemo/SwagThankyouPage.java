package webpagesSwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class SwagThankyouPage extends SeleniumUtil{
	public SwagThankyouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	WebElement message;
	
	@FindBy(id="back-to-products")
	WebElement backHomePage;
	
	public void clickMessageValidation() {
		System.out.println(message.getText());
		clickOnElement(backHomePage);
	}
}
