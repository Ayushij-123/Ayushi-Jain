package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class MyFirstTestNG {
	
 WebDriver driver;
 
  @Test
  
  
  public void SeleniumExampleOfTestNG() {
	  
	    
		driver.get("https://selenium-examples.nichethyself.com/");
		WebElement username = driver.findElement(By.id("loginname"));
		username.sendKeys("stc123");
		driver.findElement(By.id("loginpassword")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		
		String expectedTitle = "My account1";
		String actualTitle = driver.getTitle();
		
	/*	if(expectedTitle.equals(actualTitle))
			
			System.out.println("Login test case passed");
		
		else 
			System.out.println("Failed");
			*/
		
		assertEquals(actualTitle, expectedTitle,"Login Failed");
	  
  }
  
  @Test 
  
  public void googleSearchTest() throws InterruptedException {
	  
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Jobs in Selenium");
	  Thread.sleep(5000);
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 // System.setProperty("webdriver.gecko.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\geckodriver-64bit.exe");
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }
  
  @BeforeClass
  
  public void beforeClass() {
	  
   	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }
  
  @AfterClass
  
  public void afterClass() {
	  
	  driver.quit();
  }
  

}
