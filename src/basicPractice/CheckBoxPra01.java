package basicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPra01 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		checkBox();
		
	}
	
	public static void checkBox()
	{

		System.out.println(driver.findElement(By.cssSelector(" input[id*=\"SeniorCitizenDiscount\"]")).isSelected());
		
		driver.findElement(By.cssSelector(" input[id*=\"SeniorCitizenDiscount\"]")).click();
		
		System.out.println(driver.findElement(By.cssSelector(" input[id*=\"SeniorCitizenDiscount\"]")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		
	} 
	
	
	
	
}
