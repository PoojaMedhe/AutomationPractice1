package testscriptsOrangeHrm;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.SeleniumUtil;
import webpagesOrangeHRM.OrangeHRM_DashboardPage;
import webpagesOrangeHRM.OrangeHrmAddEmployee;
import webpagesOrangeHRM.OrangeHrmEmployeeListPage;
import webpagesOrangeHRM.OrangeHrmLoginPage;
import webpagesOrangeHRM.OrangeHrmPersonalDeatailsPage;
import webpagesOrangeHRM.PIMpage;

public class NewPIMStepDef extends SeleniumUtil {
	WebDriver driver;
	OrangeHrmLoginPage getOrangeHRM_LoginPage;
	OrangeHRM_DashboardPage getOrangeHRM_DashboardPage;
	OrangeHrmEmployeeListPage getOrangeHRM_EmployeeList;
	OrangeHrmAddEmployee getOrangeHRM_AddEmployee;
	PIMpage getOrange_PIM;
	OrangeHrmPersonalDeatailsPage getOrangeHRM_PersonalDetails;


	@Given("user is already in OrangeHRM login page")
	public void user_is_already_in_orange_hrm_login_page() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		// initialize your required WebPage class
		getOrangeHRM_LoginPage = new OrangeHrmLoginPage(driver);
		getOrangeHRM_DashboardPage = new OrangeHRM_DashboardPage(driver);
		getOrangeHRM_EmployeeList = new OrangeHrmEmployeeListPage(driver);
		getOrangeHRM_AddEmployee = new OrangeHrmAddEmployee(driver);
		getOrange_PIM = new PIMpage(driver);
		getOrangeHRM_PersonalDetails = new OrangeHrmPersonalDeatailsPage(driver);
		
	}

	@Given("logged in with valid username and password")
	public void logged_in_with_valid_username_and_password() {
		getOrangeHRM_LoginPage.loginInOrangeHrmApplication("Admin", "admin123");
	}

	@Given("click on PIM link")
	public void click_on_pim_link() {
		getOrangeHRM_DashboardPage.clickOnPIM();
	}

	@When("User click on AddEmployee menu")
	public void user_click_on_add_employee_menu() {
		getOrange_PIM.clickOnAddEmployee();
		
	}

	@When("enters firstname, lastname click on save button")
	public void enters_firstname_lastname_click_on_save_button() throws Throwable {
		getOrangeHRM_AddEmployee.clickOnSaveBtn();
	
	}
	@When("close the browser for OrangeHRM")
	public void close_the_browser_for_orange_hrm() {
		
		 cleanUp(); 
		
	}
	
	@When("user click on EmployeeList menu and type name in hint and click on search button")
	public void user_click_on_employee_list_menu_and_type_name_in_hint_and_click_on_search_button() {
		getOrangeHRM_EmployeeList.clickOnEmpList();
	}
	

	@When("click on edit button and update middle name in personal Details and click on Save button")
	public void click_on_edit_button_and_update_middle_name_in_personal_details_and_click_on_save_button() throws Throwable {
		getOrangeHRM_EmployeeList.clickOnRecordAndEditBtn();
		getOrangeHRM_PersonalDetails.editMiddleName();	
		
	}

	@When("user click on EmployeeList menu and type hint and click on search button")
	public void user_click_on_employee_list_menu_and_type_hint_and_click_on_search_button() {
		getOrangeHRM_EmployeeList.clickOnEmpList();
	}

	@When("select checkbox  and click on delete button")
	public void select_checkbox_and_click_on_delete_button() {
		getOrangeHRM_EmployeeList.deleteFoundRecord();
		
	}

	@When("click on yes as given delete popup")
	public void click_on_yes_as_given_delete_popup() {
		getOrangeHRM_EmployeeList.clickOnPopup();
	}
	

	@When("LogOut OrangeHRM Application")
	public void LogOut_OrangeHRM_Application() {
		getOrange_PIM.logoutFromApplication();
		
	}
	

}
