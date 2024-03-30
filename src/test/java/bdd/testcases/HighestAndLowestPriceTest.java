/**
 * This Page will display Highest and Lowest price of searched item.
 */
package bdd.testcases;

import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.HighLowPricePage;
import bdd.pages.HomePage;
import bdd.pages.IndexPage;
import bdd.pages.LoginPage;
import bdd.pages.SearchResultPage;

/**
 * @author Suhasini Shinde
 */
public class HighestAndLowestPriceTest extends BaseClass {

	IndexPage indexPage;
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	SearchResultPage serachResultPage = new SearchResultPage();
	HighLowPricePage high;

	@Test
	public void checkPrice() {
		high = new HighLowPricePage();
		indexPage = new IndexPage();
		serachResultPage = indexPage.searchProduct(prop.getProperty("search1"));
		high.getPriceOfItem();

	}

}
