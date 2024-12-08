package handlingcookies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCookiesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.whitehouseblackmarket.com/store");
		WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement acceptallcookiesbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Accept All Cookies']")));
		
		//acceptallcookiesbtn.click();
		WebElement managecookiesbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onetrust-pc-btn-handler']")));
		managecookiesbtn.click();
		WebElement functioncookiestoggleswitch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Functional Cookies']/preceding-sibling::span")));
		functioncookiestoggleswitch.click();
		
		Thread.sleep(3000);
		WebElement confirmmychoicebtn = driver.findElement(By.xpath("//button[text()='Confirm My Choices']"));
		confirmmychoicebtn.click();
		
		
	driver.quit();

	}

}
