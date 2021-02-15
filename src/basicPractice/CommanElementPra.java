package basicPractice;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommanElementPra 

{

	
	static WebDriver driver;
	
	@BeforeTest
	public void lauchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
		
	@Test
	public void commanElepra() 
	{
		
		int j=0;
		String veges[]= {"Beetroot","Banana","Beans","Mushroom"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> ele=driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0;i<ele.size();i++)
		{
			
			
			String prod[]=ele.get(i).getText().split("-");
			
			String neprod=prod[0].trim();
			
			List ls=Arrays.asList(veges);
			
			if(ls.contains(neprod))
			{
				j++;
				driver.findElements(By.xpath("//div[@class=\"product-action\"]")).get(i).click();
				
			
				if(j==4)
				{
					
					break;
					
				}
			
			
			}
			
		}
		
	}

}
