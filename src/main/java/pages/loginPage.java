package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import utility.readData;

public class loginPage extends TestBase {

	@FindBy(xpath="//div[@class='login_logo']") private WebElement TileLogo;
	@FindBy(xpath="//div[@class='bot_column']") private WebElement botlogo;
	@FindBy(xpath="//input[@name='user-name']") private WebElement username;
	@FindBy(xpath="//input[@name='password']")  private WebElement password;
	@FindBy(xpath="//input[@name='login-button']")private WebElement login;
	@FindBy(xpath="//span[@class='title']")private WebElement productIcon;
	public loginPage()
	{
	    PageFactory.initElements(driver, this);	
	}
	
	
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}

	public String verifyURL()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean verifyTitleLogo()
	{
		return TileLogo.isDisplayed();

	}
	
	public boolean verifybotlogo()
	{
		return botlogo.isDisplayed();
	}
	
	public String verifylogin() throws Exception
	{
	/*	username.sendKeys(readData.readProperty("Username"));
		password.sendKeys(readData.readProperty("password"));*/
		username.sendKeys(readData.readExel(0,0));
		password.sendKeys(readData.readExel(1,0));
		login.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	 
	public String productinventory() throws Exception
	{
		verifylogin();
		return productIcon.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
