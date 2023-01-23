package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.readData;

public class TestBase {
     public static WebDriver driver;
	public void initialization() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		//driver.get("https://www.saucedemo.com/");
		driver.get(readData.readProperty("URL"));
        driver.manage().window().maximize();
        //shivani123
		//hopeless sumit
		
	}

	
	
	
	
}
