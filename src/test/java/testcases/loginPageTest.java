package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.loginPage;
import utility.UtilityMethod;

public class loginPageTest extends TestBase {
	loginPage login;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new loginPage();
	}
	
	@Test(priority=5,enabled= true)
	public void verifyTitle()
	{
	  String expectedTitle = "Swag Labs";	
	  String actTitle =login.verifyTitle();
	  Assert.assertEquals(actTitle, expectedTitle);
	  
	}
	
	@Test(priority=4,enabled= true)
	public void  verifyURL()
	{
		String expectedURL = "https://www.saucedemo.com/";
		String actURL = login.verifyURL();
		Assert.assertEquals(actURL, expectedURL);	
	}
	
	@Test(priority=3,enabled= true)
	public void verifyTitleLogoTest()
	{
		 boolean expectedlogo = login.verifyTitleLogo();
		 Assert.assertEquals(true, expectedlogo);
	}
	
	
	@Test(priority=2,enabled= false)
	public void verifybotlogoTest()
	{
		boolean expectedlogo = login.verifybotlogo();
		Assert.assertEquals(true, expectedlogo);
	}
	@Test(priority=1,enabled= false)
	public void verifyloginTest() throws Exception
	{
	    String expectedusername = "https://www.saucedemo.com/inventory.html";
	    String actusername = login.verifylogin();
	    Assert.assertEquals(actusername, expectedusername);
	}
	
	
	@Test (priority=-500,enabled= true)
	public void verifyproductIcon() throws Exception
	{
		String expectedproductIcon = "1PRODUCTS";
		String actproductIcon = login.productinventory();
		Assert.assertEquals(actproductIcon, expectedproductIcon);
	}
	
	
	
	@AfterMethod
	public void closebrowser(ITestResult abc) throws Exception  
	{
		if(ITestResult.FAILURE==abc.getStatus())
			UtilityMethod.screenshot(abc.getName());
		driver.close();
	}
	
	
	
	
	
	
}
