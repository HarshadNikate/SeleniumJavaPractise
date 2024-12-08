package tests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
        Properties prop=null;
		
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
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void verifySearchingForExistingProduct()
	{
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("HP");
		driver.findElement(By.xpath("//input[@name='search']/following-sibling::span")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		
	}
	
	@Test
	public void verifySearchingForNonExistingProduct()
	{
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Honda");
		driver.findElement(By.xpath("//input[@name='search']/following-sibling::span")).click();
		
		String ExpectedMsg = "There is no product that matches the search criteria.";
		
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p")).getText(), ExpectedMsg);
		
	}
	
}
