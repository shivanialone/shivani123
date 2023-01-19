package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

import utility.UtilityMethod;

public class InventaryPage  extends TestBase {
	@FindBy (xpath= "//div[@Class='peek']") private WebElement Peeklogo;
	@FindBy (xpath = "//div[@Class='app_logo']") private WebElement SwagLabs;
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement RedTshirt;
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement FleeceJacket;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement BoltTshirt;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement LabsBackpack;
	@FindBy(xpath = "//select[@Class='product_sort_container']") private WebElement ProductContainerCard;
	@FindBy (xpath = "//a[@Class='shopping_cart_link']") private WebElement shopingcard;
	public InventaryPage()
	{
		PageFactory.initElements(driver, this);
	}

	public boolean PeeklogoVerify()
	{
		return Peeklogo.isDisplayed();
		
	}
	public boolean SwagLabsVerify()
	{
		return SwagLabs.isDisplayed();
	}
	
	public String AddProduct() throws Exception
	{
		UtilityMethod.SelectClass(ProductContainerCard,"Name (Z to A)");
        Thread.sleep(5000);
		RedTshirt.click();
		FleeceJacket.click();
		BoltTshirt.click();
		LabsBackpack.click();
		Thread.sleep(5000);
		return shopingcard.getText();
	}
}