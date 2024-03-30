package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.actiondriver.Action;
import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde
 */

public class AddToCartPage {

	@FindBy(css = "#NATC_SMART_WAGON_CONF_MSG_SUCCESS > h1")
	WebElement addToCartMsg;

	@FindBy(css = "#sc-buy-box-ptc-button > span > input")
	WebElement proceedToBuyBtn;

	public AddToCartPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public boolean validateAddToCartMessage() {

		return addToCartMsg.isDisplayed();

	}

	public CheckoutPage clickOnCheckOutBtn() {

		Action.click(BaseClass.driver, proceedToBuyBtn);
		return new CheckoutPage();

	}

}
