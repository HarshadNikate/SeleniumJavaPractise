package tests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register {
	
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
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
	
	@Test(priority=1)
	public void verifyRegisterAccountUsingMandatoryFields()
	{
		
		driver.findElement(By.id("input-firstname")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id("input-lastname")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.id("input-email")).sendKeys(generateEmailWithTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validpassword"));
		driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("confirmpassword"));
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String ExpectedTitle ="Logout";
		String logout = driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Logout']")).getText();
		Assert.assertEquals(logout, ExpectedTitle);
		 
		//boolean logout = driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Logout']")).isDisplayed();
		//Assert.assertTrue(logout);
		
     }
	
	   @Test(priority=2)
	   public void verifyRegisterAccountUsingAllFields()
	   {
			
			driver.findElement(By.id("input-firstname")).sendKeys(prop.getProperty("firstname"));
			driver.findElement(By.id("input-lastname")).sendKeys(prop.getProperty("lastname"));
			driver.findElement(By.id("input-email")).sendKeys(generateEmailWithTimeStamp());
			driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("telephone"));
			driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validpassword"));
			driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("confirmpassword"));
			driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
			driver.findElement(By.xpath("//input[@name='agree']")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			
			String ExpectedTitle ="Logout";
			String logout = driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Logout']")).getText();
			Assert.assertEquals(logout, ExpectedTitle);
		    
	   }
	        @Test(priority=3)
	        public void verifyRegisterAccountWithoutAnyDetails()
	        {
	        	
				driver.findElement(By.xpath("//input[@value='Continue']")).click();
				
				String ExpectedFirstNameWarningMsg = "First Name must be between 1 and 32 characters!";
				String ExpectedLastNameWarningMsg = "Last Name must be between 1 and 32 characters!";
				String ExpectedEmailWarningMsg = "E-Mail Address does not appear to be valid!";
				String ExpectedTelephoneWarningMsg = "Telephone must be between 3 and 32 characters!";
				String ExpectedPasswordWarningMsg = "Password must be between 4 and 20 characters!";
				String ExpectedPrivacyPolicyWarningMsg = "Warning: You must agree to the Privacy Policy!";
                Assert.assertEquals(driver.findElement(By.xpath("//*[@id='input-firstname']/following-sibling::div")).getText(), ExpectedFirstNameWarningMsg);				
                Assert.assertEquals(driver.findElement(By.xpath("//*[@id='input-lastname']/following-sibling::div")).getText(), ExpectedLastNameWarningMsg);
                Assert.assertEquals(driver.findElement(By.xpath("//*[@id='input-email']/following-sibling::div")).getText(), ExpectedEmailWarningMsg);
                Assert.assertEquals(driver.findElement(By.xpath("//*[@id='input-telephone']/following-sibling::div")).getText(), ExpectedTelephoneWarningMsg);
                Assert.assertEquals(driver.findElement(By.xpath("//*[@id='input-password']/following-sibling::div")).getText(), ExpectedPasswordWarningMsg);

                Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains(ExpectedPrivacyPolicyWarningMsg));
               // Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText(),ExpectedPrivacyPolicyWarningMsg);
              //  System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText());
                
	        }
	        
	        public String generateEmailWithTimeStamp() {
	        	
				return "santu"+new java.util.Date().toString().replaceAll(" ","_").replaceAll(":","_")+"@gmail.com";
	        	
	        }
	        
	        @Test
	        public void verifyRegisterWithKeyBoard() throws InterruptedException
	        {
	        	Actions action = new Actions(driver);
	        	driver.findElement(By.id("input-firstname")).sendKeys("Akshay");
	        	action.sendKeys(Keys.TAB).sendKeys("Kumar").sendKeys(Keys.TAB).sendKeys(generateEmailWithTimeStamp()).sendKeys(Keys.TAB)
	        	.sendKeys("763475874").sendKeys(Keys.TAB).sendKeys("12345").sendKeys(Keys.TAB).sendKeys("12345").sendKeys(Keys.TAB)
	        	.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.ENTER).build().perform();
	        	Thread.sleep(1000);
	        	
	        	String ExpectedTitle ="Logout";
	    		String logout = driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Logout']")).getText();
	    		Assert.assertEquals(logout, ExpectedTitle);
	        }
	       

}
