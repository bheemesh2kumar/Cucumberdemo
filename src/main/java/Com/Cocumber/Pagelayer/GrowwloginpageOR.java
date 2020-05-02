package Com.Cocumber.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwloginpageOR extends Homebasedpage {

	WebDriver driver;

	public GrowwloginpageOR(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// login button

	@FindBy(xpath = "//span[@class='absolute-center']/span[contains(text(),'Login/Register')]")
	public WebElement loginbutton;

	// email textbox
	@FindBy(xpath = "//input[@id='login_email1']")
	public WebElement Emailtextbox;

	// password textbox
	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordtextbox;

	// continue button
	@FindBy(xpath = "//span[@class='absolute-center']/span[contains(text(),'CONTINUE')]")
	public WebElement continuebutton;

}
