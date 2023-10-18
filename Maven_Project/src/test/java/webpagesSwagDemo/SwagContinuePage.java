package webpagesSwagDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class SwagContinuePage extends SeleniumUtil{
		public SwagContinuePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="first-name")
		private WebElement firstName;
		
		@FindBy(id="last-name")
		private WebElement lastName;
		
		@FindBy(id="postal-code")
		private WebElement postal_code;
		
		@FindBy(id="continue")
		private WebElement continueButton;
		
		public void clickOnContinueButton() {
			typeInput(firstName, "Pooja");
			typeInput(lastName, "Sharma");
			typeInput(postal_code, "422106");
			clickOnElement(continueButton);
		}
}
