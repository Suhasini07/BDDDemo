/**
 * This Page will test Home Page functionality
 */
package bdd.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.HomePage;
import bdd.pages.IndexPage;
import bdd.pages.LoginPage;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde
 */
@Listeners(AmazonListener.class)
public class HomePageTest extends BaseClass {

	HomePage homePage = new HomePage();
	IndexPage indexPage;
	LoginPage loginPage = new LoginPage();
	Logger LOG = Logger.getLogger(HomePageTest.class);

	@Test
	public void veriFyWishListTest() {
		LOG.info("Running test to verify wishlist");

		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		homePage = loginPage.login();
		boolean wish = homePage.validateWishList();
		Assert.assertTrue(wish);

	}

	@Test
	public void veriFyOrderHistory() {
		LOG.info("Running test to check order history");
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		homePage = loginPage.login();
		boolean orders = homePage.validateYourOrders();
		Assert.assertTrue(orders);

	}

}
