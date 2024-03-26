package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.actiondriver.Action;
import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde
 */

public class AddToCartPage  {

	@FindBy(css = "select#quantity")
	WebElement quantity;

	@FindBy(css = "#add-to-cart-button")
	WebElement addToCartBtn;
	
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(10) > div > div > span > div > div > div > div.puisg-col.puisg-col-4-of-12.puisg-col-8-of-16.puisg-col-12-of-20.puisg-col-12-of-24.puis-list-col-right > div > div > div.a-section.a-spacing-none.puis-padding-right-small.s-title-instructions-style > h2 > a > span")
	WebElement searchedProduct;

	@FindBy(css = "#attachDisplayAddBaseAlert > div > h4")
	WebElement addToCartMessage;

	@FindBy(css = "#attach-sidesheet-checkout-button > span")
	WebElement checkOutBtn;

	public AddToCartPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

//	public void selectQuantity(String number)
//	{
//		quantity.sendKeys(number);
//	}

	public void clickOnAddToCart() {
		BaseClass.driver.switchTo().frame(0).switchTo().frame(0).switchTo().frame(0);
		//BaseClass.driver.switchTo().frame(0);
		//BaseClass.driver.switchTo().frame(0);

		Action.scrollPage(BaseClass.driver,addToCartBtn);

		Action.click(BaseClass.driver, addToCartBtn);

	}

	public boolean validateAddToCartMessage() {
		BaseClass.driver.switchTo().frame(0);

		return addToCartMessage.isDisplayed();

	}

	public CheckoutPage clickOnCheckOutBtn() {
		BaseClass.driver.switchTo().frame(0);

		Action.click(BaseClass.driver, checkOutBtn);
		return new CheckoutPage();

	}

}
