/**
 * 
 */
package bdd.baseclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * 
 */
@CucumberOptions(features = "src/test/resources/Feature", glue = "StepDefinations")
public class MyRunner extends AbstractTestNGCucumberTests {

}
