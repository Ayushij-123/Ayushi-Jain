package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WaitClass {
	
	WebDriver driver;
	
  @Test
  public void helloWord() throws InterruptedException {
	  
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  driver.findElement(By.xpath("//div[@id = 'start']/button")).click();
	 // Thread.sleep(5000);
	  String actualvalue = driver.findElement(By.id("finish")).getText();
		String expectedvalue = "Hello World!";
		assertEquals(actualvalue,expectedvalue);
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
