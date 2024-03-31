/**
 * This page will test AddToCartPage functionality.
 */
package bdd.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.AddToCartPage;
import bdd.pages.HomePage;
import bdd.pages.IndexPage;
import bdd.pages.LoginPage;
import bdd.pages.ProductDetailPage;
import bdd.pages.SearchResultPage;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde.
 */

@Listeners(AmazonListener.class)
public class AddToCartPageTest extends BaseClass {

	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartPage;
	ProductDetailPage productDetailPage;
	Logger LOG = Logger.getLogger(AddToCartPageTest.class);

	@Test
	public void addToCartTest() {
		LOG.info("Running add to cart test");
		searchResultPage = new SearchResultPage();
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		homePage = loginPage.login();
		addToCartPage = new AddToCartPage();
		productDetailPage = new ProductDetailPage();
		loginPage = indexPage.clickOnSignIn();
		homePage = loginPage.login();
		searchResultPage = indexPage.searchProduct(prop.getProperty("search"));
		productDetailPage = searchResultPage.clickOnProduct1();
		boolean result = addToCartPage.validateAddToCartMessage();
		Assert.assertTrue(result);
        LOG.info("End of addToCartTest");
	}

}
