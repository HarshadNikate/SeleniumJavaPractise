package alertdemo;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnHandledAlertExpectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	WebElement jsalertbtn=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
	jsalertbtn.click();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	
	Alert alert=driver.switchTo().alert();
	String msg=alert.getText();
	System.out.println(msg);
	
	// below two activity causes unhandledexpection
	
	//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	driver.close();
	}

}
