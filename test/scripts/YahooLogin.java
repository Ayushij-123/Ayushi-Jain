package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class YahooLogin {
	
	WebDriver driver;
  @Test
  
  
  public void Yahoo() throws InterruptedException {
	  
	  driver.get("https://login.yahoo.com/");
	  WebElement username = driver.findElement(By.id("login-username"));
	  username.sendKeys("a.jain93");
	  driver.findElement(By.id("login-signin")).click();
	  Thread.sleep(5000);
	  
	  WebElement password = driver.findElement(By.id("login-passwd"));
	  password.sendKeys("April@123");
	  driver.findElement(By.id("login-signin")).click();
	  
 }
    
  @BeforeMethod
  public void beforeMethod() {
  
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	 // String expectedTitle = "";
		//String actualTitle = driver.getTitle();
  
  }

  @AfterMethod
  public void afterMethod() {
  
	  driver.quit();
  
  }

}
