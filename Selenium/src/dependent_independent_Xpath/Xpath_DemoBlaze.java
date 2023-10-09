package dependent_independent_Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_DemoBlaze {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome","https://www.demoblaze.com/");
		WebElement samsungNamePrice=driver.findElement(By.xpath("//div[h4[a[text()='Samsung galaxy s6']]]/h5"));
		System.out.println(samsungNamePrice.getText());
		
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
