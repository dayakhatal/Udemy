package basicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAssignment 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		checkBox();
		
	}
	
	public static void checkBox()
	{

		
		System.out.println(driver.findElement(By.cssSelector("input[value=\"option1\"]")).isSelected());
		
		driver.findElement(By.cssSelector("input[value=\"option1\"]")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[value=\"option1\"]")).isSelected());
		
		//driver.findElement(By.cssSelector("input[value=\"option1\"]"));
		
		System.out.println(driver.findElements(By.cssSelector("input[type*=\"checkbox\"]")).size());
	} 
	
	
	
	
}
