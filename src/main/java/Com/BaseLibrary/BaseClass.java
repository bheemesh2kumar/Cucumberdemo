package Com.BaseLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Com.Utilities.WebEventlistner;

public class BaseClass {

	public static Properties prop;
	public FileInputStream ip;
	public static WebDriver driver;

	public BaseClass() throws IOException {
		prop = new Properties();

		try {
			ip = new FileInputStream("C:/Users/home/eclipse-workspace/Cucumberdemo/src/main/java/Com/"
					+ "Configirations/Config.properties");

		} catch (FileNotFoundException excep) {
			excep.printStackTrace();
			excep.getMessage();
		}
		prop.load(ip);
	}

	public static void intialize() throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		EventFiringWebDriver EventFiringWebDriverref = new EventFiringWebDriver(driver);
		WebEventlistner WebEventlistnerref = new WebEventlistner();
		EventFiringWebDriverref.register(WebEventlistnerref);
		driver = EventFiringWebDriverref;

		driver.get(prop.getProperty("URL"));

		driver.manage().window().maximize();
		// driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);

	}

}
