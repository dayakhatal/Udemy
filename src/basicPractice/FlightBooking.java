package basicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import  org.testng.Assert;;



public class FlightBooking {

	static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		
		bookFlight();

	}



	public static void bookFlight() throws InterruptedException
	{
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	
		//driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@text=\"Chennai (MAA)\"])[2]")).click();
		
		
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			
			System.out.println("is enabled");
			
			Assert.assertTrue(true);
		}

		else
		{
			System.out.println("Not enabled" );
			Assert.assertTrue(false);

		}
	}
	


}
