package Com.Stepdefinitions;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.ElementNotVisibleException;

import Com.BaseLibrary.BaseClass;
import Com.Cocumber.Pagelayer.HubspotLoginpage;
import Com.Cocumber.Pagelayer.MoneyRedifwebtablePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinationwebtable extends BaseClass {

	public Stepdefinationwebtable() throws IOException {
		super();

	}

	MoneyRedifwebtablePage MoneyRedifwebtablePageref;

	@Given("^user is on redif money gainers home page$")
	public void user_is_on_redif_money_gainers_home_page() throws IOException {

		intialize();
		MoneyRedifwebtablePageref = new MoneyRedifwebtablePage(driver);

		String str = MoneyRedifwebtablePageref.rediffmoneylable.getText();
		System.out.println("****************" + str);

		Assert.assertTrue(str.equals("Rediff Moneywiz"));

	}

	@When("^Webtable header name is \"([^\"]*)\"$")
	public void webtable_header_name_is(String arg1) {

		String hearname = MoneyRedifwebtablePageref.webtableheadername.getText();

		System.out.println("****************" + hearname);
		Assert.assertTrue(hearname.equals(arg1));

	}

	@When("^User is able to see Top gainers information$")
	public void user_is_able_to_see_Top_gainers_information() {

		int rowssize = MoneyRedifwebtablePageref.getallrows(MoneyRedifwebtablePageref.webtable);
		System.out.println("$$$$$$$$$$$$$$$" + rowssize);

		Assert.assertEquals(1061, rowssize);

	}

	@Then("^Validate that if user is able to click on Company name based on Group B$")
	public void validate_that_if_user_is_able_to_click_on_Company_name_based_on_Group_B() {
		
		MoneyRedifwebtablePageref.getcompanydetails(MoneyRedifwebtablePageref.webtable,"MT");
		driver.quit();
		

	}

}
