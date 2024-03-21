/**
This page will check which pin codes are valid for Amazon delivery
 * 
 */
package bdd.testcases;

import org.checkerframework.framework.qual.DefaultQualifier.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.HomePage;
import bdd.pages.IndexPage;
import bdd.pages.LoginPage;
import bdd.pages.SearchResultPage;
import bdd.utility.ReadExelFile;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde
 */
@Listeners(AmazonListener.class)
public class AmazonValidPincodeTest extends BaseClass{
	
	IndexPage indexPage;
	SearchResultPage searchResultPage;
	
	@FindBy(css="#contextualIngressPtLabel_deliveryShortLine > span:nth-child(1)")
	WebElement deliverTo;
	
	@FindBy(css="#GLUXZipUpdateInput")
	WebElement EnterPincodeField;
	
	@FindBy(css="#GLUXZipUpdate > span > input")
	WebElement applyButton;
	
	@BeforeMethod
	public void setUp()
	{
		launchApp();
	}
	
	@AfterMethod
	public void teaDownIndex()
	{
		tearDown();
	}
	
	@Test(dataProvider ="pincode_data",dataProviderClass = ReadExelFile.class )
	
	public void checkValidPincodes(String pincode) {
		indexPage=new IndexPage();
		searchResultPage=indexPage.searchProduct("samsung mobile");
		deliverTo.click();
		
	}

}
