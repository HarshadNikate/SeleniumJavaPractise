package javascriptexecutordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RefreshingPageMultipleWaysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textareafield = driver.findElement(By.id("ta1"));
		textareafield.sendKeys("Harry here");
		
		//driver.navigate().refresh();
		//driver.navigate().to("https://omayo.blogspot.com/");
		
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.F5).perform();
		
        // driver.get(driver.getCurrentUrl());	
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("history.go(0)");
		jse.executeScript("location.reload()");
	}

}
