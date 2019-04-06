package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQAJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Ayushi");
		driver.findElement(By.name("lastname")).sendKeys("Jain");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.xpath("//input[@value='3']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("datepicker")).sendKeys("26-03-2019");
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium IDE']")).click();
		
		Thread.sleep(3000);
		
		Select drpContinent = new Select(driver.findElement(By.id("continents")));
		drpContinent.selectByVisibleText("Africa");
		
		Select seleniumCommand = new Select(driver.findElement(By.id("selenium_commands")));
		seleniumCommand.selectByVisibleText("Switch Commands");
		
		driver.findElement(By.className("button"));
		
		Thread.sleep(3000);
		
		System.out.println("User is successfully registered!!");
		
		
		
		driver.close();
		
}

}
