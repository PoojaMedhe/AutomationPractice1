package webpagesSwagDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.SeleniumUtil;

public class SwagProductPage extends SeleniumUtil {

	public SwagProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css=".inventory_item")
	private List<WebElement> p2;
	
	@FindBy(css=".shopping_cart_link")
	WebElement cartBtn;
	
public void addProducts() {
	WebElement selectedProduct1=p2.get(0);
	WebElement selectedProduct2=p2.get(1);
		clickOnElement(cartBtn);
}
}