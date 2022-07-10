package pageFactory;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Constants;

public class PageHomeOnepoint extends PageCommon {

    @FindBy(id = "horizontal_scroll")
    WebElement horizontal_scroll;
	
	
    @FindBy(xpath = "//section[@class='home__article']")
    WebElement Section_HomeArticle;
 
    
    @FindBy(xpath = "//section[@class='home__article']/div/div[3]")
    WebElement Panel_HomeArticle3;
    
    @FindBy(id = "scrollbar_thumb")
    WebElement Panel_HomeArticleScollBar;
    
    public PageHomeOnepoint(WebDriver driver){

    	PageFactory.initElements(driver, this);
    }
    
	public void goToHomePage() {
		
		driverCommon.get(Constants.urlOnepoint);
	}
	
	public void clickArticle() {
		WebDriverWait wait = new WebDriverWait(driverCommon,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Panel_HomeArticle3));
		Panel_HomeArticle3.click();
	}
	
	
	public void scollHomeArticle() {
		
//		WebElement Panel_HomeArticleLast = driverCommon.
//				findElement(By.xpath("//section/div/div[3]"));
		System.out.println(Panel_HomeArticleScollBar.isDisplayed());
		System.out.println(Panel_HomeArticleScollBar.getAttribute("class"));
		
		Actions builder = new Actions(driverCommon); 
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.DOWN).perform();
	}
	
	
	
	
	public static boolean scrollDown_Keys(WebElement webeScrollArea, int iLoopCount)
	{
		
		Actions dragger = null;
	    try
	    {
	        System.out.println("---------------- Started - scrollDown_Keys ----------------");

	        dragger = new Actions(driverCommon);

	        for (int i = 0; i <= iLoopCount; i++)
	        {
	            dragger.moveToElement(webeScrollArea).click().sendKeys(Keys.DOWN).build().perform();
	        }
	        System.out.println("---------------- Ending - scrollDown_Keys ----------------");
	        return true;
	    }
	    catch (Exception e)
	    {
	        System.out.println("---------------- Not able to do scroll down with keys----------------");
	        System.out.println(e.toString());
	        
	        return false;
	    }
	}
	
}