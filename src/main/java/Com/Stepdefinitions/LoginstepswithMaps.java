package Com.Stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginstepswithMaps {
	WebDriver driver;
	
	
	
@Given("^user is already on login page application$") 
public void User_already_loginpage()
{
	 System.setProperty("webdriver.chrome.driver", "E:\\Driverservers\\chromedriver.exe");
	 driver=new  ChromeDriver();
	 driver.get("https://www.snapdeal.com");
	 driver.manage().window().maximize();
	// String PageTitle=driver.getTitle();
	
}


@When("^title of login page is snapdeal application$")
public void title_of_login_page_is_snapdeal() 
{
	 String PageTitle=driver.getTitle();
	 System.out.println("Login page title is " +PageTitle );
	 Assert.assertEquals("Online Shopping Site in India - Shop for Electronics, Mobile, Men & Women Clothing, Home - Snapdeal",   PageTitle);
	// driver.quit();
}




//using datatable concept

@When("^user is entred username and passward corretly$")
public void user_is_entred_username_and_passward(DataTable tableref) throws InterruptedException   {
	
	for(Map<String,String> datatableref:tableref.asMaps(String.class, String.class))
	{
		
		//mouse over on login element
		 Actions MouseActions=new Actions(driver); 
		 MouseActions.moveToElement(driver.findElement(By.xpath("//div[@class='accountInner']/child::span[@class='accountUserImg col-xs-9']"))).build().perform();
		 //xpath="//a[contains(text(),'login')]"
		driver.findElement(By.xpath("//a[contains(text(),'login')]")).sendKeys(Keys.ENTER);	
		driver.switchTo().frame("loginIframe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(datatableref.get("username"));
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='j_password_login_uc']")).sendKeys("passward");
		//driver.navigate().refresh();
		  
		
	}
	
	
	
}



@Then("^user is clicked on loginbutton application$")
public void user_is_clicked_on_loginbutton()  {
   driver.findElement(By.xpath("//button[@id='submitLoginUC']")).click();
   
}


@Then("^user is on home page application$")
public void user_is_on_home_page()  {
	
	System.out.println("the page title is" + driver.getTitle());
	//Assert.assertEquals("bheemesh", string);
	
 }

}
