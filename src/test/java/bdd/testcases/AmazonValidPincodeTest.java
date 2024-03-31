/**
This page will check which pin codes are valid for Amazon delivery
 * 
 */
package bdd.testcases;

import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.actiondriver.Action;
import bdd.baseclass.BaseClass;
import bdd.pages.AmazonValidPincodePage;
import bdd.pages.IndexPage;
import bdd.pages.ProductDetailPage;
import bdd.pages.SearchResultPage;
import bdd.utility.ReadExelFile;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde
 */
@Listeners(AmazonListener.class)
public class AmazonValidPincodeTest extends BaseClass {

	IndexPage indexPage;
	SearchResultPage searchResultPage;
	ProductDetailPage productDetailPage;
	AmazonValidPincodePage amazonValidPincodePage = new AmazonValidPincodePage();
	Logger LOG = Logger.getLogger(AmazonValidPincodeTest.class);

	@Test(dataProvider = "pincode_data", dataProviderClass = ReadExelFile.class)

	public void checkValidPincodes(String pinCode) {
		LOG.info("Running test for checking valid pincodes");
		indexPage = new IndexPage();
		searchResultPage = indexPage.searchProduct(prop.getProperty("search"));
		productDetailPage = searchResultPage.clickOnProduct1();
		amazonValidPincodePage.enterPincode(pinCode);
		LOG.info("End of checkValidPincodes");

	}

}
