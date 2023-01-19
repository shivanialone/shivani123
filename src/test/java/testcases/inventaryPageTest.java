package testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventaryPage;
import Pages.LoginPage;
import pages.loginPage;

public class inventaryPageTest extends  TestBase {
	 loginPage login;
	 InventaryPage Invent;
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception
	{
	initialization();
	login = new loginPage();
	 Invent = new InventaryPage();
	login.verifylogin();
	}
	
	@Test (groups = {"Sanity", "Regression"})
public void	PeeklogoTest()
{
		boolean value = Invent.PeeklogoVerify();
		Assert.assertEquals(value, true);
		Reporter.log("Peek logo =" + value);
}
	@Test (groups = {"Sanity", "Regression"})
	public void SwagLabsVerifyTest()
	{
		 boolean value = Invent.SwagLabsVerify();
		 Assert.assertEquals(value, true);
		 Reporter.log("swaglabs =" + value);
	}
	@Test
	
		public void ProductContainerCard() throws Exception
		{
		String value = Invent.AddProduct();
		Assert.assertEquals("4", value);
		Reporter.log("Product="+ value);
	}
	
	
	
	@AfterMethod (alwaysRun = true)
	public void closedBrowser()
	{
		driver.close();
	
