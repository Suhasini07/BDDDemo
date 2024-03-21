package bdd.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bdd.baseclass.BaseClass;

public class Action extends BaseClass {
	
	Actions action=new Actions(driver);
	
	public void click(WebElement element) {
		
		action.click(element);
		
	}

}

