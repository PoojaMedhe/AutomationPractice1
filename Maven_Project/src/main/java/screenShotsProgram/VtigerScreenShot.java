package screenShotsProgram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class VtigerScreenShot {

	public static void main(String[] args) throws Throwable {
		SeleniumUtil s1=new SeleniumUtil();
		WebDriver driver = s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");

		// convert driver instance into TakeScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		// get screenshot in the form of File
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		
		// store screenshot into the required location
		FileUtils.copyFile(f1, new File(".\\screenshots\\Vtiger.jpg"));

		
	}

}
