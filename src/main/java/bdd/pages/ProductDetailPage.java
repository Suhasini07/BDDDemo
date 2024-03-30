/**
This page displays searched product details.
 * 
 */
package bdd.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.actiondriver.Action;
import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde.
 */
public class ProductDetailPage extends BaseClass {

	@FindBy(css = "#feature-bullets > h1")
	List<WebElement> aboutThisItem;

	@FindBy(css = "#quantity")
	WebElement quantity;

	String mainPage = driver.getWindowHandle();
	Set<String> allHandles = driver.getWindowHandles();

	public ProductDetailPage() {
		PageFactory.initElements(driver, this);
	}

	public void validateAboutThisItem() {

		for (int i = 0; i < aboutThisItem.size(); i++) {
			WebElement q = aboutThisItem.get(i);
			System.out.println(q.getText().toString());

		}

	}

	public void selectQuantity() {

		Action.scrollPage(driver, quantity);
		for (String page : allHandles) {
			if (page.equals(mainPage)) {
				driver.switchTo().window(page);
				break;
			}
		}

		Select q = new Select(quantity);
		q.selectByIndex(2);
		;
	}

}
