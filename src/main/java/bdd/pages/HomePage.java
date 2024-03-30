/**
 *  This is Home Page setup.
 */
package bdd.pages;

/**
 * @author Suhasini Shinde
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Suhasini Shinde
 */

import bdd.baseclass.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(css = "#nav_prefetch_yourorders > span")
	WebElement yourOrders;

	@FindBy(css = "#nav-al-your-account > a:nth-child(4) > span")
	WebElement wishList;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateWishList() {
		return wishList.isDisplayed();
	}

	public boolean validateYourOrders() {
		return yourOrders.isDisplayed();
	}

	public String getHomePageURL() {

		return driver.getCurrentUrl();

	}

}
