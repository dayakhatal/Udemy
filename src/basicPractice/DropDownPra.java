package basicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPra 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		DropDownPra ob=new DropDownPra();
		ob.dynamicAutosuggust();
		//ob.staticDropdown();
		
		//ob.increDropdown();
		//ob.closeBrowser();


	
	}
	
	
	public void staticDropdown()
	{

		
		
		WebElement select=driver.findElement(By.xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]"));
		
		Select sel=new Select(select);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		sel.selectByIndex(2);

		sel.selectByVisibleText("INR");
		
		sel.selectByValue("AED");
	}
	
	public void increDropdown()
	{
		
		driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
		
		for(int i=0;i<4;i++)
		{
			
			driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
			
		}
		
		
	}
	
	public void dynamicDropDown() throws InterruptedException
	{
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@text=\"Chennai (MAA)\"])[2]")).click();
		
		
		
		
	}
	
	public void dynamicAutosuggust() throws InterruptedException
	{
		driver.findElement(By.id("autosuggest")).sendKeys("ind");;
	
		Thread.sleep(2000);
	
		

		List<WebElement> option=driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
		
		for(WebElement st : option)
		{
			
			if(st.getText().equalsIgnoreCase("India"))
			{
				
				st.click();
				 
				
			}
			
			
			
			
		}
		
	}
	
	
	public void closeBrowser()
	{
		
		driver.close();
		
		
	}
	
	
}
