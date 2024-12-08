package fconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
	
	WebDriver driver= null;
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void setUp()
	{
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			
			WebElement accountbtn = driver.findElement(By.xpath("//span[text()='My Account']"));
			accountbtn.click();
			
			WebElement login = driver.findElement(By.linkText("Login"));
			login.click();
	}

	@Test(priority=1)                                        //(enabled=false)
	public void loginWithvalidcredentials()
	{
		//int i=1;
		//if(i==1)
		
		//throw new SkipException("Intentionally skkiped the test from exeption");
		
		
		WebElement emailfield = driver.findElement(By.id("input-email"));
		emailfield.sendKeys("Hpn8898@gmail.com");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("Hpn123");
		
		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login']"));
		loginbtn.click();
		
		String ExpectedTitle = "My Account";
		String ActualTitle = driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		}
	
	@Test(priority=2)
	public void LoginWithValidEmailAndInvalidPassword()
	{
        
		WebElement emailfield = driver.findElement(By.id("input-email"));
		emailfield.sendKeys("Hpn8898@gmail.com");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("Hpn12345");
		
		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login']"));
		loginbtn.click();
		
		String ExpectedWarningMsg = "Warning: No match for E-Mail Address and/or Password.";
		String ActualMsg = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')] ")).getText();
		//System.out.println(ActualMsg);
		Assert.assertEquals(ExpectedWarningMsg, ActualMsg);	
	}
	
	@Test(priority=3)
	public void LoginWithInvalidEmailAndValidPassword()
	{
		
			WebElement emailfield = driver.findElement(By.id("input-email"));
			emailfield.sendKeys("Hpn8898fdsg@gmail.com");
			
			WebElement password = driver.findElement(By.id("input-password"));
			password.sendKeys("Hpn123");
			
			WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login']"));
			loginbtn.click();
			
			String ExpectedWarningMsg = "Warning: No match for E-Mail Address and/or Password.";
			String ActualMsg = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')] ")).getText();
			//System.out.println(ActualMsg);
			Assert.assertEquals(ExpectedWarningMsg, ActualMsg);	
	}
	
	@Test(priority=4)
	public void LoginWithInvalidCredentials()
	{
		
		WebElement emailfield = driver.findElement(By.id("input-email"));
		emailfield.sendKeys("hsdh@gmail.com");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("fffrgv123");
		
		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login']"));
		loginbtn.click();
		
		String ExpectedWarningMsg = "Warning: No match for E-Mail Address and/or Password.";
		String ActualMsg = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')] ")).getText();
		//System.out.println(ActualMsg);
		Assert.assertEquals(ExpectedWarningMsg, ActualMsg);
	}
	
	@Test(priority=5)
	public void LoginWithoutEnteringAnyCredentials()
	{
		
		WebElement emailfield = driver.findElement(By.id("input-email"));
		emailfield.sendKeys("");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("");
		
		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login']"));
		loginbtn.click();
		
		String ExpectedWarningMsg = "Warning: No match for E-Mail Address and/or Password.";
		String ActualMsg = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')] ")).getText();
		//System.out.println(ActualMsg);
		Assert.assertEquals(ExpectedWarningMsg, ActualMsg);
	}
	
	
}
