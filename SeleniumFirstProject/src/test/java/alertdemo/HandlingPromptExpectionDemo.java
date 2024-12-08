package alertdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingPromptExpectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement propmtalertbtn=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		propmtalertbtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		String alertmsg=alert.getText();
		System.out.println(alertmsg);
		
		alert.sendKeys("Harrybhai");
		alert.accept();
		
		WebElement txt=driver.findElement(By.id("result"));
		String msg=txt.getText();
		System.out.println(msg);
         driver.quit();
	}

}
