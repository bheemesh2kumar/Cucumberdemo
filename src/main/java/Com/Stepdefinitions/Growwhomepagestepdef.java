package Com.Stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.StaleElementReferenceException;

import Com.BaseLibrary.BaseClass;
import Com.Cocumber.Pagelayer.GrowwhomepageOR;
import Com.Cocumber.Pagelayer.GrowwloginpageOR;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Growwhomepagestepdef extends BaseClass {

	public Growwhomepagestepdef() throws IOException {
		super();

	}

	GrowwhomepageOR GrowwhomepageORref = new GrowwhomepageOR(driver);

	@Given("^user is on groww home page$")
	public void user_is_on_groww_home_page() {
		try {

			assertTrue(GrowwhomepageORref.growwhearderimg.isDisplayed());

			System.out.println("user is navigated to home page successfully");
		} catch (StaleElementReferenceException ex) {
			ex.printStackTrace();
			GrowwhomepageORref.waitforelement(driver, GrowwhomepageORref.growwhearderimg, 10);
			assertTrue(GrowwhomepageORref.growwhearderimg.isDisplayed());
			System.out.println("user is navigated to home page successfully");
		}

	}

	@Then("^validate that if user is able to view groww label,Explore and Investmenets headers$")
	public void validate_that_if_user_is_able_to_view_groww_label_Explore_and_Investmenets_headers() {

		GrowwhomepageORref.checkallwebelements(GrowwhomepageORref.ExploreandInvestmentheaders,driver,10);

	}

}
