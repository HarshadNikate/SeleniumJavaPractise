package handlingkeyboardeventspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryContextClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclickbtn = driver.findElement(By.xpath("//span[contains(@class,'context-menu-one btn btn-neutral')]"));
		Actions action = new Actions(driver);
		action.contextClick(rightclickbtn).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.ARROW_DOWN)
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.ARROW_DOWN)
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.ARROW_DOWN)
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.ENTER)
		.perform();
	}

}
