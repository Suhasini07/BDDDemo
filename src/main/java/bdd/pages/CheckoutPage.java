/**
 * This page will check functionality of checkout.
 */
package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde.
 */
public class CheckoutPage extends BaseClass {
	
	@FindBy(css="#address-list > div > div:nth-child(1) > div > fieldset:nth-child(1) > div.a-row.address-row.list-address-selected > span > div > label > input[type=radio]")
	
	WebElement selectAddress;
	
	
	
	

}
