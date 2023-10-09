package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeCreateAndDeleteTask {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome","https://demo.actitime.com/");
		driver.findElement(By.className("tasks")).click();
		WebElement addNew=driver.findElement(By.className("ellipsis"));
		addNew.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.findElement(By.className("createNewTasks")).click();
		driver.findElement(By.cssSelector(".customerSelector>div>.comboboxButton>.selectedItem")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".customerSelector .searchItemList")));
		List<WebElement> customerList=driver.findElements(By.cssSelector(".customerSelector .searchItemList>div:nth-child(1)"));
		/*if(customerList.size()>2) {
			customerList.get(customerList.size()-1).click();
			driver.findElement(By.cssSelector(".projectSelector>div .comboboxButton .selectedItem")).click();
			List<WebElement> projectList=driver.findElements(By.cssSelector(".projectSelector .searchItemList>div"));
			if(projectList.size()>3) {
				projectList.get(3).click();
			}else {
				projectList.get(0).click();
				driver.findElement(By.cssSelector(".selectProjectRow .newProject")).sendKeys("Samsung");
			}
		}else {
			customerList.get(0).click();
			List<WebElement> newInputFeild=driver.findElements(By.cssSelector(".newCustomerProjectField "));
			newInputFeild.get(0).sendKeys("Samsung");
			newInputFeild.get(1).sendKeys("Samsung m13");
			
		}*/
		
		//driver.findElement(By.cssSelector("div>.scrollableDropdownView>div>div>div>div:nth-child(6)"));
		driver.findElement(By.cssSelector(".nameCell.first>.inputFieldWithPlaceholder")).sendKeys("Automation123");
		driver.findElement(By.cssSelector("tbody>tr:nth-child(1)>.billingTypeCell>.typeOfWorkButton.editable>div")).click();
		driver.findElement(By.cssSelector("tbody>tr:nth-child(1)>.billingTypeCell>div:nth-child(1)>div>div:nth-child(1)>div>div:nth-child(1)>div:nth-child(11)")).click();
		//driver.findElement(By.xpath("/html/body/div[53]/div/div[2]/div[2]/div[1]/div/div[1]")).click();
		driver.findElement(By.cssSelector("#createTasksPopup>#createTasksPopup_content>.basicLightboxFooter .buttonsBox .commitButtonPlaceHolder .components_button ")).click();
		//driver.findElement(By.cssSelector("//#createTasksPopup>#createTasksPopup_content>.basicLightboxFooter>.buttonsBox>div:nth-child(3)>div")).click();
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
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			return driver;	

	}

}



