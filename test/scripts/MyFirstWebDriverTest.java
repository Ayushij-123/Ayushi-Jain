package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstWebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\geckodriver-64bit.exe");
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://selenium-examples.nichethyself.com/");
		WebElement username = driver.findElement(By.id("loginname"));
		username.sendKeys("stc123");
		driver.findElement(By.id("loginpassword")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		
		String expectedTitle = "My account";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
			
			System.out.println("Login test case passed");
		
		else 
			System.out.println("Failed");
		
		
		
		
		
	}

	
}
