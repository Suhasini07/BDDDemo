
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
	
	@FindBy(css="#contextualIngressPtPin")
	WebElement deliverTo;
	
	@FindBy(css="#GLUXZipUpdateInput")
	WebElement EnterPincodeField;
	
	@FindBy(css="#GLUXZipUpdate > span > input")
	WebElement applyButton;
	
		
	public AmazonValidPincodePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	  public void switchWindow()	
		{
			
			Set<String> allHandles= driver.getWindowHandles();

			for(String string:allHandles)
			{
				String title=driver.switchTo().window(string).getTitle();
				System.out.println(title);
				if(title.equals("Samsung Galaxy M04 Light Green, 4GB RAM, 128GB Storage | Upto 8GB RAM with RAM Plus | MediaTek Helio P35 Octa-core Processor | 5000 mAh Battery | 13MP Dual Camera\r\n"
						+ ""))
				{
					Action.clickElementByJS(driver, deliverTo);

				}
				
			}

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
