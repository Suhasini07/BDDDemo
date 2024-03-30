package bdd.actiondriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;

public class Action extends BaseClass {

	static JavascriptExecutor js = (JavascriptExecutor) driver;
	static Actions action = new Actions(driver);
	static Set<String> allHandles = driver.getWindowHandles();
	static String mainHandle = driver.getWindowHandle();

	public static void waits(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void switchWindow() {

		for (String string : allHandles) {
			if (string.equals(mainHandle)) {
				driver.switchTo().window(string);
				break;
			}

		}

	}

	public static void click(WebDriver driver, WebElement locatorName) {
		action.moveToElement(locatorName).click().build().perform();

	}

	public static void clickElementByJS(WebDriver driver, WebElement locatorName) {

		js.executeScript("arguments[0].click()", locatorName);

	}

	public static void clickElementByJS(WebDriver driver, List<WebElement> locatorName) {

		js.executeScript("arguments[0].click()", locatorName);

	}

	public static void scrollPage(WebDriver driver, WebElement serchProduct) {
		// WebElement flag=driver.findElement(By.cssSelector(serchProduct));
		js.executeScript("arguments[0].scrollIntoView()", serchProduct);

	}

	public static void mouseHover(WebDriver driver, WebElement element) {

		action.moveToElement(element).perform();
		;

	}

}
