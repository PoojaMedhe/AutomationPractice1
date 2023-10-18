package vtigerbyusingutilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class VTigerByUsingUtilities extends SeleniumUtil {

	@Test
	public void login() {
		WebDriver driver=setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		WebElement element1=driver.findElement(By.id("username"));
		typeInput(element1,"Admin");
		waitUntilElementIsVisible(driver.findElement(By.id("username")));
		element1.clear();
		element1.sendKeys("Admin");
		
		WebElement element2=driver.findElement(By.id("password"));
		typeInput(element2,"admin");
		waitUntilElementIsVisible(driver.findElement(By.id("password")));
		element2.clear();
		element2.sendKeys("admin");
		
		clickOnElement(driver.findElement(By.tagName("button")));
		
		clickOnElement(driver.findElement(By.className("app-icon")));
		clickOnElement(driver.findElement(By.xpath("//span[text()=' MARKETING']")));
		clickOnElement(driver.findElement(By.xpath("//span[text()=' Leads']")));
		clickOnElement(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
				
		WebElement firstName=(driver.findElement(By.id("Leads_editView_fieldName_firstname")));
		firstName.sendKeys("Sai");
		WebElement lastName=(driver.findElement(By.id("Leads_editView_fieldName_lastname")));
		lastName.sendKeys("Desai");
		//clickOnElement(driver.findElement(By.xpath("//div[@id='select2-result-label-22']")));
		
		clickOnElement(driver.findElement(By.cssSelector("button[type='submit']")));
		
		clickOnElement(driver.findElement(By.xpath("//h4[text()=' Leads ']")));
		
		clickOnElement(driver.findElement(By.cssSelector(".listViewEntriesCheckBox")));
		clickOnElement(driver.findElement(By.id("Leads_listView_massAction_LBL_EDIT")));
		firstName.sendKeys("shlok");
		clickOnElement(driver.findElement(By.cssSelector("button[type='submit']")));
		//clickOnElement(driver.findElement(By.className("fa-user")));
		//clickOnElement(driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")));
		
	}
}
