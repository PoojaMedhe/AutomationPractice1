package excelTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtil;

public class OrangeHRMValidCredentials extends SeleniumUtil{
	String appUrl;
	String userName;
	String password;
	static int row=5;
	static String expectecTitle;
	static String actualTitle;
	@BeforeMethod
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\Book1.xlsx","Sheet1", row, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 2);
		expectecTitle=ExcelUtility.getCellValue(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 3);

}
	@Test
	public void OrangeHRM() {
		setUp("chrome", appUrl);
		typeInput(driver.findElement(By.name("username")),userName);
		typeInput(driver.findElement(By.name("password")),password);
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		
	   actualTitle=getCurrentPageTitle("OrangeHRM");
		Assert.assertEquals(actualTitle, "OrangeHRM");
}
	@AfterMethod
	public void cleanUp() {
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 4, actualTitle);
		if(actualTitle.equals("OrangeHRM")) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 5,"Passed");
		}else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 5,"failed");
		}
		cleanUp();
		++row;
	}

}
