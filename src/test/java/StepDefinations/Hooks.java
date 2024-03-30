/**
 * This page will acts as a hooks.
 */
package StepDefinations;

import bdd.baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * @author Suhasini Shinde.
 */
public class Hooks extends BaseClass {

	@Before
	public void launchBrowserAndUrl() {
		BaseClass.launchApp();

	}

	@After
	public void closeBrowser() {
		BaseClass.tearDown();
	}

}
