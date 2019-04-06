package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//strong[text()='English']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("searchInput")).sendKeys("Prateek Kuhad");
		driver.findElement(By.id("searchButton")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
