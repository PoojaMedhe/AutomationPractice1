package webpagesSwagDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.SeleniumUtil;

public class SwagCheckOutPage extends SeleniumUtil{
	public SwagCheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".inventory_item")
	private List<WebElement> p1;
	
	@FindBy(css=".checkout_button")
	WebElement checkoutBtn;
	
	public void checkOut() {
		/*WebElement selectedProduct1=p1.get(0);
		WebElement selectedProduct2=p1.get(1);
		String s1=selectedProduct1.getText();
		String s2=selectedProduct2.getText();
		Assert.assertTrue(s1.equals(s2),"Product Not Match");*/
		clickOnElement(checkoutBtn);
	}
}