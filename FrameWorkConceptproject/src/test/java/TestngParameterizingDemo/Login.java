package TestngParameterizingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	
	WebDriver driver ;
	
	@BeforeMethod
	public void setUp()
	{
		new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void LoginWithValidCredentials()
	{
		
	    Assert.assertTrue(true);
	  
	}
	
	@Test
	public void LoginWithInValidCredentials()
	{
		
	    Assert.assertTrue(true);
	  
	}
	
	@Test
	public void LoginWithValidEmailAndInvalidPassword()
	{
		
	    Assert.assertTrue(true);
	    
	}
	
	@Test
	public void LoginWithInValidEmailAndValidPassword()
	{
		
	    Assert.assertTrue(true);
	    
	}
	
	@Test
	public void LoginWithOutCredentials()
	{
		
	    Assert.assertTrue(true);
	   
	}
	
	
}
