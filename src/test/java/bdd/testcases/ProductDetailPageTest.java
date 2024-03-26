/**
This page is validating functionality of searched product.
 * 
 */
package bdd.testcases;

import org.apache.log4j.Logger;
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
	Logger LOG=Logger.getLogger(ProductDetailPageTest.class);
	@Test
	public void checkProduct() {
		LOG.info("Running test for checking availability of searched product");
		indexPage=new IndexPage();
		searchResultPage=indexPage.searchProduct(prop.getProperty("search"));
		
		productDetailPage=searchResultPage.clickOnProduct1();
		boolean result=productDetailPage.inStockOrNot();
		Assert.assertTrue(result);	
		
	}
	
}
