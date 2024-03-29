package screenShotsProgram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class GoogleAndActitimeScreenShot {

	public static void main(String[] args) throws IOException {

		SeleniumUtil s1=new SeleniumUtil();
		WebDriver driver = s1.setUp("chrome", "https://demo.actitime.com/login.do");

		// convert driver instance into TakeScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		// get screenshot in the form of File
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		// store screenshot into the required location
		FileUtils.copyFile(f1, new File(".\\screenshots\\actitime.jpg"));

		driver.navigate().to("https://www.google.com");
		// store screenshot into the required location
		s1.takeScreenShot(".\\screenshots\\google.jpg");
	}

}