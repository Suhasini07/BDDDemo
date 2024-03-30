/**
 * This page will validate functionality after changing country on Amazon.
 */
package bdd.testcases;

import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.LocalizationPage;
import bdd.pages.IndexPage;

/**
 * @author Suhasini Shinde
 */
public class LocalizationTest extends BaseClass {

	IndexPage indexPage;
	LocalizationPage changingCountry;

	@Test
	public void validateChangedCountry() {
		indexPage = new IndexPage();
		changingCountry = new LocalizationPage();
		changingCountry.changeCountry();

	}

}
