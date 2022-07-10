package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pageFactory.PageCommon;
import pageFactory.PageHomeOnepoint;

public class Test_Onepoint {

  public WebDriver driver;
  
  public PageCommon pageCommon;

@Test
  public void Test_Search() throws Exception {

	  driver = PageCommon.setUpDriver("chrome");
	  
	  PageHomeOnepoint pageHomeOnepoint = new PageHomeOnepoint(driver);
	  
	  pageHomeOnepoint.goToHomePage();
	  
	  pageHomeOnepoint.scollHomeArticle();
	  
	  //Thread.sleep(5000);
	  pageHomeOnepoint.clickArticle();
	  
	  
  }
  
}  
