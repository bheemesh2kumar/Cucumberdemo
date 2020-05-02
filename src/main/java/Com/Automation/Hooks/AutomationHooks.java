package Com.Automation.Hooks;

import java.io.IOException;

import Com.BaseLibrary.BaseClass;
import Com.Cocumber.Pagelayer.MoneyControlloginpage;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AutomationHooks extends BaseClass

{
	MoneyControlloginpage MoneyControlloginpageref = new MoneyControlloginpage(driver);

	public AutomationHooks() throws IOException {
		super();

	}

	@Before
	public void setup() {
		MoneyControlloginpageref.loginlink.click();
		MoneyControlloginpageref.emailtext.sendKeys(prop.getProperty("UN"));
		MoneyControlloginpageref.passwordtextbox.sendKeys(prop.getProperty("PWD"));
		MoneyControlloginpageref.waitforelementtoclick(driver, MoneyControlloginpageref.loginbuton, 10);
		MoneyControlloginpageref.loginbuton.click();

	}
	
	
	@After
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	

}
