/**
This page is validating functionality of searched product.
 * 
 */
package bdd.testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.IndexPage;
import bdd.pages.ProductDetailPage;
import bdd.pages.SearchResultPage;
import listeners.AmazonListener;
/**
 * @author Suhasini Shinde.
 */
@Listeners(AmazonListener.class)
public class ProductDetailPageTest extends BaseClass {
	
	IndexPage indexPage;
	SearchResultPage searchResultPage;
	ProductDetailPage productDetailPage;
	
	@Test
	public void checkProduct() {
		indexPage=new IndexPage();
		searchResultPage=indexPage.searchProduct("samsung mobile");
		
		productDetailPage=searchResultPage.clickOnProduct1();
		boolean result=productDetailPage.verifyIsImageAvailable();
		Assert.assertTrue(result);	
		
	}
	
}
