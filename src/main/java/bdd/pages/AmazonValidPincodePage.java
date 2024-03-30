
/**
 * 
 */
package bdd.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.actiondriver.Action;
import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde.
 */
public class AmazonValidPincodePage extends BaseClass {

	@FindBy(css = "#contextualIngressPtPin")
	WebElement deliverTo;

	@FindBy(css = "#GLUXZipUpdateInput")
	WebElement EnterPincodeField;

	@FindBy(css = "#GLUXZipUpdate > span > input")
	WebElement applyButton;

	public AmazonValidPincodePage() {
		PageFactory.initElements(driver, this);
	}

//	public void clickOnDeliverTo()
//	{
//		Action.clickElementByJS(driver, deliverTo);
//	}
//	
	public void enterPincode(String pincode) {
		EnterPincodeField.sendKeys(pincode);
		Action.clickElementByJS(driver, applyButton);
	}

}
