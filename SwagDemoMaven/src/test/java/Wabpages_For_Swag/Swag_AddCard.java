package Wabpages_For_Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class Swag_AddCard extends SeleniumUtil {
	public Swag_AddCard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath ="//button[@id = 'add-to-cart-sauce-labs-backpack']")
    private WebElement AddCard;
    
    @FindBy(css = "#header_container>div>:last-child>a")
    private WebElement SymbolBuy;
    
    public void ClickandAdd() {
		clickOnElement(AddCard);
		clickOnElement(SymbolBuy);
	}
    
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu;
    @FindBy(id= "logout_sidebar_link")
    private WebElement logout;
    
    public void Logout() {
    	clickOnElement(menu);
    	clickOnElement(logout);
    }
    

}
