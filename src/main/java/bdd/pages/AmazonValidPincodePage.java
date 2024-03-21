
/**
 * 
 */
package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde.
 */
public class AmazonValidPincodePage extends BaseClass {
	
	@FindBy(css="#contextualIngressPtLabel_deliveryShortLine > span:nth-child(1)")
	WebElement deliverTo;
	
	@FindBy(css="#GLUXZipUpdateInput")
	WebElement EnterPincodeField;
	
	@FindBy(css="#GLUXZipUpdate > span > input")
	WebElement applyButton;
	
	public AmazonValidPincodePage()
	{
		PageFactory.initElements(driver, this);
	}
	

}
