package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class YouTubePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//yt-formatted-string[@title=\"Music\"]")
	WebElement musicbtn;
	
	@FindBy(xpath="//input[@id=\"search\"]")
	WebElement searchbar;
	
	@FindBy(xpath="//yt-formatted-string[@id=\"subscribers\" and contains(text(),\"@RaghavPal\")]")
	WebElement textValid;
	
	////yt-formatted-string[@id=\"text\" and contains(text(),\"Automation Step by Step\")]
	
	public YouTubePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void valueEntered(String str)
	{
		searchbar.click();
		searchbar.sendKeys(str);
	}
	
	public void clickEnter()
	{
		searchbar.sendKeys(Keys.ENTER);
	}
	
	public void validatePage()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		assertTrue(textValid.isEnabled());
		System.out.println(textValid.getText());
		//Assert.assertEquals("got the respective search", "@RaghavPal", textValid.getText());
		assertEquals("@RaghavPal", textValid.getText());
		
	}
	
	
	
	
	

}
