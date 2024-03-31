/**
 * This Page will display Highest and Lowest price of searched item.
 */
package bdd.testcases;

import org.apache.log4j.Logger;
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
	HighLowPricePage high = new HighLowPricePage();
	Logger LOG=Logger.getLogger(HighestAndLowestPriceTest.class);

	@Test
	public void checkPrice() {
		LOG.info("Start of Checking Highest and lowest price test");
		high = new HighLowPricePage();
		indexPage = new IndexPage();
		serachResultPage = indexPage.searchProduct(prop.getProperty("search1"));
		high.getPriceOfItem();
        LOG.info("End of checking price test");
	}

}
