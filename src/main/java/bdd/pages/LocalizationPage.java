/**
 * This page checks page setting after changing country.
 */
package bdd.pages;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.actiondriver.Action;
import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde
 */
public class LocalizationPage extends BaseClass {

	@FindBy(css = "#icp-nav-flyout > span")
	WebElement changeArrow;

	@FindBy(css = "#icp-flyout-mkt-change > span > div")
	WebElement clickOnCountryChangeBtn;

	@FindBy(css = "#icp-dropdown")
	WebElement selectCountry;

	public LocalizationPage() {
		PageFactory.initElements(driver, this);
	}

	public void changeCountry() {
		// try {
		Action.waits(driver, changeArrow);

		Action.mouseHover(driver, changeArrow);
		Action.waits(driver, clickOnCountryChangeBtn);

		Action.clickElementByJS(driver, clickOnCountryChangeBtn);
		Action.waits(driver, selectCountry);

		Action.clickElementByJS(driver, selectCountry);

		String name = selectCountry.getText();
		System.out.println(name);

	}
}
