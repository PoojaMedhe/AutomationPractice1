package dependent_independent_Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_amazon {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome","https://www.amazon.in/gcx/Gifts-for-Everyone/gfhz/?ref_=nav_cs_giftfinder&scrollState=eyJpdGVtSW5kZXgiOjAsInNjcm9sbE9mZnNldCI6LTEyLjk4NDM3NX0%3D&sectionManagerState=eyJzZWN0aW9uVHlwZUVuZEluZGV4Ijp7ImFtYWJvdCI6MH19");
		WebElement rakhiPrice=driver.findElement(By.xpath("//div[div[span[text()='Sukkhi Rakhi Elegant Floral Kundan Designer Gold Plated Premium Rakhi for Brother With Roli Chawal & Greeting Card | Rakhi for Bhaiya | Rakhi for MEN | Kundan Rakhi | (RAK73480)']]]/div[2]"));
		System.out.println(rakhiPrice.getText());
		
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
