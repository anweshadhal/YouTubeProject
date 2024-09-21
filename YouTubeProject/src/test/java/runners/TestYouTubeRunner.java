package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/YouTubeSearch.feature",
		glue= {"StepDefinitions"},
		monochrome=true,
		plugin = {"json:target/cucumber.json"},
		tags="@YouTubeMusicSearch"
		
		)
public class TestYouTubeRunner {

}

