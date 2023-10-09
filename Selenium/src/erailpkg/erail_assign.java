package erailpkg;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumUtil;

public class erail_assign {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://erail.in/");	
		String homeWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Tour Packages']")).click();
		Set<String> allwindow=driver.getWindowHandles();
		allwindow.remove(homeWindow);
		String tourewindow=allwindow.iterator().next();
		driver.switchTo().window(tourewindow);
		driver.findElement(By.xpath("//div[2]/div[2]/ul/li[2]/label/span")).click();
		
		System.out.println("**************Package_Name*********************************");

		List<WebElement> listcity = driver.findElements(By.cssSelector(".right-searchresult>div>div>:nth-child(2)>div>h5"));
		for(int i=0; i<listcity.size(); i++) {
			System.out.println(listcity.get(i).getText());
		}
		
		System.out.println("**************Prize*********************************");
		
		List<WebElement> listprize = driver.findElements(By.cssSelector(".right-searchresult>div>div>:nth-child(3)>div>strong"));
		for(int j=0; j<listprize.size(); j++) {
			System.out.println(listprize.get(j).getText());
		}


		driver.switchTo().window(homeWindow);

		WebElement element=driver.findElement(By.id("txtStationFrom"));
		element.clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Pune");	
		List<WebElement> formcity = driver.findElements(By.cssSelector(".autocomplete>div>div"));
		for(int i=0; i<formcity.size(); i++) {
			System.out.println(formcity.get(i).getText());	
		}formcity.get(0).click();


		WebElement element1=driver.findElement(By.id("txtStationTo"));
		element1.clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("G");
		List<WebElement> gocity = driver.findElements(By.xpath("/html/body/div[7]/div/div/div[1]/div[1]"));
		for(int i=0; i<gocity.size(); i++) {
			System.out.println(gocity.get(i).getText());	
		}gocity.get(0).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#tdDateFromTo>:nth-child(2)")).click();

		driver.findElement(By.cssSelector("#divCalender>center>table>tbody>tr>:nth-child(2)>table>tbody>:nth-child(6)>td")).click();
		List<WebElement> dateselete=driver.findElements(By.cssSelector(".stickyTrainListHeader>tbody>tr>td:nth-child(2)>a"));
		List<WebElement> datemonthselete=driver.findElements(By.cssSelector(".stickyTrainListHeader>tbody>tr>td:nth-child(1)>a"));

		System.out.println("*****************Train_Name*********************************");

		List<WebElement> trainname = driver.findElements(By.cssSelector("#divTrainsList>table>tbody>tr"));
		for(int t=0; t<trainname.size(); t++) {
			System.out.println(trainname.get(t).getText());	
		}



	}

}
