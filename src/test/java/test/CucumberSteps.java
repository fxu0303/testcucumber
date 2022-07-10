package test;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PageCommon;

public class CucumberSteps {

	@Given("I launch web browser chrome")
	public void i_launch_web_browser_chrome() {
		PageCommon.setUpDriver("chrome");
	}
	
	@When("I navigate to url https:\\/\\/www.google.com")
	public void i_navigate_to_url_https_www_google_com() {
		PageCommon.driverCommon.navigate().to("https://www.google.com");
	}
	
//	@Given("I launch web browser (.*)")
//	public void i_launch_web_browser_chrome(String browser) {
//		
//		PageCommon.setUpDriver(browser);
//		
//	}
	
//	@When("I navigate to url (.*)")
//	public void i_navigate_to_url(String url) {
//		
//		PageCommon.driverCommon.navigate().to(url);
//		
//	}
	
	@Then("I check page googlehomepage")
	public void i_check_page_googlehomepage() {
		
	}
	
}
