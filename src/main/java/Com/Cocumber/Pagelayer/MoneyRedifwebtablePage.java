package Com.Cocumber.Pagelayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoneyRedifwebtablePage {

	public WebDriver driver;

	public MoneyRedifwebtablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// building object repository

	@FindBy(xpath = "//span[@class='block msprite moneywizlogo negative curhand']")
	public WebElement rediffmoneylable;

	// webtable header name
	@FindBy(xpath = "//div[@class='floatL f22 bold']")
	public WebElement webtableheadername;

	// webtable

	@FindBy(xpath = "//table[@class='dataTable']")
	public WebElement webtable;

	// method for web table rows

	public int getallrows(WebElement table) {

		List<WebElement> allrows = table.findElements(By.xpath("./tbody//tr"));

		return allrows.size();

	}

	// click on company name

	public void getcompanydetails(WebElement table,String grpname)
	{
		
		int row=1;
		for(WebElement col:table.findElements(By.xpath("./tbody//tr//td[2]")))
		{
			if(col.getText().equals(grpname))
			{
				
				table.findElement(By.xpath("./tbody//tr["+ row+ "]//td[1]/a")).click();
				break;
				
			}
			
			row++;
				
			
		}
		
	}

}
