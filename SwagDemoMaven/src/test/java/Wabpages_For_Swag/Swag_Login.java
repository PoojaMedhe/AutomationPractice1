package Wabpages_For_Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class Swag_Login extends SeleniumUtil {
	public Swag_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement UserName;

	@FindBy(id = "password")
	private WebElement passward;

	@FindBy(id = "login-button")
	private WebElement login;

	public void LoginSwagApp(String username,String password) {
		typeInput(UserName, username);
		typeInput(passward, password);
		clickOnElement(login);
	}
}