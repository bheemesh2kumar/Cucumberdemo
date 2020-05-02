package Com.Cocumber.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubspotLoginpage {
	
	public WebDriver driver;
	
	public HubspotLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//building object repository
	
	@FindBy(xpath="//span[@class='hsg-nav__link-label hsg-nav__link-label--globe']")
	private WebElement Languageseletor;
	
	@FindBy(xpath="//span[@id='hs_cos_wrapper_global_phone_number_dropdown']/li/div/a/span")
	public WebElement ContactUslable;
	
	@FindBy(xpath="//a[@id='hs-eu-confirmation-button']")
	public WebElement Accpet;
	
	@FindBy(xpath="//a[@data-logged-in-text='Go To My Account']")
	private WebElement Loginwebelement;
	
	@FindBy(xpath="//ul[@class='hsg-nav__group']/child::li/a[@class='cta cta--small cta--primary homepage-nav']")
	private WebElement GetHubspotfreelable;
	
	
	@FindBy(xpath="//a[@id='hsg-nav__logo']/img")
	private WebElement Hubspotlogoimg;

	
	//getters method for OR
	public WebElement getLanguageseletor() {
		return Languageseletor;
	}


	public WebElement getContactUslable() {
		return ContactUslable;
	}


	public WebElement getLoginwebelement() {
		return Loginwebelement;
	}


	public WebElement getGetHubspotfreelable() {
		return GetHubspotfreelable;
	}


	public WebElement getHubspotlogoimg() {
		return Hubspotlogoimg;
	}
	
	
	

}
