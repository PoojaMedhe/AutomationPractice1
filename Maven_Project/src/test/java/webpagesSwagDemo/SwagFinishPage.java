package webpagesSwagDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

	public class SwagFinishPage extends SeleniumUtil{
		public SwagFinishPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(css=".cart_button")
		private WebElement finishBtn;
		
		public void clickOnfinishBtn() {
			clickOnElement(finishBtn);
		}
		
}
