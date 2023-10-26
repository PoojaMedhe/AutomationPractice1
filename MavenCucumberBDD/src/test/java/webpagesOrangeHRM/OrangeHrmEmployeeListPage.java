package webpagesOrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class OrangeHrmEmployeeListPage extends SeleniumUtil {
	public OrangeHrmEmployeeListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div/header/div[2]/nav/ul/li[2]")
	private WebElement empList;
	
	@FindBy(xpath = "//div[1]/div/div[2]/div/div/input[@placeholder='Type for hints...']")
	private WebElement srchInputs;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement btnSearch;

	@FindBy(xpath = "//div[contains(@class, 'oxd-table-cell')]")
	private WebElement userEditRecords;

	@FindBy(xpath = "//div/div[3]//div/button[2]")
	private WebElement editBtn;
	
	@FindBy(xpath="//div/div[3]//div/button[1]")
	private WebElement deleteBtn;
	
	@FindBy(css=".orangehrm-modal-footer>button:nth-child(2)")
	private WebElement deletePopUp;
	
	//Click on EmployeeList and found perticular Record and click on Search Button
		public void clickOnEmpList() {
			clickOnElement(empList);
			typeInput(srchInputs, "Pooja");
			clickOnElement(btnSearch);
			
		}
		//Click on Edit Button
			public void clickOnRecordAndEditBtn() {
			clickOnElement(userEditRecords);
			clickOnElement(editBtn);
			
		}
	/*//Click on Delete Button
	public void clickOnDeleteBtn() throws Throwable {
		clickOnElement(empList);
		typeInput(srchInputs, "Sharma");
		Thread.sleep(3000);
		clickOnElement(btnSearch);
	}*/
	public void deleteFoundRecord() {
		clickOnElement(userEditRecords);
		clickOnElement(deleteBtn);
	}
	
	public void clickOnPopup() {
		clickOnElement(deletePopUp);
	}	
		
	
}

