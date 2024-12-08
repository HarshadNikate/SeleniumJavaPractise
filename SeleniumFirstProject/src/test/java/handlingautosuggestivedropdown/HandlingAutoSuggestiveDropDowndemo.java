package handlingautosuggestivedropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAutoSuggestiveDropDowndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("lap");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("two-pane-results-container")));
		searchbox.sendKeys(Keys.ARROW_DOWN);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		searchbox.sendKeys(Keys.ENTER);
		
	}

}
