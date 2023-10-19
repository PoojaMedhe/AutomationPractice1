package Wabpages_For_Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class Swag_ThanksMessage  extends SeleniumUtil{
	public Swag_ThanksMessage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//h2[text()='Thank you for your order!']")
	private WebElement message;
	
	@FindBy (id ="back-to-products")
	private WebElement backHome;
	
	public void VerifyMessage() {
		System.out.println(message.getText());
		clickOnElement(backHome);
	}
}
