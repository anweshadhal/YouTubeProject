package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.YouTubePage;

public class YouTubeSearch {
	
	WebDriver driver;
	YouTubePage ytp;
	
	@Before
	public void browserSetup()
	{
		String userdir=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", userdir+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	
//	@BeforeStep
//	public void beforeEachStep()
//	{
//		System.out.println("Before each step");
//	}
	
	@Given("User is on YouTube home page.")
	public void user_is_on_you_tube_home_page() {
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}
	
	@When("User clicks on music tab on home page.")
	public void user_clicks_on_music_tab_on_home_page() {
	    
	}
	@Then("should be able to naviagte to respective.")
	public void should_be_able_to_naviagte_to_respective() {
	    
	}
	
	@When("types {string} in search tab.")
	public void types_in_search_tab(String text) {
		ytp=new YouTubePage(driver);
		ytp.valueEntered(text);
	}
	@When("hits enters")
	public void hits_enters() {
		ytp=new YouTubePage(driver);
		ytp.clickEnter();
	}
	@Then("should be able to naviagte to respective page.")
	public void should_be_able_to_naviagte_to_respective_page() {
		ytp=new YouTubePage(driver);
		ytp.validatePage();
	}
	
	@After
	public void closeSessions()
	{
		driver.close();
		driver.quit();
	}


//	@AfterStep
//	public void afterEachStep()
//	{
//		System.out.println("After each step");
//	}
}
