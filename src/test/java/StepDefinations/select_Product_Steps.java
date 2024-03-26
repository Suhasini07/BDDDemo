package StepDefinations;

import bdd.baseclass.BaseClass;
import bdd.pages.IndexPage;
import bdd.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class select_Product_Steps extends BaseClass{
	
	SearchResultPage searchResultPage;
	IndexPage indexPage;
	
	@When("user clicks on particular product")
	public void user_clicks_on_particular_product() {
		indexPage=new IndexPage();
		searchResultPage=indexPage.searchProduct(prop.getProperty("search"));
		searchResultPage.clickOnProduct1();
		
	   }

	
//	@Then("product details get open in another window")
//	public void product_details_get_open_in_another_window() {
//		indexPage=new IndexPage();
//		searchResultPage=indexPage.searchProduct(prop.getProperty("search"));
//		searchResultPage.clickOnProduct1();
//		
//	   }


}
