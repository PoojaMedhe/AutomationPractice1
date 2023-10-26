/*package testscriptsOrangeHrm;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;
import webpagesOrangeHRM.OrangeHRM_DashboardPage;
import webpagesOrangeHRM.OrangeHrmAddEmployee;
import webpagesOrangeHRM.OrangeHrmEmployeeListPage;
import webpagesOrangeHRM.OrangeHrmLoginPage;
import webpagesOrangeHRM.OrangeHrmPersonalDeatailsPage;
import webpagesOrangeHRM.PIMpage;

public class StepDefinationOrangePIM extends SeleniumUtil {
	WebDriver driver;
	OrangeHrmLoginPage getOrangeHRM_LoginPage;
	OrangeHRM_DashboardPage getOrangeHRM_DashboardPage;
	OrangeHrmEmployeeListPage getOrangeHRM_EmployeeList;
	OrangeHrmAddEmployee getOrangeHRM_AddEmployee;
	PIMpage getOrange_PIM;
	OrangeHrmPersonalDeatailsPage getOrangeHRM_PersonalDetails;

	@BeforeTest
	public void precondition() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		// initialize your required WebPage class
		getOrangeHRM_LoginPage = new OrangeHrmLoginPage(driver);
		getOrangeHRM_DashboardPage = new OrangeHRM_DashboardPage(driver);
		getOrangeHRM_EmployeeList = new OrangeHrmEmployeeListPage(driver);
		getOrangeHRM_AddEmployee = new OrangeHrmAddEmployee(driver);
		getOrange_PIM = new PIMpage(driver);
		getOrangeHRM_PersonalDetails = new OrangeHrmPersonalDeatailsPage(driver);

	}

	@Test
	public void testLoginLogout() {
		
		getOrangeHRM_LoginPage.loginInOrangeHrmApplication("Admin", "admin123");
		String expectedHomeUrl = "dashboard";
		String actualHomeUrl = getApplicationUrl();
		Assert.assertTrue(actualHomeUrl.contains(expectedHomeUrl), "Home page not opened");

	}

	@Test(priority = 1)
	public void testClickPIM() throws Throwable {
		getOrangeHRM_DashboardPage.clickOnPIM();
		getOrange_PIM.clickOnAddEmployee();
		getOrangeHRM_AddEmployee.clickOnSaveBtn();		
	}
	
	@Test(priority = 2)
	public void testClickPersonalDetails() throws Throwable {
		getOrangeHRM_PersonalDetails.clickOnEditBtn();
		Thread.sleep(1000);

	}
	
	@Test(priority = 3)
	public void testClickDeleteRecord() throws Throwable {
		getOrangeHRM_EmployeeList.clickOnDeleteBtn();
		getOrangeHRM_EmployeeList.deleteFoundRecord();
		Thread.sleep(1000);
		
	}
	 @AfterTest 
	 public void postCondition() {
	 getOrangeHRM_DashboardPage.logoutFromApplication(); 
	 cleanUp(); 
	 }
	
}*/
/*
public class TestOrangeHrmPim extends Utility.SeleniumUtility{
	OrangeHRM_LoginPage getLoginPage;
	HomePage getHomePage;
	OrangeHRM_PIMPage getPimHomePage;
	UpdateEmployeeDetailsPage getUpdateEmployeeDetailsPage;
	AddEmployeePage getAddEmployeePage;
	@BeforeMethod
	public void precondition() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		getLoginPage=new OrangeHRM_LoginPage(driver);
		getHomePage=new HomePage(driver);
		getPimHomePage=new OrangeHRM_PIMPage(driver);
		getAddEmployeePage=new AddEmployeePage(driver);
		getLoginPage.loginInOrangeHrmApplication("Admin", "admin123");
		getHomePage.clickOnPIM();
		getUpdateEmployeeDetailsPage=new UpdateEmployeeDetailsPage(driver);
	}
	@Test
	public void createPIM() {
		getPimHomePage.clickOnAddButton();
		getAddEmployeePage.createEmployee("Bhagyashri", "Shinde", 3399);
		getHomePage.clickOnPIM();
		getPimHomePage.searchCreatedEmployee(3399);
	
	}
	@Test(priority=1)
	public void editPIM() {
		getHomePage.clickOnPIM();
		getPimHomePage.searchCreatedEmployee(3399);
		getPimHomePage.editCreatedEmployee("job title");
		getUpdateEmployeeDetailsPage.updateEployeeinfo("job title");
	}
	
	@Test(priority=2)
	public void deletePIM() {
		getHomePage.clickOnPIM();
		getPimHomePage.searchCreatedEmployee(3399);
		getPimHomePage.deleteCreatedEmployee();
		
	}
	@AfterMethod
	public void postcondition() {
		getHomePage.logout();
		cleanUp();
	}
}*/