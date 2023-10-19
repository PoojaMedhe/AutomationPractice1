package Wabpages_For_Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;


public class Swag_EnterDetails  extends SeleniumUtil {
	public Swag_EnterDetails (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first-name")
	private WebElement firstName;

	@FindBy(id = "last-name")
	private WebElement lastname;

	@FindBy(id = "postal-code")
	private WebElement pinCode;
	
	@FindBy(id = "continue")
	private WebElement login;

	public void EnteringDetails(String username,String password, String pincode) {
		typeInput(firstName, username);
		typeInput(lastname, password);
		typeInput(pinCode, pincode);
		clickOnElement(login);
	}
}
