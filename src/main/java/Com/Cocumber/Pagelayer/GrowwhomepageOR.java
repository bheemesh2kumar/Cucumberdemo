package Com.Cocumber.Pagelayer;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwhomepageOR extends Homebasedpage {

	WebDriver driver;

	public GrowwhomepageOR(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// growwhearderimg

	@FindBy(xpath = "//div[@class='valign-wrapper']/img")
	public WebElement growwhearderimg;

	// ExploreandInvestmentheaders
	@FindBy(xpath = "//div[@class='col l7 hdQuickLinks valign-wrapper']/div")
	public List<WebElement> ExploreandInvestmentheaders;

}
