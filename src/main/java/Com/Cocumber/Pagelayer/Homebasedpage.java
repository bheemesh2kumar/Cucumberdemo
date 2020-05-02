package Com.Cocumber.Pagelayer;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homebasedpage {

	// wait for element to click

	public void waitforelementtoclick(WebDriver driver, WebElement element, int timeout) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));

		element.click();

	}

	// wait for element

	public void waitforelement(WebDriver driver, WebElement element, int timeout) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));

	}

	// generic method for check if all list of elements are there

	public void checkallwebelements(List<WebElement> ele, WebDriver driver, int timeout) {

		for (WebElement eleval : ele) {

			waitforelement(driver, eleval, timeout);
			try {
				assertTrue(eleval.isDisplayed());
			} catch (StaleElementReferenceException ex) {
				waitforelement(driver, eleval, timeout);
				assertTrue(eleval.isDisplayed());
			}

			System.out.println(eleval.getText()+ " " + "displayed successfully");
		}

	}

}
