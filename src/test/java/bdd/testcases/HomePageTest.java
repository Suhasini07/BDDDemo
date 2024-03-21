/**
 * This Page will test Home Page functionality
 */
package bdd.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
	
	HomePage homePage;
	IndexPage indexPage;
	LoginPage loginPage;
	
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
	
	@Test
	public void veriFyWishListTest() {
		
		indexPage=new IndexPage();
		loginPage=indexPage.clickOnSignIn();
		homePage=loginPage.login();
		boolean wish=homePage.validateWishList();
		Assert.assertTrue(wish);

	}
	
	@Test
	public void veriFyOrderHistory() {
		indexPage=new IndexPage();
		loginPage=indexPage.clickOnSignIn();
		homePage=loginPage.login();
		boolean orders=homePage.validateYourOrders();
		Assert.assertTrue(orders);
		

	}

}
