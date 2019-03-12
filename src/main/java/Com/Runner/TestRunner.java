package Com.Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/home/workspace/CucumberProject/src/main/java/Com/Featuresfiles/Featureswithtagsdemo.feature"
		,glue={"Com.Stepdefinitions"},
		format={"pretty","html:test-output","json:json_file/cucumber.json"}
		,monochrome=true,
		dryRun=true,
		strict=false,
		tags={"@Prodtest", "@Stagingtessst","@Regressiontest"}
		
		)

public class TestRunner {
	

}
