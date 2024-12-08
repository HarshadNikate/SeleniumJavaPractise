package tests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	Properties prop=null;
	
	@BeforeMethod
	public void setup()
	{
		
		
		try {
		    prop = new Properties();
			File propFile= new File(System.getProperty("user.dir")+"//src//test//java//properties//projectdata.properties");
			FileReader fr = new FileReader(propFile);
		    prop.load(fr);
			}catch(IOException e){
				 e.printStackTrace();
			 }
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test(priority=1)
	public void verifyLoginWithValidCredentials()
	{
		
		
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validpassword2"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	@Test(priority=2)
	public void verifyLoginWithInValidCredentials()
	{
		driver.findElement(By.id("input-email")).sendKeys(generateEmailWithTimeStamp());
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("invalidPassword"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String ExpectedWarningMsg = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText()
				.contains(ExpectedWarningMsg));
				
	}
	
	@Test(priority=3)
	public void verifyLoginWithInValidEmailValidPassword()
	{
		driver.findElement(By.id("input-email")).sendKeys(generateEmailWithTimeStamp());
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validpassword2"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String ExpectedWarningMsg = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText()
				.contains(ExpectedWarningMsg));
				
	}
	
	@Test(priority=4)
	public void verifyLoginWithValidEmailInValidPassword() throws InterruptedException
	{
		driver.findElement(By.id("input-email")).sendKeys(getRandomValidEmail());
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("invalidPassword"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(10000);
		
		String ExpectedWarningMsg = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText()
				.contains(ExpectedWarningMsg));
				
	}
	
	@Test(priority=5)
	public void verifyLoginWithOutEmailAndPassword()
	{
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String ExpectedWarningMsg = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText()
				.contains(ExpectedWarningMsg));
				
	}
	
	
	
	
	public String generateEmailWithTimeStamp() {
    	
		return "bunny1234"+new java.util.Date().toString().replaceAll(" ","_").replaceAll(":","_")+"@gmail.com";
    	
    }
	
	public String getRandomValidEmail()
	{
		String[]ValidEmails= {"amotooricap1@gmail.com","amotooricap2@gmail.com","amotooricap3@gmail.com","amotooricap4@gmail.com","amotooricap5@gmail.com"
				,"amotooricap6@gmail.com","amotooricap7@gmail.com","amotooricap8@gmail.com"};
	
		return ValidEmails[new Random().nextInt(8)];
	}
    

}
