package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pageFactory.PageCommon;
import pageFactory.PageHome;
import util.GeneralUtils;

public class Test_Google {

  public WebDriver driver;
  
  public PageCommon pageCommon;

@Test
  public void Test_Search() throws Exception {

	  driver = PageCommon.setUpDriver("chrome");
	  
	  PageHome pageHome = new PageHome(driver);
	  
	  pageHome.goToHomePage();
	  
	  pageHome.setSearchText(GeneralUtils.generateRandomString(10));
	  
	  pageHome.clickSearchButton();
  }
  
}  
