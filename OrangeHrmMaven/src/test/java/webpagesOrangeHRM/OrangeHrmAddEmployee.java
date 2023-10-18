package webpagesOrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class OrangeHrmAddEmployee extends SeleniumUtil {
	public OrangeHrmAddEmployee(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// Fill the Employee Info like FirstName and LastName and EmpId
			@FindBy(name="firstName")
			private WebElement fName;
			
			@FindBy(name="lastName")
			private WebElement lName;
		    
			@FindBy(css="button[type='submit']")
			private WebElement saveButton;
		    
		    public void clickOnSaveBtn() throws Throwable{
		    	typeInput(fName, "Pooja");
		    	Thread.sleep(3000);
				typeInput(lName, "Sharma");
				Thread.sleep(3000);
		        clickOnElement(saveButton);
		        Thread.sleep(3000);
		    }

}
