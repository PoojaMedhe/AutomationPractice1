package multipleElementsHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationRegistration {

	public static void main(String[] args) {
		
		WebDriver driver=setUp("chrome","https://demo.automationtesting.in/Register.html");
		List<WebElement> deviceList=driver.findElements(By.cssSelector(".ng-scope>#header>nav>div>.navbar-collapse.collapse.navbar-right>ul>li>a"));
		
		System.out.println("Device Count: "+deviceList.size());
		for(int i=0;i<deviceList.size();i++) {
			System.out.println(deviceList.get(i).getText());
		}		
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
