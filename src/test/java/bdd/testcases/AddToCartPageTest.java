/**
 * This page will test AddToCartPage functionality.
 */
package bdd.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.AddToCartPage;
import bdd.pages.IndexPage;
import bdd.pages.SearchResultPage;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde.
 */

@Listeners(AmazonListener.class)
public class AddToCartPageTest extends BaseClass{
	
	IndexPage indexPage;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartPage;
	
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
	public void addToCartTest() {
		indexPage=new IndexPage();
		searchResultPage=indexPage.searchProduct("samsung mobile");
		addToCartPage=searchResultPage.clickOnProduct();
		//addToCartPage.selectQuantity("1");
		addToCartPage.clickOnAddToCart();
		boolean result=addToCartPage.validateAddToCartMessage();
		Assert.assertTrue(result);

	}

}
