package scripts.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  
	
	@Test
  
  public void TestNGConfig1() {
	  
	  System.out.println("config 1");
  }
  
  @Test
  public void TestNGConfig2() {
	  
	  System.out.println("config 2");
  }
  
  @Test
  public void TestNGConfig3() {
	  
	  System.out.println("config 3");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("inside before method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("insider after method of TestNG Config");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("insider before class of TestNG Config");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("insider after class of TestNG Config");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("insider before test of TestNG Config");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("insider after test of TestNG Config");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("insider before suit of TestNG Config");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("insider after suit of TestNG Config");
  }

}
