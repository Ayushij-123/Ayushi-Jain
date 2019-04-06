package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.testng.annotations.AfterMethod;

public class YahooLoginTest {
 
	YahooLoginPO myLogin;
	
	
	
	@Test
  public void yahoologintest() {
	  
		myLogin.login("a.jain93","April@123");
		assertTrue(myLogin.getTitle().contains("login"));
	  
	}
  @BeforeMethod
  public void beforeMethod() {
	  
	  myLogin = new YahooLoginPO();
	  myLogin.get();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  myLogin.close();
  }

}
