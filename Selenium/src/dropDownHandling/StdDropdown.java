package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StdDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=setUp("chrome","https://demo.automationtesting.in/Register.html");
		List<WebElement> deviceList=driver.findElements(By.cssSelector(".ng-scope>#header>nav>div>.navbar-collapse.collapse.navbar-right>ul>li>a"));
		
		System.out.println("Device Count: "+deviceList.size());
		for(int i=0;i<deviceList.size();i++) {
			System.out.println(deviceList.get(i).getText());
		}	
		//Same Step1 And Step2 Follow for Month and Day also
		
		//step1: identify dropdown list
		
		WebElement year=driver.findElement(By.id("yearbox"));
		
		//Step2: create instance of Select class and pass above dropdown object to its constructor
		
		Select s1=new Select(year);
		System.out.println("Is multi-select allowed or not? "+s1.isMultiple());
		System.out.println("Default selected value is: "+s1.getFirstSelectedOption().getText());
		List<WebElement> yearList=s1.getOptions();
		System.out.println("Year count: "+yearList.size());
		
		for(int i=0;i<yearList.size();i++) {
			System.out.println(yearList.get(i).getText());
		}
		s1.selectByIndex(1);
		System.out.println("Select year from dropDown by using index:"+s1.getFirstSelectedOption().getText());
		s1.selectByValue("1925");
		System.out.println("Select year from dropDown by using value:"+s1.getFirstSelectedOption().getText());
		s1.selectByVisibleText("1925");
		System.out.println("Select year from dropDown by using Visible Text:"+s1.getFirstSelectedOption().getText());
		System.out.println("-----------------------------------------------------");
		
		WebElement month=driver.findElement(By.cssSelector("select[placeholder='Month']"));
		Select s2=new Select(month);
		System.out.println("Is multi-select allowed or not? "+s2.isMultiple());
		System.out.println("Default selected value is: "+s2.getFirstSelectedOption().getText());
		List<WebElement> monthList=s2.getOptions();
		System.out.println("Day count: "+monthList.size());
		
		for(int i=0;i<monthList.size();i++) {
			System.out.println(monthList.get(i).getText());
		}
		s2.selectByIndex(1);
		System.out.println("Select day from dropDown by using index:"+s2.getFirstSelectedOption().getText());
		s2.selectByValue("January");
		System.out.println("Select day from dropDown by using value:"+s2.getFirstSelectedOption().getText());
		s2.selectByVisibleText("January");
		System.out.println("Select day from dropDown by using Visible Text:"+s2.getFirstSelectedOption().getText());
		
		System.out.println("-----------------------------------------------------");
		
		WebElement day=driver.findElement(By.id("daybox"));
		Select s3=new Select(day);
		System.out.println("Is multi-select allowed or not? "+s3.isMultiple());
		System.out.println("Default selected value is: "+s3.getFirstSelectedOption().getText());
		List<WebElement> dayList=s3.getOptions();
		System.out.println("Day count: "+dayList.size());
		
		for(int i=0;i<dayList.size();i++) {
			System.out.println(dayList.get(i).getText());
		}
		s3.selectByIndex(1);
		System.out.println("Select day from dropDown by using index:"+s3.getFirstSelectedOption().getText());
		s3.selectByValue("13");
		System.out.println("Select day from dropDown by using value:"+s3.getFirstSelectedOption().getText());
		s3.selectByVisibleText("13");
		System.out.println("Select day from dropDown by using Visible Text:"+s3.getFirstSelectedOption().getText());
		System.out.println("-----------------------------------------------------");	
		
	}
		
	public static WebDriver setUp(String browserName,String url)
	{
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		return driver;	
	}	
}
