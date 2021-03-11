package basicPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HttpConnection;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BrockenLinkPractice 
{

	WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
	}
	
	@Test
	public void brockenLink() throws MalformedURLException, IOException
	{
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor sc=(JavascriptExecutor)driver;
		
		//sc.executeScript("");
		
		String st=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		HttpURLConnection com=(HttpURLConnection) new URL(st).openConnection();
		
		com.setRequestMethod("HEAD");
		com.connect();
		
		int sr=com.getResponseCode();
		
		System.out.println(sr);
	}
	
	
	
	
}
