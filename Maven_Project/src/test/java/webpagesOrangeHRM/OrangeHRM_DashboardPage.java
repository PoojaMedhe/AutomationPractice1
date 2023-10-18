package webpagesOrangeHRM;

	import java.util.List;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import utilities.SeleniumUtil;

	public class OrangeHRM_DashboardPage extends SeleniumUtil{
		
		public OrangeHRM_DashboardPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//Click on PIM Menu
		
		@FindBy(css="ul>li:nth-child(2)>a>span")
		private WebElement PIM;
		
		public void clickOnPIM() {
		clickOnElement(PIM);		
		}
		
		//Click on user Profile
		@FindBy(css=".oxd-userdropdown-tab")
		private WebElement userProfile;
		
		//Click on LogOut Link
		@FindBy(xpath="//a[text()='Logout']")
		private WebElement logoutLink;
				
		public void logoutFromApplication() {
			clickOnElement(userProfile);
			clickOnElement(logoutLink);
		}
		
	}    
	


