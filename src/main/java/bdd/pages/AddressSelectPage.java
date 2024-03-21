/**
 * This page will select your delivery address.
 */
package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde.
 */
public class AddressSelectPage extends BaseClass {
	
	@FindBy(css="input#defaultBuyBtnBlockerMsg")
	WebElement selectAddressInput;
	
	@FindBy(css="input[data-testid=\"Address_selectShipToThisAddress\"]")
	WebElement useThisAddressBtn;
	

}
