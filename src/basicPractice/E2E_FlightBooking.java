package basicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class E2E_FlightBooking 
{
	WebDriver driver;

	@BeforeMethod
	public void lunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		
		
	}
	
	
	@Test
	public void bookFlight()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		
		driver.findElement(By.xpath("(//a[@text=\"Chennai (MAA)\"])[2]")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5"))
		{
			
			System.out.println("is desabled");
			Assert.assertTrue(true);
			
		}
		else
		{
			
			System.out.println("Is Enabled");
			Assert.assertTrue(false);
			
		}
		
	
		
		driver.findElement(By.cssSelector("input[id*=\"friendsandfamily\"]")).click();
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		WebElement ele=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		
		Select sel=new Select(ele);
		
		sel.selectByIndex(3);
		
		driver.findElement(By.id("divpaxinfo")).click();

		WebElement ele1=driver.findElement(By.cssSelector("select[name*=\"DropDownListCurrency\"]"));
		
		
		Select select=new Select(ele1);
		
		select.selectByIndex(3);
		
		
		driver.findElement(By.cssSelector("input[name*=\"btn_FindFlights\"]")).click();
		
		driver.findElement(By.cssSelector("input[id*=\"FamilyAndFriendsAgreement\"]")).click();
		
	}
	
	
	
	
	
	
}
