package orangehrmtask;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.SeleniumUtil;

public class OrangeHRMTask {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.cssSelector("div>aside>nav>div:nth-child(2)>ul>li:nth-child(2)")).click();
		driver.findElement(By.cssSelector("header>.oxd-topbar-body>nav>ul>li:nth-child(3)")).click();
		driver.findElement(By.name("firstName")).sendKeys("Aayush");
		driver.findElement(By.name("lastName")).sendKeys("Desai");
		WebElement E_id=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
		E_id.clear();
		E_id.sendKeys("0123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector("div>aside>nav>div:nth-child(2)>ul>li:nth-child(2)")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Aayush");
		driver.findElement(By.cssSelector(".orangehrm-left-space")).click();
		driver.findElement(By.cssSelector(".oxd-checkbox-input")).click();
		driver.findElement(By.cssSelector(".oxd-button--label-danger")).click();
		driver.findElement(By.cssSelector(".oxd-sheet>:last-child>:last-child")).click();
		driver.findElement(By.cssSelector("header>.oxd-topbar-body>nav>ul>li:nth-child(2)")).click();
		
	
	}
	
	
}

