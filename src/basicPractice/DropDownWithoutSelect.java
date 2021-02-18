package basicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownWithoutSelect 
{

	WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void dropdownWithoutSelect()
	{
		
		driver.get("https://www.seleniumeasy.com/");
		
		driver.findElement(By.xpath("//li[@class=\"last expanded active dropdown\"]/child::a")).click();
		
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]/li"));
		
	
		for(int i=0;i<ele.size();i++)
		{
			
			if(ele.get(i).getText().contains("Java Tutorials for Selenium"))
			{
			
				ele.get(i).click();
				break;
				
			}
			
			
		}
	}
	
}
