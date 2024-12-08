package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String omayowindow = driver.getWindowHandle();
		WebElement link = driver.findElement(By.linkText("Blogger"));
		link.click();
		
		Set<String> windowids = driver.getWindowHandles();
		
		for(String windowid : windowids)
		{
			driver.switchTo().window(windowid);
			String expectedtitle="Blogger.com - Create a unique and beautiful blog easily.";
			String actualtitle = driver.getTitle();
			
			if(expectedtitle.equals(actualtitle))
			{
				break;
			}
		}
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='sign-in ga-header-sign-in']"));
		signin.click();
		Thread.sleep(3000);
		
		driver.close();
		
		driver.switchTo().window(omayowindow);
		WebElement textarea = driver.findElement(By.id("ta1"));
		textarea.sendKeys("hello harshad bhai here");
		Thread.sleep(3000);
		
		driver.close();

	}

}
