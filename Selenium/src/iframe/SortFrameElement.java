package iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.SeleniumUtil;

public class SortFrameElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		driver.switchTo().frame(0);
		Actions actions=new Actions(driver);
		List<WebElement> items=driver.findElements(By.xpath("//html/body/ul/li"));
		System.out.println("No of Items present in Sortable Menu: "+items.size());
		for(int i=0;i<items.size();i++)
		{
		System.out.println(items.get(i).getText());
		}
		
		WebElement itemSource1=items.get(6);
		WebElement itemDestination=items.get(0);
		actions.dragAndDrop(itemSource1, itemDestination).build().perform();
		
		WebElement itemSource2=items.get(5);
		actions.dragAndDrop(itemSource2, itemDestination).build().perform();
		
		WebElement itemSource3=items.get(4);
		actions.dragAndDrop(itemSource3, itemDestination).build().perform();
		
		WebElement itemSource4=items.get(3);
		actions.dragAndDrop(itemSource4, itemDestination).build().perform();
		
		WebElement itemSource5=items.get(2);
		actions.dragAndDrop(itemSource5, itemDestination).build().perform();
		
		WebElement itemSource6=items.get(1);
		actions.dragAndDrop(itemSource6, itemDestination).build().perform();
		
		
	}

}
