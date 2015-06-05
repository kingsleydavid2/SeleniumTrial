package ninetestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ninetestngfile{
	 public String baseUrl = "http://newtours.demout.com/";
	 public WebDriver driver = new FirefoxDriver();

	@Test
	public void verifyHomepageTitle() {
	 driver.get(baseUrl);
	 String expectedTitle = "Welcome: Mercury Tours";
	 String actualTitle = driver.getTitle();
	 Assert.assertEquals(actualTitle, expectedTitle);
	 driver.quit();
	}
	}
