package test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  
@CucumberOptions(features = "src/test/resources/features", monochrome = true, plugin = {"pretty",  "html:target/site/cucumber.html" })    
public class CucumberTS {

	
	
}
