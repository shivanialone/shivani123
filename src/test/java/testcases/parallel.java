package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel {
	@Test
	public void setup1()
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.close();
	}
	@Test
	public void setup2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.close();
	}
	@Test
	public void setup3()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.close();
	}
	@Test
	public void setup4()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.close();
	}
}
