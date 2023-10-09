package browserloginorlogout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTigerLoginLogout {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Title: "+driver.getTitle());
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="vtiger";
		System.out.println("Is vtiger Page Open??? "+ActualTitle.equals(ExpectedTitle));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.className("fa-user")).click();
		driver.findElement(By.linkText("Sign Out")).click();
	  
	}

}
