package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.testng.annotations.AfterMethod;

public class GoogleLink {
	
	WebDriver driver;
  
	@Test
  
  
  
  public void printAllGoogleLink() {
		
		
		driver.get("https://www.google.com");
	  List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));
	  for(WebElement oneElement: allGoogleLinks) {
		  
		  System.out.println(oneElement.getText() + " - " + oneElement.getAttribute("href"));
		  
	  }
	  
	  
	  
  }
	
  @BeforeMethod
  public void beforeMethod() {
	  

	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
