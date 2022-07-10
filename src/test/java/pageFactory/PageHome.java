package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Constants;

public class PageHome extends PageCommon {

    @FindBy(name = "q")
    WebElement Input_Search;

    @FindBy(name = "btnK")
    WebElement Button_Search;

    public PageHome(WebDriver driver){

    	PageFactory.initElements(driver, this);
    }
    
	public void goToHomePage() {
		
		driverCommon.get(Constants.url);
	}
	
	public void waitHomePage() {
		
		isElementDisplayed(Input_Search);	
	}
	
	public void acceptCookies() {
		
//		sendInputKey(Input_Search, text);
	}

	public void setSearchText(String text) {
		
		sendInputKey(Input_Search, text);
	}
	
	public void clickSearchButton() {
		
		clickObject(Button_Search);
	}

}