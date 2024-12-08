package actionmousekeyboardeventsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement blogsmenu = driver.findElement(By.id("blogsmenu"));
		
		Actions action = new Actions(driver);
		action.moveToElement(blogsmenu).build().perform();
		
		
		
	}

}
