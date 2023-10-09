package browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://demo.actitime.com/");
		System.out.println("title: "+driver.getTitle());
		String actualTitle=driver.getTitle();
		System.out.println("Length of the Title:"+actualTitle.length());
		System.out.println("current url: "+driver.getCurrentUrl());
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Length of the url:"+currentUrl.length());
		String expectedTitle="actiTIME - Login";
		System.out.println("is ActiTime page opened? "+expectedTitle.equals(actualTitle));
		String expectedUrl=driver.getCurrentUrl();
		System.out.println("Is same expectedUrl and CurrentUrl:"+expectedUrl.equals(currentUrl));
		driver.close();*/
	
		System.out.println("--------------------------------------------------------------");
		/*driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		System.out.println("title: "+driver.getTitle());
		String actualTitle=driver.getTitle();
		System.out.println("Length of the Title:"+actualTitle.length());
		System.out.println("current url: "+driver.getCurrentUrl());
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Length of the url:"+currentUrl.length());
		String expectedTitle="vtiger";
		System.out.println("is Vtiger page opened? "+actualTitle.equals(expectedTitle));
		String expectedUrl=driver.getCurrentUrl();
		System.out.println("Is same expectedUrl and CurrentUrl:"+currentUrl.equals(expectedUrl));
		driver.close();*/
		

		System.out.println("--------------------------------------------------------------");
		/*driver.get("https://flipkart.com/");
		System.out.println("title: "+driver.getTitle());
		String actualTitle=driver.getTitle();
		System.out.println("Length of the Title:"+actualTitle.length());
		System.out.println("current url: "+driver.getCurrentUrl());
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Length of the url:"+currentUrl.length());
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("is flipkart page opened? "+actualTitle.equals(expectedTitle));
		String expectedUrl=driver.getCurrentUrl();
		System.out.println("Is same expectedUrl and CurrentUrl:"+currentUrl.equals(expectedUrl));
		driver.close();*/

		System.out.println("--------------------------------------------------------------");
		/*driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("title: "+driver.getTitle());
		String actualTitle=driver.getTitle();
		System.out.println("Length of the Title:"+actualTitle.length());
		System.out.println("current url: "+driver.getCurrentUrl());
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Length of the url:"+currentUrl.length());
		String expectedTitle="OrangeHRM";
		System.out.println("is orangehrm page opened? "+actualTitle.equals(expectedTitle));
		String expectedUrl=driver.getCurrentUrl();
		System.out.println("Is same expectedUrl and CurrentUrl:"+currentUrl.equals(expectedUrl));
		driver.close();*/
		
		System.out.println("--------------------------------------------------------------");
		driver.get("https://www.amazon.in/");
		System.out.println("title: "+driver.getTitle());
		String actualTitle=driver.getTitle();
		System.out.println("Length of the Title:"+actualTitle.length());
		System.out.println("current url: "+driver.getCurrentUrl());
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Length of the url:"+currentUrl.length());
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println("is amazon page opened? "+actualTitle.equals(expectedTitle));
		String expectedUrl=driver.getCurrentUrl();
		System.out.println("Is same expectedUrl and CurrentUrl:"+currentUrl.equals(expectedUrl));
		driver.close();
	}

}

/**
 * automate following scenarios for the below mentioned application
 * 	1. https://demo.actitime.com/
 *  2. https://demo.vtiger.com/vtigercrm/index.php
 *  3. https://opensource-demo.orangehrmlive.com/
 *  4. https://flipkart.com/
 *  5. https://www.amazon.in/
 *  
 *  step1: open browse
 *  step2: enter application url
 *  Step3: print title and its length
 *  Step4: print current url and its length
 *  Step5: validate followings-
 *  			a. title
 *  			b. url
 *  Step6: close browser  
 */