package webpagesSwagDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class SwagDemoLoginPage extends SeleniumUtil{
	
	public SwagDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-name")
	private WebElement userNameInputField;
	
	@FindBy(id="password")
	private WebElement passwordInputField;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	public void clickOnLoginButton(String username,String password) {
		typeInput(userNameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}
}