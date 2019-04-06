package scripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class YahooLoginPO extends LoadableComponent<YahooLoginPO> {


	
	@FindBy (id ="login-username")
	private WebElement username;
	
	@FindBy (id = "login-passwd")
	private WebElement password;
	
	@FindBy (id = "login-signin")
	private WebElement login;
	
	private WebDriver driver;
	
	private String expectedTitle = "login";
	
	public YahooLoginPO() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium 2019\\webdrivertraining\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	public void login(String uname,String pass) {
		username.clear();
		username.sendKeys(uname);
		username.sendKeys(pass);
		login.click();
	}
	
	public String getTitle() {
		
		return driver.getTitle();
	}
	
	public void close() {
		driver.quit();
		}
	
	
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		driver.get("https://login.yahoo.com/");
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
	
		
		assertTrue(driver.getTitle().contains("expectedTitle"));
	}

	
	
	
	
	
	
}
