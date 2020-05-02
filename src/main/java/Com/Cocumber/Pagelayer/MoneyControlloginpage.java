package Com.Cocumber.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoneyControlloginpage extends Homebasedpage {

	public WebDriver driver;

	public MoneyControlloginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// login email textbox

	@FindBy(xpath = "//form[@id='login_form']/div[1]/child::input")
	public WebElement emailtext;

	// login password textbox

	@FindBy(xpath = "//form[@id='login_form']/div[3]/input")
	public WebElement passwordtextbox;

	// login button
	@FindBy(xpath = "//button[@id='ACCT_LOGIN_SUBMIT']")
	public WebElement loginbuton;

	// login button
	@FindBy(xpath = "//a[@title='Log In']")
	public WebElement loginlink;

}
