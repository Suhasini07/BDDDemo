/**
 * 
 */
package bdd.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.baseclass.BaseClass;

/**
 * 
 */
public class HighLowPricePage extends BaseClass {

	@FindBy(css = "span.a-price-whole")
	List<WebElement> Price;

	public HighLowPricePage() {
		PageFactory.initElements(driver, this);
	}

	public void getPriceOfItem() {
		Map<WebElement, Integer> map = new HashMap<WebElement, Integer>();

		for (int i = 0; i < Price.size(); i++) {
			if (Price.get(i).getText() != "") {
				map.put(Price.get(i), Integer.parseInt(Price.get(i).getText().replaceAll(",", "")));
			}
		}
		List<Entry<WebElement, Integer>> le = new ArrayList<Map.Entry<WebElement, Integer>>(map.entrySet());

		for (Entry e : le) {
			System.out.println(e.getValue());

		}
	}

}
