

	package testcases;

	import org.openqa.selenium.By;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import Base.TestBase;
	import pages.loginPage;

	public class groupPageTest extends TestBase {
		loginPage login;
		
		@BeforeMethod(alwaysRun=true)
		public void setup() throws Exception
		{
			initialization();
			login = new loginPage();
		}
		
		@Test(groups= "smoke")
		public void verifyTitle()
		{
		  String expectedTitle = "Swag Labs";	
		  String actTitle =login.verifyTitle();
		  Assert.assertEquals(actTitle, expectedTitle);
		  
		}
		
		@Test(groups= "sanity")
		public void  verifyURL()
		{
			String expectedURL = "https://www.saucedemo.com/";
			String actURL = login.verifyURL();
			Assert.assertEquals(actURL, expectedURL);	
		}
		
		@Test(groups= "sanity")
		public void verifyTitleLogoTest()
		{
			 boolean expectedlogo = login.verifyTitleLogo();
			 Assert.assertEquals(true, expectedlogo);
		}
		
		
		@Test(groups= "smoke")
		public void verifybotlogoTest()
		{
			boolean expectedlogo = login.verifybotlogo();
			Assert.assertEquals(true, expectedlogo);
		}
		@Test(groups= "sanity")
		public void verifyloginTest() throws Exception
		{
		    String expectedusername = "https://www.saucedemo.com/inventory.html";
		    String actusername = login.verifylogin();
		    Assert.assertEquals(actusername, expectedusername);
		}
		
		
		@Test (groups= "smoke")
		public void verifyproductIcon() throws Exception
		{
			String expectedproductIcon = "PRODUCTS";
			String actproductIcon = login.productinventory();
			Assert.assertEquals(actproductIcon, expectedproductIcon);
		}
		
		
		
		@AfterMethod(alwaysRun= true)
		public void closebrowser() throws InterruptedException
		{
			Thread.sleep(1000);
			driver.close();
		}
		
		
		
		
		
	


	}


