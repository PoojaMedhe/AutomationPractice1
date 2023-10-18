package webpagesOrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class OrangeHrmLoginPage extends SeleniumUtil{
	
	public OrangeHrmLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement userNameInputField;
	
	@FindBy(name="password")
	private WebElement passwordInputField;
	
	@FindBy(css=".oxd-button")
	private WebElement loginButton;
	
	public void loginInOrangeHrmApplication(String username,String password) {
		typeInput(userNameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}
}