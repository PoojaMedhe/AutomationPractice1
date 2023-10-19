package Wabpages_For_Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class Swag_Finish  extends SeleniumUtil{
	public Swag_Finish (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "finish")
	private WebElement Finish;
	
	public void finishbutton() {
		clickOnElement(Finish);
	}
}
