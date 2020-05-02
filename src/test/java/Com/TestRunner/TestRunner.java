package Com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Resourcesfolder/Dbqueryvalidation.feature"
				
		,glue={"Com.Stepdefinitions"},
		format={"pretty","html:test-output","json:json_file/cucumber.json"}
		,monochrome=true,
		dryRun=false,
		strict=false,
		tags={"@employeetableval"}
		
		)




public class TestRunner {

}
