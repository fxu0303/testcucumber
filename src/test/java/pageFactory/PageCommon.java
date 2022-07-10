package pageFactory;

import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Constants;


public class PageCommon {

	public static WebDriver driverCommon;

	public static String url = "";

	public static String env = "";

//	private static DesiredCapabilities capabilities;

	public static WebDriver setUpDriver(String driverType) {

		driverType = driverType.trim().toUpperCase();

//		capabilities = null;

		switch (driverType.trim().toUpperCase()) {

		case "CHROME":

			System.setProperty("webdriver.chrome.driver", Constants.chromedriverPath);
System.out.print(Constants.chromedriverPath);
//			  capabilities = DesiredCapabilities.chrome();
//			  
//			  ChromeOptions chromeOptions = new ChromeOptions(); HashMap<String, Object>
//			  chromePrefs = new HashMap<String, Object>();
//			  
//			  chromeOptions.setExperimentalOption("prefs", chromePrefs);
//			  
//			  capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//			  
//			  driverCommon = new ChromeDriver(capabilities);
			  
			 
			 
			driverCommon = new ChromeDriver();

			break;

		case "SAFARI":

			break;

		case "EDGE":

			break;

		case "IE":

			break;

		}

		driverCommon.manage().window().maximize();
		
//		driverCommon.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driverCommon;

	}

	public static void setUpDriver(WebDriver d) {

		driverCommon = d;
	}

	public static WebDriver getDriver() {

		return driverCommon;
	}

	public boolean isElementClickable(WebElement elementName) {

		WebDriverWait wait = new WebDriverWait(driverCommon, Duration.ofSeconds(Constants.WaitTime));

		wait.until(ExpectedConditions.elementToBeClickable(elementName));

		return true;
	}

	public boolean isElementDisplayed(WebElement elementName) {

		WebDriverWait wait = new WebDriverWait(driverCommon, Duration.ofSeconds(Constants.WaitTime));

		wait.until(ExpectedConditions.visibilityOf(elementName));

		return true;
	}

	public void clickObject(WebElement elementName) {

		if (isElementDisplayed(elementName)) {

			elementName.click();
		}

	}

	public void sendInputKey(WebElement elementName, String inputKey) {

		if (isElementDisplayed(elementName)) {

			elementName.clear();

			elementName.sendKeys(inputKey);
		}

	}

	public void scrollLeft(WebElement e) {

		// Scroll to div's most right:
		((JavascriptExecutor) driverCommon).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", e);

		// Or scroll the div by pixel number:
		((JavascriptExecutor) driverCommon).executeScript("arguments[0].scrollLeft += 250", e);

	}
	


	public static void main(String[] args) throws Exception {

	}
}
