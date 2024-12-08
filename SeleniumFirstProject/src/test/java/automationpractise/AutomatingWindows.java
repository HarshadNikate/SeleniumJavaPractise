package automationpractise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/* WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		WebElement clickbtn=driver.findElement(By.id("home"));
		clickbtn.click();
		String mainwindow =driver.getWindowHandle();
		
		Set<String> windowids = driver.getWindowHandles();
		
		for(String windowid : windowids)
		{
			driver.switchTo().window(windowid);
			String expectedtitle="LetCode - Testing Hub";
			String actualtitle=driver.getTitle();
			String homewindow = null;
			
			
			if(expectedtitle.equals(actualtitle))
			{
				System.out.println(actualtitle);
				String hw= homewindow;
				break;
			}
	
			}
		
		driver.switchTo().window(mainwindow);
		driver.close();
		
		Thread.sleep(3000);
		driver.quit();  */
		
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://letcode.in/windows");
		WebElement mulwinbtn = driver2.findElement(By.id("multi"));
		mulwinbtn.click();
		
		Set<String> mulwindowids = driver2.getWindowHandles();
		
		for(String windowids1: mulwindowids)
		{
			driver2.switchTo().window(windowids1);
			driver2.getTitle();
			System.out.println(driver2.getTitle());
		}
		
		driver2.quit();
		
			
		}
		
		}


