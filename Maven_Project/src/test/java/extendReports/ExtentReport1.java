package extendReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport1 {
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest() {
		report=new ExtentReports(".\\ExtentReport\\ExtentReports1.html");
		test=report.startTest("ExtentDemo");
		
	}

	@Test
	public static void extendReportsDemo() {
		System.setProperty("WebDriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		if(driver.getTitle().equals("Google")) {
			test.log(LogStatus.PASS, "Navigate to URL");
		}else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		
	}
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
}
