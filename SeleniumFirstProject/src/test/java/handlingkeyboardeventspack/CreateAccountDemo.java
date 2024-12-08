package handlingkeyboardeventspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		WebElement firstnameElement = driver.findElement(By.id("input-firstname"));
		firstnameElement.sendKeys("Roshan");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys("Kapoor")
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("Rpn8898@gmail.com")
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("889878945")
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("Hpn123")
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("Hpn123")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.SPACE)
		.sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
		.build().perform();
		
		
		
		
		
	}
	
	

}
