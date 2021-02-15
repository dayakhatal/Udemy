package basicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertPractice
{
	WebDriver driver; 
	
	@BeforeTest
	public void lunchBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	}
	

	@Test
	public void alertPractice()
	{
		
		driver.findElement(By.id("name")).sendKeys("This is alert practice");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input[id=\"alertbtn\"]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		
		driver.findElement(By.id("confirmbtn")).click();
		
		driver.switchTo().alert().accept();
		
		
		
	}



}
