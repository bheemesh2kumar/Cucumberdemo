package Com.Stepdefinitions;

import java.io.IOException;

import Com.BaseLibrary.BaseClass;
import Com.Cocumber.Pagelayer.GrowwloginpageOR;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	public Hooks() throws IOException {
		super();

	}

	GrowwloginpageOR GrowwloginpageORref;

	//@Before
	public void setup() throws IOException, InterruptedException {
		intialize();
		GrowwloginpageORref = new GrowwloginpageOR(driver);
		GrowwloginpageORref.loginbutton.click();
		GrowwloginpageORref.waitforelement(driver, GrowwloginpageORref.Emailtextbox, 10);
		GrowwloginpageORref.Emailtextbox.sendKeys(prop.getProperty("UN"));
		GrowwloginpageORref.continuebutton.click();
		GrowwloginpageORref.waitforelement(driver, GrowwloginpageORref.passwordtextbox, 10);
		GrowwloginpageORref.passwordtextbox.sendKeys(prop.getProperty("PWD"));
		GrowwloginpageORref.continuebutton.click();

	}

	//@After
	public void teardown() {
		driver.quit();
	}

}
