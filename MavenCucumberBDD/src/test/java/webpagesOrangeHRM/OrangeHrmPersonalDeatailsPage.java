package webpagesOrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class OrangeHrmPersonalDeatailsPage extends SeleniumUtil{
	public OrangeHrmPersonalDeatailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")
	private WebElement middleName;
	
	@FindBy(css="button[type='submit']")
	private WebElement saveButton;
	

	public void editMiddleName() throws Throwable {
		typeInput(middleName,"Sai");
		clickOnElement(saveButton);
		Thread.sleep(2000);
	}

}
