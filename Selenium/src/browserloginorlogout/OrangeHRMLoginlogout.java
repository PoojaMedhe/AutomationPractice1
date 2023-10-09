package browserloginorlogout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginlogout {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("Title: "+driver.getTitle());
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="OrangeHRM";
		System.out.println("Is OrangeHRM Page Open??? "+ActualTitle.equals(ExpectedTitle));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
