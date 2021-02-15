package basicPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPra01 
{
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
	
		DropDownPra01 ob=new DropDownPra01();
		ob.dropDown();
	}
	
	
	public void dropDown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		
		
		
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@text=\"Chennai (MAA)\"])[2]")).click();
		//driver.navigate().to("");
		
		
		
	}
	
	
	
}
