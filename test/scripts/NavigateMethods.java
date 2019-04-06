package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NavigateMethods {
	
  WebDriver driver;	
  @Test
  public void navigateMethodsTest() throws InterruptedException {

	  driver.get("https://login.yahoo.com/");
	  WebElement username = driver.findElement(By.id("login-username"));
	  username.sendKeys("a.jain93");
	  driver.findElement(By.id("login-signin")).click();
	  Thread.sleep(5000);
	  driver.navigate().to("https://www.google.com");
	  driver.navigate().back();
	  driver.getCurrentUrl();
	  WebElement password = driver.findElement(By.id("login-passwd"));
	  password.sendKeys("April@123");
	  driver.findElement(By.id("login-signin")).click();
	  driver.getPageSource();
	  driver.navigate().refresh();
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
System.setProperty("webdriver.chrome.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();

  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
