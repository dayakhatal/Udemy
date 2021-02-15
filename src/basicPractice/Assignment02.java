package basicPractice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment02

{

	WebDriver driver;

	@BeforeTest
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();



	}
	
	@Test
	public void dropDown()
	{
		driver.get("https://www.makemytrip.com/");
		

		
		driver.findElement(By.cssSelector("li[data-cy=\"account\"]")).click();
		
		driver.findElement(By.cssSelector("span[class=\"darkGreyText\"]")).click();

		//driver.findElement(By.cssSelector("driver.findElement(By.cssSelector(\"a[href*=\\\"giftcar\\\"]\")).click();")).click();
	//	driver.findElement(By.cssSelector("a[data-cy=\"submenu_InternationalHotels\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@data-cy=\"submenu_Giftcards\"]")).click();
		  /*List<WebElement> option=driver.findElements(By.cssSelector("a[class=\"appendBottom5 blackText\"]"));
		  
		 for(int i=0;i<option.size();i++)
			 
		 {
			
			String st= option.get(i).getText();
			 if(st.contains("Giftcards"))
			 {
			driver.findElements(By.cssSelector("a[class=\"appendBottom5 blackText\"]")).get(i).click();
			 }
		 }
			  
		}*/
		  
		  
		  
		 

	}	

	}
	



/*
 * @Test public void assigmnerPra() {
 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 * 
 * // driver.switchTo().alert().accept();
 * 
 * driver.findElement(By.cssSelector("input[id=\"DepartDate\"]")).click();
 * 
 * driver.findElement(By.cssSelector(
 * ".ui-state-default.ui-state-highlight.ui-state-active")).click();
 * 
 * WebElement ele1 =
 * driver.findElement(By.cssSelector("select[name=\"adults\"]"));
 * 
 * Select dp1 = new Select(ele1);
 * 
 * dp1.selectByIndex(3);
 * 
 * WebElement ele2 =
 * driver.findElement(By.cssSelector("select[name=\"childs\"]"));
 * 
 * Select dp2 = new Select(ele2);
 * 
 * dp2.selectByValue("4");
 * 
 * WebElement ele3 =
 * driver.findElement(By.cssSelector("select[name=\"infants\"]"));
 * 
 * Select dp3 = new Select(ele3);
 * 
 * dp3.selectByValue("1");
 * 
 * driver.findElement(By.cssSelector("a[id=\"MoreOptionsLink\"]")).click();
 * 
 * WebElement ele4 =
 * driver.findElement(By.cssSelector("select[name=\"class\"]"));
 * 
 * Select dp4 = new Select(ele4);
 * 
 * dp4.selectByVisibleText("First");
 * 
 * driver.findElement(By.cssSelector("input[name=\"airline\"]")).sendKeys(
 * "indigo");
 * 
 * driver.findElement(By.cssSelector("input[id=\"SearchBtn\"]")).click();
 * 
 * System.out.println(driver.findElement(By.cssSelector(
 * "div[id=\"homeErrorMessage\"]")).getText());
 * 
 * }
 * 
 */

