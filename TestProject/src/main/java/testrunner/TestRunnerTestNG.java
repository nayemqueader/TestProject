package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerTestNG {
	@CucumberOptions(
			features = {"Features"},
			glue = {"TestProject.stepdefs"}
			)
	public class Testrunner extends AbstractTestNGCucumberTests{}

}
