package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {

	
	@CucumberOptions(features= "src/test/java/feature/login.feature", glue = "stepDefinition",
		publish = true
			)
	public class TestRunner extends ProjectSpecificMethod {
		
	}

}
