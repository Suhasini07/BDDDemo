package bdd.actiondriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;

public class Action extends BaseClass {
	
	static JavascriptExecutor js = (JavascriptExecutor) driver;


	public void switchWindow() {
		Set<String> allHandles = driver.getWindowHandles();

		for (String string : allHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
			if (title.equals("")) {

			}

		}

	}

	public static void click(WebDriver driver, WebElement locatorName) {
		Actions action = new Actions(driver);
		action.moveToElement(locatorName).click().build().perform();

	}

	public static void clickElementByJS(WebDriver driver, WebElement locatorName) {

		js.executeScript("arguments[0].click()", locatorName);

	}
	
	public static void scrollPage(WebDriver driver,WebElement serchProduct ) {
		//WebElement flag=driver.findElement(By.cssSelector(serchProduct));
		js.executeScript("arguments[0].scrollIntoView()",serchProduct );
		

	}
	

}
