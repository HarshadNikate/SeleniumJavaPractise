package handlingkeyboardeventspack;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAccountAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement EmailElement = driver.findElement(By.id("input-email"));
		EmailElement.sendKeys("Hpn8898@gmail.com");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys("Hpn123").sendKeys(Keys.ENTER).build().perform();
		
		Set<String> windows = driver.getWindowHandles();
		
		
		for(String window:windows)
		{
			
			String ExpectedTitle = "Account Logout";
			driver.switchTo().window(window);
			String ActualTitle = driver.getTitle();
			
			if(ActualTitle.equals(ExpectedTitle))
			{
				break;
			}
		}
	
		
		
		WebElement Myaccountbtn = driver.findElement(By.xpath("//span[text()='My Account']"));
		Myaccountbtn.click();
		/*
		Thread.sleep(10000);
		WebElement logoutbtn = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']"));
		logoutbtn.click();   */
	

		
		
	
		//WebElement logoutbtn = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']"));

		action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys(Keys.ENTER).build().perform();
	}

	
	}

