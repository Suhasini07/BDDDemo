/**
 * This is Login Page setup.
 */

package bdd.pages;

/**
 * @author Suhasini Shinde
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(css="input#ap_email")
	WebElement mobileNo;
	
	@FindBy(css="input.a-button-input")
	WebElement continueButton;
	
	@FindBy(css="input#ap_password")
	WebElement password;
	
	@FindBy(css="input#signInSubmit")
	WebElement signInButton;
	
	@FindBy(css="a#createAccountSubmit")
	WebElement accountCreateLink;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public AccountCreationPage clickOnAccountCreateLink() {
		accountCreateLink.click();
		return new AccountCreationPage();

	}

	
	public HomePage login()
	{
		mobileNo.sendKeys(prop.getProperty("mobile"));
		continueButton.click();
		
		password.sendKeys(prop.getProperty("password"));
		signInButton.click();
		
		return new HomePage();
	}
	

}
