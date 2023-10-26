package webpagesOrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class PIMpage extends SeleniumUtil {
	public PIMpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
			//Click On AddEmployee Button
	
			@FindBy(css="div>nav>ul>li:nth-child(3)")
			private WebElement addEmployee;
			
			public void clickOnAddEmployee() {
				clickOnElement(addEmployee);	
			}
		
			//Click On EmployeeList Button
			
			@FindBy(css="//div/header/div[2]/nav/ul/li[2]")
			private WebElement employeeList;
			
			public void OrangeHrmEmployeeListPage() {
				clickOnElement(employeeList);
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
			