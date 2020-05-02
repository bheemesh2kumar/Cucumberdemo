package Com.Stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import Com.BaseLibrary.BaseClass;
import Com.Cocumber.Pagelayer.HubspotLoginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HubSpotLoginpageSDfile extends BaseClass {
	
	
	

	public HubSpotLoginpageSDfile() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	 HubspotLoginpage HubspotLoginpageref;	
	
	@Given("^user is on hubspot login page$")
	public void user_is_on_hubspot_login_page() throws IOException  {
		 HubspotLoginpageref=new HubspotLoginpage(driver);
		
		intialize();
				
		
		//Assert.assertTrue(HubspotLoginpageref.ContactUslable.isDisplayed());
		
		
	}

	@When("^user clicks on Hubspot image button$")
	public void user_clicks_on_Hubspot_image_button()  {
		HubspotLoginpageref=new HubspotLoginpage(driver);
		
		boolean flag=HubspotLoginpageref.getHubspotlogoimg().isDisplayed();
		System.out.println(flag);
		
		Assert.assertTrue(flag);
	    
	}

	@When("^login page title  is \"([^\"]*)\"$")
	public void login_page_title_is(String arg1)  {
		HubspotLoginpageref=new HubspotLoginpage(driver);
		
		String title=driver.getTitle();
		System.out.println(title);
		
	   
	}

	@Then("^Validate that if user is able to see language selector,Contact us,Login button & GetHubspot free lable$")
	public void validate_that_if_user_is_able_to_see_language_selector_Contact_us_Login_button_GetHubspot_free_lable()  {
		HubspotLoginpageref=new HubspotLoginpage(driver);
		
		boolean lan=HubspotLoginpageref.getLanguageseletor().isDisplayed();
		boolean contact=HubspotLoginpageref.getContactUslable().isDisplayed();
		boolean login=HubspotLoginpageref.getLoginwebelement().isDisplayed();
		boolean freelable=HubspotLoginpageref.getGetHubspotfreelable().isDisplayed();
		
		System.out.println(lan);
		System.out.println(contact);
		System.out.println(login);
		System.out.println(freelable);
		driver.quit();
		
	   
	}

	
	
	
	

}
