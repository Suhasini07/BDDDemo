package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde
 */

public class AddToCartPage extends BaseClass {
	
	@FindBy(css="select#quantity")
	WebElement quantity;
	
	@FindBy(css="input[id=\"add-to-cart-button\"][class=\"a-button-input attach-dss-atc\"]")
	WebElement addToCartBtn;
	
	@FindBy(css="#attachDisplayAddBaseAlert > div > h4")
	WebElement addToCartMessage;
	
	@FindBy(css="#attach-sidesheet-checkout-button > span")
	WebElement checkOutBtn;
	
	public AddToCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void selectQuantity(String number)
//	{
//		quantity.sendKeys(number);
//	}
	
	public void clickOnAddToCart() {
		driver.switchTo().frame(0);
		addToCartBtn.click();

	}
	
	public boolean validateAddToCartMessage() {
		return addToCartMessage.isDisplayed();	

	}
	
	public CheckoutPage clickOnCheckOutBtn() {
		checkOutBtn.click();
		return new CheckoutPage();

	}
	

}
