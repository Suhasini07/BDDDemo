package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.baseclass.BaseClass;

public class SearchResultPage extends BaseClass {
	
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > span > div > div > div > div.puisg-col.puisg-col-4-of-12.puisg-col-8-of-16.puisg-col-12-of-20.puisg-col-12-of-24.puis-list-col-right > div > div > div.a-section.a-spacing-none.puis-padding-right-small.s-title-instructions-style > h2 > a > span")
	WebElement serchProduct;
	
	@FindBy(css="input#nav-search-submit-button")
	WebElement clickOnSearchBtn;
	
	
	
	public SearchResultPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean isProductAvailable() {
		
		return serchProduct.isDisplayed();

	}
	
	public AddToCartPage clickOnProduct() {
		serchProduct.click();
		return new AddToCartPage();

	}
	
	public ProductDetailPage clickOnProduct1() {
		serchProduct.click();
		return new ProductDetailPage();

	}

	
	

}
