package Swag_Full_Scripte;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Wabpages_For_Swag.Swag_AddCard;
import Wabpages_For_Swag.Swag_CheckOut;
import Wabpages_For_Swag.Swag_EnterDetails;
import Wabpages_For_Swag.Swag_Finish;
import Wabpages_For_Swag.Swag_Login;
import Wabpages_For_Swag.Swag_ThanksMessage;
import utilities.SeleniumUtil;


public class swagFullScripte extends SeleniumUtil {
	
    WebDriver driver;
	Swag_Login getLogin;
	Swag_AddCard getAddCard;
	Swag_CheckOut getCheckout;
	Swag_EnterDetails getDetails;
	Swag_Finish getfinish;
	Swag_ThanksMessage getMessage;
	
	@BeforeTest
	public void pre() {
		 WebDriver driver = setUp("chrome","https://www.saucedemo.com");
		 getLogin = new Swag_Login(driver);
		 getAddCard = new Swag_AddCard(driver);
		 getCheckout = new Swag_CheckOut(driver);
		 getDetails = new Swag_EnterDetails(driver);
		 getfinish = new Swag_Finish(driver);
		 getMessage = new Swag_ThanksMessage(driver);
		 
	}
	
	
	@Test
	public void shopping() {
		getLogin.LoginSwagApp("standard_user", "secret_sauce");
		getAddCard.ClickandAdd();
		getCheckout.validatingProduct();
		getCheckout.cheackOut();
		getDetails.EnteringDetails("Aishwarya", "Deore", "422101");
		getfinish.finishbutton();
		getMessage.VerifyMessage();
		
	}
	
	
	@AfterTest
	public void post() {
		getAddCard.Logout();
	}
	
	
}
