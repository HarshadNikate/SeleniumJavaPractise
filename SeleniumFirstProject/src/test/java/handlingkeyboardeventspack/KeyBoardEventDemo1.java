package handlingkeyboardeventspack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement linkElement = driver.findElement(By.linkText("compendiumdev"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(linkElement).keyUp(Keys.CONTROL).perform();
        }

}
