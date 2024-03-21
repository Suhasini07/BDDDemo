/**
 * 
 */
package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde
 */
public class AccountCreationPage extends BaseClass{
	
	@FindBy(css="#nav-link-accountList > span")
	WebElement AccountList;
	
	@FindBy(css="#nav-flyout-ya-newCust > a")
	WebElement startHereLink;
	
	@FindBy(css="input#ap_customer_name")
	WebElement customerName;
	
	@FindBy(css="input#ap_phone_number")
	WebElement customerMobileNo;
	
	@FindBy(css="input#ap_password")
	WebElement customerPassword;
	
	@FindBy(css="input#continue")
	WebElement veryFyMobileBtn;
	
	@FindBy(css="#ap_register_form > div > div > h1")
	WebElement accountCreationFormTitle;
	
	public AccountCreationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
		
	public boolean valiteFormTitle() {
		
		return accountCreationFormTitle.isDisplayed();

	}
	

}
