package excelTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtil;

public class VtigerExcel extends SeleniumUtil{
	String appUrl;
	String userName;
	String password;
	static int row=1;
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
	public void vtigerLogin() {
		setUp("chrome", appUrl);
		driver.findElement(By.id("username")).clear();
		typeInput(driver.findElement(By.id("username")),userName);
		 
		driver.findElement(By.id("password")).clear();
		typeInput(driver.findElement(By.id("password")),password);
		 
		 clickOnElement(driver.findElement(By.tagName("button")));
	   actualTitle=getCurrentPageTitle("Dashboard");
		Assert.assertEquals(actualTitle, "Dashboard");
}
	@AfterMethod
	public void cleanUp() {
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 4, actualTitle);
		if(actualTitle.equals("Dashboard")) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 5,"Passed");
		}else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 5,"failed");
		}
		cleanUp();
		++row;
	}

}
