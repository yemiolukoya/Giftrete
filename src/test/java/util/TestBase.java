package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import pages.CreateAccountPage;
import pages.RegisterPage;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	
	public static CreateAccountPage createAccountPage;
	public static RegisterPage registerPage;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"/Users/yemioluv/eclipse-workspace/com.giftrete/src/test/java/config/config.properties");

			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();

		}

	}

	public static void initialization() throws IOException {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver 6");
              driver = new ChromeDriver();
              
//				 driver = new HtmlUnitDriver();

		} else if (browserName.equals("FF")) {
			 System.setProperty("webdriver.gecko.driver",
			 "");
			driver = new FirefoxDriver();
			
		} else if (browserName.equals("opera")) {
			System.setProperty("webdriver.opera.driver",
					"");
			driver = new OperaDriver();
			//WebDriver driver = new HtmlUnitDriver();
		}

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("no-sandbox");
		// Fix for cannot get automation extension
		chromeOptions.addArguments("disable-extensions");
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("headless");


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

}
